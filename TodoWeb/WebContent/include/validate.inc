<% pojo.Person user2 = (pojo.Person) request.getSession().getAttribute("loggedInAs");
if (user2 == null) {
	response.sendRedirect("login.jsp");
	System.out.println("No session");
} else {
	System.out.println(user2.getUserName());	
}
System.out.println(request.getRequestURL());
%>
