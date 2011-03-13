/*
 * Created on 2010-mar-29
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package pojo;

import java.util.ArrayList;

/**
 * @author inf08ami
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class TodoList extends ArrayList {
	public TodoList() {
		
	}
	public void loadTestData() {
		add(new Todo("testa"));
		add(new Todo("resa"));
	}
}
