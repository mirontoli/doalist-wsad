package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import pojo.*;

/**
 * @version 	1.0
 * @author Gud
 */
public class MainServlet extends HttpServlet {
	private static final String CONTENT_TYPE = "text/html; charset=UTF-8";

	/**
	* @see javax.servlet.http.HttpServlet#void (javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	*/
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
		doPost(req, resp);

	}

	/**
	* @see javax.servlet.http.HttpServlet#void (javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	*/
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
		req.setAttribute("goesThroughMainServlet", new Boolean(true));
		//this is in order to be able to track where requests come from
		//all request which invoke jsp-files directly will be stripped.
		//this will happen in include/validate.inc
		//all other validating will happen here, in Controller role MainServlet

		resp.setContentType(CONTENT_TYPE);
		pojo.Person user =
			(pojo.Person) req.getSession().getAttribute("loggedInAs");
		String url = "";
		String operation = req.getParameter("operation");
		if (operation != null) {
			if (operation.equals("newtodo") && user != null) {
				String todoName = req.getParameter("txttodo");

				// how to get Timestamp from date and time string
				// read this great article:
				// http://www.odi.ch/prog/design/datetime.php

				//start string
				String startDate = req.getParameter("datestart");
				String startTime = req.getParameter("txtstart");
				String startDateTimeString = startDate + " " + startTime;

				// end string
				String endDate = req.getParameter("datefinish");
				String endTime = req.getParameter("txtfinish");
				String endDateTimeString = endDate + " " + endTime;

				// date parsing
				DateFormat dfm = new SimpleDateFormat("yyyy-MM-dd HH:mm");
				dfm.setTimeZone(TimeZone.getTimeZone("Europe/Zurich"));
				Timestamp start = null;
				Timestamp end = null;
				try {
					start =
						new Timestamp(dfm.parse(startDateTimeString).getTime());
					end = new Timestamp(dfm.parse(endDateTimeString).getTime());
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				int categoryId = Integer.parseInt(req.getParameter("category"));
				String userName = user.getUserName();
				String comment = req.getParameter("txtcomment");

				Todo.createInstance(
					todoName,
					start,
					end,
					userName,
					categoryId,
					comment);
			} else if (operation.equals("login") && user == null) {
				String userName = req.getParameter("username");
				String password = req.getParameter("password");
				user = Person.getPerson(userName, password);
				if (user != null) {
					req.getSession().setAttribute("loggedInAs", user);
					url = "/todolist.jsp";

				} else {
					url = "/login.jsp";
					req.setAttribute(
						"errorMessage",
						"Fill in correct user name and password!");
				}
				System.out.println("username från formulär: " + userName);
			} else if (operation.equals("logout") && user != null) {
				req.getSession().invalidate();
				url = "login.jsp";

				req.setAttribute(
					"errorMessage",
					"Thank you for using Do-a-List. Welcome back!");
			} else if (operation.equals("changeTodo") && user != null) {
				String todoName = req.getParameter("txttodo");
				int todoId = Integer.parseInt(req.getParameter("id"));

				//start string
				String startDate = req.getParameter("datestart");
				String startTime = req.getParameter("txtstart");
				String startDateTimeString = startDate + " " + startTime;

				// end string
				String endDate = req.getParameter("datefinish");
				String endTime = req.getParameter("txtfinish");
				String endDateTimeString = endDate + " " + endTime;

				// date parsing
				DateFormat dfm = new SimpleDateFormat("yyyy-MM-dd HH:mm");
				dfm.setTimeZone(TimeZone.getTimeZone("Europe/Zurich"));
				Timestamp start = null;
				Timestamp end = null;
				try {
					start =
						new Timestamp(dfm.parse(startDateTimeString).getTime());
					end = new Timestamp(dfm.parse(endDateTimeString).getTime());
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				int categoryId = Integer.parseInt(req.getParameter("category"));
				String userName = user.getUserName();
				String comment = req.getParameter("txtcomment");

				Todo.updateInstance(todoId,
					todoName,
					start,
					end,
					userName,
					categoryId,
					comment);
			} else if (operation.equals("remove") && user != null) {
				String[] todoIds = req.getParameterValues("todoIds");

				if (todoIds != null) {
					int[] todoIdsInt = new int[todoIds.length];
					for (int i = 0; i < todoIds.length; i++) {
						todoIdsInt[i] = Integer.parseInt(todoIds[i]);
						System.out.println(
							"hej från MainServlet. Operation = remove. id att ta bort: "
								+ todoIds[i]);
					}
					Todo.removeTodos(todoIdsInt);
				}
			} else if (operation.equals("edit") && user != null) {
				String idString = req.getParameter("id");
				int id = Integer.parseInt(idString);
				Todo todo = user.findTodo(id);
				if (todo != null) {
					req.setAttribute("todoToEdit", todo);
					url = "Edit-todo.jsp";
					req.setAttribute("todoId", idString);
				}

			} 
			else if (operation.equals("registerAccount") && user == null) {
				// get form parameters
				String userName = req.getParameter("username");
				String password = req.getParameter("password");
				String email = req.getParameter("email");
				String firstName = req.getParameter("firstName");
				String lastName = req.getParameter("lastName");
				
				// test print
				System.out.println("hej från mainservlet. Vi har tagit emot data från register: " 
				+ userName + " " + password + " " + email);
				
				// create user
				Connection.getFacade().addUser(userName, password, firstName, lastName, email);
				
				// get the same user from database - check if the user has been saved
				user = Person.getPerson(userName, password);
				if (user != null) {
					req.getSession().setAttribute("loggedInAs", user);
					url = "/todolist.jsp";

				} else {
					url = "/login.jsp";
					req.setAttribute(
						"errorMessage",
						"Fill in correct user name and password!");
				}
			}
			else if (operation.equals("about")) {
				url = "about.jsp";
			} else if (operation.equals("contact")) {
				url = "contact.jsp";
			} else if (operation.equals("register") && user == null) {
				url = "register.jsp";
			} else if (operation.equals("addtodo") && user != null) {
				url = "newtodo.jsp";
			} else {
				url = "/todolist.jsp";
			}
		} else if (operation == null && user == null) {
			url = "login.jsp";
		} else {
			url = "/todolist.jsp"; //om man skulle anropa MainServlet direkt
			//url = req.getRequestURL().toString();
		}
		try {
			RequestDispatcher dispatcher =
				getServletContext().getRequestDispatcher(url);
			dispatcher.forward(req, resp);
		} catch (ServletException e) {
			System.out.println("ServletException bla bla");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("IOException bla bla");
			e.printStackTrace();
		}
	}

	/**
	* @see javax.servlet.GenericServlet#void ()
	*/
	public void init() throws ServletException {

		super.init();

	}

}
