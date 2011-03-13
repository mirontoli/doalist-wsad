/*
 * Created on 2010-apr-05
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package pojo;

import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 * @author Anatoly
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class Category {
	private int id;
	private String categoryName;
	public Category(int id, String categoryName) {
		this.id = id;
		this.categoryName = categoryName;
	}
	public static java.util.ArrayList getAllCategories() {
		java.util.ArrayList categories = new java.util.ArrayList();
		java.util.ArrayList categoriesHM = null;
		try {
			 categoriesHM = (ArrayList) Connection.getFacade().getAllCategories();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(categoriesHM != null) {
			System.out.println("hej ifrån pojo.Category. categoriesHM har storlek: " + categoriesHM.size());
			java.util.Iterator iter = categoriesHM.iterator();
			while(iter.hasNext()) {
				java.util.HashMap catHM= (java.util.HashMap) iter.next();
				int catId = ((Integer) catHM.get("categoryID")).intValue();
				String catName = (String) catHM.get("categoryName");
				Category cat = new Category(catId, catName);
				categories.add(cat);
			}
		}
		return categories;
	}
	/**
	 * @return
	 */
	public String getCategoryName() {
		return categoryName;
	}

	/**
	 * @return
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param string
	 */
	public void setCategoryName(String string) {
		categoryName = string;
	}

	/**
	 * @param i
	 */
	public void setId(int i) {
		id = i;
	}

}
