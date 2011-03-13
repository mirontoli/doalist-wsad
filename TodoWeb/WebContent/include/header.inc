	<div id="header">
		<div id="logo"><h1><a href="MainServlet"><img src="img/todosplash.png" width="140" alt="logo"> 
		Do-a-List</a></h1><br><br>
		
<% String name = "";
if(request.getSession().getAttribute("loggedInAs") != null) {

 name = "<div class=\"subtitle\">Logged in as: ";
 name += ((pojo.Person) request.getSession().getAttribute("loggedInAs")).getFirstName();
 name += "</div>";
 }
 %>
 <%= name %>


		</h1></div>
		<div id="navigation">
			<ul>
				<li><a href="MainServlet?operation=register">Register</a></li><li>|</li>
				<li><a href="MainServlet?operation=contact"> Contact</a></li><li>|</li>
				<li><a href="MainServlet?operation=about"> About</a></li><li>|</li>
				<% if(request.getSession().getAttribute("loggedInAs") != null) { %>
            <li class="last"><a href="MainServlet?operation=logout"> Log out</a></li>
            <%} else { %>
            <li class="last"><a href="MainServlet"> Log in</a></li>
            <% } %>
				
			</ul>
		</div>
	</div><!--End header-->