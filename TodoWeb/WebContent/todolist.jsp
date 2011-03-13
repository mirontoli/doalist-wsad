<%-- 
    Document   : index
    Created on : 2010-mar-29
    Author     : Pontus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%! String pageTitle = "Do-a-List. Start page"; %>
<%@include file="include/validate.inc" %>  
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">

<html>
    <%@include file="include/head.inc" %>
    <body>
    <div id="wrapper">
        <%@include file="include/header.inc" %> 
        <div id="inner-wrap">
        <div id="container">
        <form action="app?operation=remove" method="post">
    <table id="todolist">
   <thead>
    <tr>
      <th>Completed</th>
      <th>Task</th>
      <th>Start date</th>
      <th>Finish date</th>
      <th>Category</th>
    </tr>
  </thead>
  <% String tableRows = "";
  pojo.Person user = (pojo.Person) session.getAttribute("loggedInAs");
  if(user != null) {
  System.out.println("inne i todolistjsp" + user.getUserName());
  	for (int i = 0; i < user.getTodoList().size(); i++) {
  	pojo.Todo todo = (pojo.Todo) user.getTodoList().get(i);
  	System.out.println(todo.getTodoName());
  	java.text.DateFormat dfm = new java.text.SimpleDateFormat("yyyy-MM-dd");
  	java.sql.Timestamp start = todo.getStartTime();
  	String startString = "";
  	
  	if (start != null) {
  		java.util.Date startDate = dfm.parse(start.toString());
  		startString = dfm.format(startDate);
  	}
  	
	java.sql.Timestamp end = todo.getEndTime();
	String endString = "";
	if (end != null) {
		java.util.Date endDate = dfm.parse(end.toString());
		endString = dfm.format(endDate);
	}
	

  	
  	tableRows += "<tr><td> \n"
  			+ "<input type=\"checkbox\" name=\"todoIds\" \" value=\"" + todo.getId() + "\" onclick=\"Strike(this);\"></input> \n"
         + " </td>\n"
         + "<td> <a href= \"app?operation=edit&id="+ todo.getId()+"\">" + todo.getTodoName() + "</a></td>\n" 
         + "<td> " + startString + "</td>\n"
         + "<td> " + endString + "</td>\n"
        + "<td> " + todo.getCategory() + "</td>\n" // test only getId()
        + "</tr>";
     }
     }
     else {
     System.out.println("user är null");
     }
  	%>
	<%= tableRows %>
    </table>
    <input type="button" name="btnAdd" class="button" value="Add a to-do" onclick="window.location.href='MainServlet?operation=addtodo'">
    <input type="submit" name="btnRemove" id="btnRemove" class="button" value="Remove from list" disabled="disabled">
    <input type="reset" name="btnUnmark" id="btnUnmark" class="button" value="Unmark all" disabled="disabled">
    </form>
    </div>
    </div>
    <%@include file="include/footer.inc" %>
    </div>
    </body>
</html>
