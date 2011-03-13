package todobeans;

import javax.ejb.CreateException;
import javax.ejb.EJBException;
import javax.ejb.FinderException;
import javax.ejb.RemoveException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import java.sql.Timestamp;
import java.util.*;

import com.ibm.websphere.csi.EJBInfoFactory;

/**
 * Bean implementation class for Enterprise Bean: Facade
 */
public class FacadeBean implements javax.ejb.SessionBean {
	PersonLocalHome personHome;
	TodoLocalHome todoHome;
	CategoryLocalHome categoryHome;
	InitialContext ctx;

	private javax.ejb.SessionContext mySessionCtx;
	/**
	 * getSessionContext
	 */
	public javax.ejb.SessionContext getSessionContext() {
		return mySessionCtx;
	}
	/**
	 * setSessionContext
	 */
	public void setSessionContext(javax.ejb.SessionContext ctx) {
		mySessionCtx = ctx;
	}
	/**
	 * ejbCreate
	 */
	public void ejbCreate() throws javax.ejb.CreateException {
		initLocalHomes();
	}
	private void initLocalHomes() {
		try {
			ctx = new InitialContext();
			personHome =
				(PersonLocalHome) ctx.lookup("java:comp/env/ejbPersonRef");
			todoHome = (TodoLocalHome) ctx.lookup("java:comp/env/ejbTodoRef");
			categoryHome =
				(CategoryLocalHome) ctx.lookup("java:comp/env/ejbCategoryRef");
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public HashMap getPerson(String userName, String password) {
		HashMap personHM = null;
		PersonLocal p = null;
		try {
			p = personHome.findByPrimaryKey(userName);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		if (p != null && p.isPasswordCorrect(password)) {
			personHM = new HashMap();
			personHM.put("userName", userName);
			personHM.put("password", password);
			personHM.put("firstName", p.getFirstName());
			personHM.put("lastName", p.getLastName());
			personHM.put("emailAddress", p.getEmailAddress());
		}
		return personHM;
	}
	public PersonLocal getUser(String userName, String password) {
		PersonLocal p = null;
		String email;
		try {
			p = personHome.findByPrimaryKey(userName);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		//validate user
		if (p != null && !p.getPassword().equals(password)) {
			// om lösenord inte stämmer radera referensen
			p = null;
		}
		return p;
	}
	
	public String getEmail(String userName, String password) {
		String email = "";
		PersonLocal p = getUser(userName, password);
		if (p != null) {
			email = p.getEmailAddress();
		} else {
			System.out.println("kan inte hitta personen");
		}
		return email;
	}
	public void addUser(String userName, String password, String firstName, String lastName, String emailAddress) {
		PersonLocal p = null;
		try {
			p = personHome.create(userName);
		} catch (CreateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (p != null) {
			p.setPassword(password);
			p.setFirstName(firstName);
			p.setLastName(lastName);
			p.setEmailAddress(emailAddress);
		}
		
	}
	public void addTodo(String todoName, Timestamp startTime, 
						Timestamp endTime, String userName, int categoryId, String comment) {
		TodoLocal todo = null;
		PersonLocal person = null;
		CategoryLocal category = null;

		try {
			todo = todoHome.create(getLastTodoId() + 1);
			person = personHome.findByPrimaryKey(userName);
			category =
				categoryHome.findByPrimaryKey(new CategoryKey(categoryId));
		} catch (CreateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FinderException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (todo != null) {
			todo.setTodoName(todoName);
			todo.setStartTime(startTime);
			todo.setEndTime(endTime);			
			todo.setPerson(person);
			todo.setCategory(category);
			todo.setComment(comment);
		}
	}
	public void updateTodo(String todoName, Timestamp startTime, 
							Timestamp endTime, String userName, int categoryId, String comment) {
			//skrota den metoden efter deploy
		}
	public void updateTodo(int todoId, String todoName, Timestamp startTime, 
							Timestamp endTime, String userName, int categoryId, String comment) {
			TodoLocal todo = null;
			CategoryLocal category = null;

			try {
				todo = todoHome.findByPrimaryKey(new TodoKey(todoId));
				category =
					categoryHome.findByPrimaryKey(new CategoryKey(categoryId));
			} catch (FinderException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (todo != null) {
				todo.setTodoName(todoName);
				todo.setStartTime(startTime);
				todo.setEndTime(endTime);			
				todo.setCategory(category);
				todo.setComment(comment);
			}
		}
	public ArrayList getTodosForAUser(String userName, String password) {
		ArrayList todolist = new ArrayList();
		PersonLocal p = null;
		try {
			p = personHome.findByPrimaryKey(userName);
		} catch (FinderException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (p != null) {
			ArrayList personTodos = (ArrayList) p.getTodos();
			for (int i = 0; i < personTodos.size(); i++) {
				TodoLocal todo = (TodoLocal) personTodos.get(i);
				HashMap todoHM = new HashMap();
				todoHM.put("todoID", Integer.toString(todo.getId()));
				todoHM.put("todoName", todo.getTodoName());
				todoHM.put("startTime", todo.getStartTime());
				todoHM.put("endTime", todo.getEndTime());
				String category = "";
				if (todo.getCategory() != null) {
					category = todo.getCategory().getCategoryName();
				}
				todoHM.put("category", category);
				todoHM.put("comment", todo.getComment());
				todolist.add(todoHM);
			}
		}
		return todolist;
	}

	public int getLastTodoId() {
		int lastId = 0;
		try {
			lastId = todoHome.findTodoLocalWithMaxId().getId();
		} catch (FinderException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lastId;
	}
	/**
	 * This is our method to get all categories
	 */
	public Collection getAllCategories() {
		ArrayList categories = new ArrayList();
		Collection c = null;
		try {
			c = categoryHome.findAll();
		} catch (FinderException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (c != null) {
			System.out.println("hej från FacadeBean");
			Iterator iter = c.iterator();
			while (iter.hasNext()) {
				HashMap categoryHM = new HashMap();
				CategoryLocal categoryLocal = (CategoryLocal) iter.next();
				categoryHM.put(
					"categoryID",
					new Integer(categoryLocal.getId()));
				categoryHM.put("categoryName", categoryLocal.getCategoryName());
				categories.add(categoryHM);
			}
		}

		return categories;
	}
	public void removeTodos(int[] todoIds) {
		for (int i = 0; i < todoIds.length; i++) {
			try {
				TodoLocal todo = todoHome.findByPrimaryKey(new TodoKey(todoIds[i]));
				todo.remove();
			} catch (EJBException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (FinderException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (RemoveException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	/**
	 * ejbActivate
	 */
	public void ejbActivate() {
	}
	/**
	 * ejbPassivate
	 */
	public void ejbPassivate() {
	}
	/**
	 * ejbRemove
	 */
	public void ejbRemove() {
	}
}
