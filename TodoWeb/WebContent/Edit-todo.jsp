<%-- 
    Document   : Edit-todo
    Created on : 2010-mar-31, 12:10:15
    Author     : Goran
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%! String pageTitle = "Edit a todo";%>
<% pojo.Todo todo = (pojo.Todo) request.getAttribute("todoToEdit"); 
	String startDateString = "";
	String startTimeString= "";
	String endDateString = "";
	String endTimeString= "";	
	
	java.text.DateFormat dfm = new java.text.SimpleDateFormat("yyyy-MM-dd");
	java.text.SimpleDateFormat dfmTime = new java.text.SimpleDateFormat("HH:mm");
  	java.sql.Timestamp start = todo.getStartTime();
  	
  	if (start != null) {
  		java.util.Date startDate = new java.util.Date(start.getTime());
  		startDateString = dfm.format(startDate);
  		startTimeString = dfmTime.format(startDate);
  		System.out.println("editTodo.jsp : start Date: " + startDate);
  		System.out.println("editTodo.jsp" + startTimeString);
  	}
  	java.sql.Timestamp end = todo.getEndTime();
  	
  	if (end != null) {
  		java.util.Date endDate = new java.util.Date(end.getTime());
  		endDateString = dfm.format(endDate);
  		endTimeString = dfmTime.format(endDate);
  	}
  	
	%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
<%@include file="include/head.inc" %>
<body>
<div id="wrapper"><%@include file="include/header.inc" %>
<div id="inner-wrap"><%@include file="include/menu.inc" %>
<div id="container">
<form action="MainServlet?operation=changeTodo&id=<%=request.getAttribute("todoId")%>" method="post" id="newTodoForm" accept-charset="ISO-8859-1">
<div>To-do: <BR>
<input type="text" name="txttodo" maxlength="75" class="text required" value="<%=todo.getTodoName() %>"></div>
<div><br>
Start date: <br>
<input type="text" class="dateInput required" id="dFrom" name="datestart" value="<%= startDateString %>"></div>
<div><br>
Finish date: <br>
<input type="text" class="dateInput required" id="dTo" name="datefinish" value="<%= endDateString %>"></div>
<div><br>
Start time: <br>
<input type="text" class="timeInput required" id="tFrom" name="txtstart" value="<%= startTimeString %>"> <br>
<br>
Finish time: <br>
<input type="text" class="timeInput required" id="tTo" name="txtfinish" value="<%= endTimeString %>"></div>
<div><br>
Category: <br>
<select name="category" class="cat">
	<%//show all categories in a select
java.util.ArrayList categories = pojo.Category.getAllCategories();
String categorySelectTag = "";
java.util.Iterator iter = categories.iterator();
System.out.println(
	"hej från newtodo.jsp. categories har storlek: " + categories.size());
while (iter.hasNext()) {
	pojo.Category category = (pojo.Category) iter.next();
	categorySelectTag += "<option value=\""
		+ category.getId()
		+ "\"";
	if( category.getCategoryName().equals(todo.getCategory())) {
		categorySelectTag += " selected=\"selected\"";
	}
	categorySelectTag += ">"
		+ category.getCategoryName()
		+ "</option>";
	
}
System.out.println(categorySelectTag);
%>
	<%=categorySelectTag%>

</select></div>
<div><br>
Comment: <br>
<textarea rows="4" cols="20" name="txtcomment" class="text"><%= todo.getComment() %></textarea>
</div>
<div><br>

<input type="submit" name="btnOK" class="button" value="OK"> <input
	type="reset" name="btnReset" class="button" value="Reset all"> <input
	type="button" name="btnCancel" class="button" id="btnCancel"
	value="Cancel" onclick="window.location.href='app'"></div>
</form>
</div>
</div>
<%@include file="include/footer.inc" %></div>
</body>
</html>
