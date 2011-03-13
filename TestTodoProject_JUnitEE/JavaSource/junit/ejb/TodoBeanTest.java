/*
 * Created on 2010-mar-31
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package junit.ejb;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.ejb.FinderException;
import javax.naming.*;
import javax.rmi.PortableRemoteObject;

import junit.framework.TestCase;

import todobeans.*;

/**
 * @author Anatoly
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class TodoBeanTest extends TestCase {
	Context ctx;
	String expectedName = "strippor till festen";
	Timestamp expectedStartTime = null;
	Timestamp expectedEndTime = null;
	String expectedComment = "glöm inte mejla dino";
	PersonLocal expectedPerson = null;
	CategoryLocal expectedCategory = null;
	int expectedId = 18;
	TodoLocal t1;
	TodoLocal t2;
	
	public TodoBeanTest(String name) {
		super(name);
	}
	
	protected void setUp() throws Exception {
		ctx = new InitialContext();
		TodoLocalHome home = null;
		try {
			home = (TodoLocalHome) ctx.lookup("java:comp/env/ejb/TodoRef");
			t1 = home.findByPrimaryKey(new TodoKey(expectedId));
		}
		catch (Exception e) {
			System.out.println(e.toString());
		}
		expectedStartTime = convertToTimestamp("2010-04-06 10:40:06.203");
		expectedEndTime = convertToTimestamp("2010-04-06 10:40:06.203");
		expectedPerson = pickPerson("sinan");
		expectedCategory = pickCategory(4);
		
	}
	public Timestamp convertToTimestamp(String time) {
		DateFormat dfm = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		Date date = new Date();
		try {
			date = dfm.parse(time);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Timestamp ts = new Timestamp(date.getTime());
		return ts;
	}
	public PersonLocal pickPerson (String name){
		PersonLocalHome home = null;
		PersonLocal p = null;
		try {
			home = (PersonLocalHome) ctx.lookup("java:comp/env/ejb/PersonRef");
			p = home.findByPrimaryKey(name);
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FinderException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p;
		
	}
	public CategoryLocal pickCategory(int id){
		CategoryLocal c1 = null;
		CategoryLocalHome home = null;
		try {
			home = (CategoryLocalHome) ctx.lookup("java:comp/env/ejb/CategoryRef");
			c1 = home.findByPrimaryKey(new CategoryKey(id));
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FinderException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c1;
	}
	
	protected void tearDown() throws Exception {
		t1 = null;
	}
	public void testGetId() {
		assertEquals(expectedId, t1.getId());
	}
	public void testSetId() {
		//not promoted to local interface.
	}
	public void testGetTodoName() {
		assertEquals(expectedName, t1.getTodoName());
	}
	public void testSetTodoName() {
		String expectedName2 = "Test";
		t1.setTodoName(expectedName2);
		assertEquals(expectedName2, t1.getTodoName());
		//roll back
		t1.setTodoName(expectedName);
	}
	public void testGetStartTime() {
		assertEquals(expectedStartTime, t1.getStartTime());
	}
	public void testSetStartTime() {
		Timestamp expectedStartTime2 = convertToTimestamp("2010-04-07 10:40:06.203");
		t1.setStartTime(expectedStartTime2);
		assertEquals(expectedStartTime2, t1.getStartTime());
		t1.setStartTime(expectedStartTime);
	}
	public void testGetEndTime() {
		assertEquals(expectedEndTime, t1.getEndTime());
	}
	public void testSetEndTime() {
		Timestamp expectedEndTime2 = convertToTimestamp("2010-04-07 10:40:06.203");
		t1.setEndTime(expectedEndTime2);
		assertEquals(expectedEndTime2, t1.getEndTime());
		t1.setEndTime(expectedEndTime);
	}
	public void testGetComment() {
		assertEquals(expectedComment, t1.getComment());
	}
	public void testSetComment() {
		String expectedComment2 = "TestComment";
		t1.setComment(expectedComment2);
		assertEquals(expectedComment2, t1.getComment());
		t1.setComment(expectedComment);
	}
	public void testGetPerson() {
		assertEquals(expectedPerson, t1.getPerson());
	}
	public void testSetPerson() {
		PersonLocal expectedPerson2 = pickPerson ("pontus");
		t1.setPerson(expectedPerson2);
		assertEquals(expectedPerson2, t1.getPerson());
		t1.setPerson(expectedPerson);
	}
	public void testGetCategory() {
		assertEquals(expectedCategory, t1.getCategory());
	}
	public void testSetCategory() {
		CategoryLocal expectedCategory2 = pickCategory(3);
		t1.setCategory(expectedCategory2);
		assertEquals(expectedCategory2, t1.getCategory());
		t1.setCategory(expectedCategory);
	}
	public void testEquals() {
		assertTrue(!t1.equals(null));
		assertEquals(t1, t1);
		assertTrue(!t1.equals(t2));
	}	
}
