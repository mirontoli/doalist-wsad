/*
 * Created on 2010-apr-02
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package pojo;

import java.rmi.RemoteException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import javax.ejb.CreateException;


/**
 * @author Anatoly
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class Person {
	private String userName, password, firstName, lastName, emailAddress;
	private ArrayList todoList;
	
	private Person(String userName) {
		this.userName = userName;
	}
	public static Person getPerson(String userName, String password) {
		Person p = null;
		HashMap personHM = null;
		try {
			personHM = Connection.getFacade().getPerson(userName, password);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (personHM != null) {
			p = new Person( (String) personHM.get("userName") );
			p.setPassword( (String) personHM.get("password") );
			p.setFirstName( (String) personHM.get("firstName") );
			System.out.println("hej från pojo.Person: firstName är " + p.getFirstName());
			p.setLastName( (String) personHM.get("lastName") );
			p.setEmailAddress( (String) personHM.get("emailAddress") );
		}
		
		/*
			String email = "";
			try {
				email = Connection.getFacade().getEmail(userName, password);
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (email != null && email != "") {
				p = new Person(userName);
			}

		*/
		return p;
	}
	/**
	 * @return
	 */
	public String getEmailAddress() {
		return emailAddress;
	}

	/**
	 * @return
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @return
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param string
	 */
	public void setEmailAddress(String string) {
		emailAddress = string;
	}

	/**
	 * @param string
	 */
	public void setPassword(String string) {
		password = string;
	}

	/**
	 * @param string
	 */
	public void setUserName(String string) {
		userName = string;
	}

	public void updateTodoList() {
		ArrayList todoListHM = null;
		try {
			todoListHM = Connection.getFacade().getTodosForAUser(userName, password);				
			
		} catch (RemoteException e) {
			System.out.println("det sket sig!!");
			e.printStackTrace();
		}
		if(todoListHM != null) {
			todoList = new ArrayList(); //in order to update
			for(int i = 0; i < todoListHM.size(); i++) {
				HashMap todoHM = (HashMap) todoListHM.get(i);
				Todo todo = new Todo((String)todoHM.get("todoName"));
				System.out.println("test pojo.person update todoList TodoName =" + todo.getTodoName());
				todo.setStartTime((Timestamp)todoHM.get("startTime"));
				todo.setEndTime((Timestamp) todoHM.get("endTime"));
				todo.setComment((String) todoHM.get("comment"));
				todo.setCategory( (String) todoHM.get("category"));
				todo.setId(Integer.parseInt((String) todoHM.get("todoID")));
				todoList.add(todo);
			}
		}
	}
	public Todo findTodo(int id) {
		Todo todo = null;
		Iterator iter = todoList.iterator();
		boolean found = false;
		while (!found && iter.hasNext()) {
			todo = (Todo) iter.next();
			if (todo.getId() == id) {
				found = true;
			}
		}
		if (!found) { // if still not found, there no such todo for the current user
			todo = null;
		}
		return todo;
	}


	/**
	 * @return
	 */
	public ArrayList getTodoList() {
		updateTodoList();
		return todoList;
	}


	/**
	 * @param list
	 */
	public void setTodoList(ArrayList list) {
		todoList = list;
	}

	/**
	 * @return
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @return
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param string
	 */
	public void setFirstName(String string) {
		firstName = string;
	}

	/**
	 * @param string
	 */
	public void setLastName(String string) {
		lastName = string;
	}

}
