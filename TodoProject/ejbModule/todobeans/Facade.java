package todobeans;
import todobeans.PersonLocal;
import java.util.ArrayList;
import java.sql.Timestamp;
import java.util.HashMap;
/**
 * Remote interface for Enterprise Bean: Facade
 */
public interface Facade extends javax.ejb.EJBObject {
	public PersonLocal getUser(
		java.lang.String userName,
		java.lang.String password)
		throws java.rmi.RemoteException;
	public String getEmail(String userName, String password)
		throws java.rmi.RemoteException;
	public ArrayList getTodosForAUser(String userName, String password)
		throws java.rmi.RemoteException;
	/*
	public int getLastTodoId() {
		int lastId = 0;
		try {
			ArrayList c = new ArrayList();
			c.addAll(todoHome.findAllIds());
			System.out.println(" id kanske: " + ((todobeans.TodoKey)(c.get(c.size()-1))).id);
			System.out.println(c.get(c.size()-1));
			String id = "" + c.get(c.size()-1);
			lastId = Integer.parseInt(id);
		} catch (FinderException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lastId;
	}
	/**
	 * This is our method to get all categories
	 */
	public java.util.Collection getAllCategories()
		throws java.rmi.RemoteException;
	public void addTodo(
		String todoName,
		Timestamp startTime,
		Timestamp endTime,
		String userName,
		int categoryId,
		String comment)
		throws java.rmi.RemoteException;
	public HashMap getPerson(String userName, String password)
		throws java.rmi.RemoteException;
	public void removeTodos(int[] todoIds) throws java.rmi.RemoteException;
	public void updateTodo(
		int todoId,
		String todoName,
		Timestamp startTime,
		Timestamp endTime,
		String userName,
		int categoryId,
		String comment)
		throws java.rmi.RemoteException;
	public void addUser(
		String userName,
		String password,
		String firstName,
		String lastName,
		String emailAddress)
		throws java.rmi.RemoteException;
}
