/*
 * Created on 2010-mar-29
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package pojo;
import java.rmi.RemoteException;
import java.sql.Timestamp;

import todobeans.*;

/**
 * @author inf08ami
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class Todo {
	private String todoName;
	private Timestamp startTime;
	private Timestamp endTime;
	private String comment;
	private int id;
	private boolean completed;
	private String category;

	public Todo(String name) {
		this.todoName = name;
	}

	public static void createInstance(String todoName, Timestamp startTime, Timestamp endTime, String userName, int categoryId, String comment) {
		try {
			Connection.getFacade().addTodo(todoName, startTime, endTime, userName, categoryId, comment);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void updateInstance(int todoId, String todoName, Timestamp startTime, Timestamp endTime, String userName, int categoryId, String comment) {
			try { 
				Connection.getFacade().updateTodo(todoId, todoName, startTime, endTime, userName, categoryId, comment);
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	public static void removeTodos(int[] todoIds) {
		try {
			Connection.getFacade().removeTodos(todoIds);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * @return
	 */
	public String getTodoName() {
		return todoName;
	}

	/**
	 * @param string
	 */
	public void setTodoName(String string) {
		todoName = string;
	}

	/**
	 * @return
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * @return
	 */
	public Timestamp getEndTime() {
		return endTime;
	}

	/**
	 * @return
	 */
	public Timestamp getStartTime() {
		return startTime;
	}

	/**
	 * @param string
	 */
	public void setComment(String string) {
		comment = string;
	}

	/**
	 * @param timestamp
	 */
	public void setEndTime(Timestamp timestamp) {
		endTime = timestamp;
	}

	/**
	 * @param timestamp
	 */
	public void setStartTime(Timestamp timestamp) {
		startTime = timestamp;
	}

	/**
	 * @return
	 */
	public boolean isCompleted() {
		return completed;
	}

	/**
	 * @return
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param b
	 */
	public void setCompleted(boolean b) {
		completed = b;
	}

	/**
	 * @param i
	 */
	public void setId(int i) {
		id = i;
	}

	/**
	 * @return
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param string
	 */
	public void setCategory(String string) {
		category = string;
	}

}
