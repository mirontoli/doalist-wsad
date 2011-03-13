<%-- 
    Document   : index
    Created on : 2010-mar-24, 11:11:49
    Author     : Goran
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%! String pageTitle = "Welcome to Do-a-List. Please log in"; %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">

<html>
    <%@include file="include/head.inc" %>
    <body>
    <div id="wrapper">
        <%@include file="include/header.inc" %>
        <div id="inner-wrap">
        <div id="container">
        <div id="login">
            <form action="MainServlet?operation=login" id="loginForm" method="post" name="signIn" >
            
            <% String error = (String) request.getAttribute("errorMessage"); %>
            <% if(error != null) { %>
            <div id="errorMessage">
            <%= error %>
            </div>
            <% } %>
            
                <div id="loginUsername">
                    User name<br>
                    <input type="text" name="username" id="username" class="required">
                </div>
                <div id="loginPassword">
                    Password<br>
                    <input type="password" name="password" class="required">
                    <br>
                    <input type="submit" value="Sign in">
                </div>
            </form>
            <div id="extras">
                <a href="app?operation=register" title="register">New member? Register</a><br>
                Forgot password? Bye bye!
            </div>
            </div>
            </div>
        </div>
        <%@include file="include/footer.inc" %>
        </div>
    </body>
</html>
