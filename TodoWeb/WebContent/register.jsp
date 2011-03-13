<%-- 
    Document   : register
    Created on : 2010-mar-24, 14:48:10
    Author     : Sinan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%! String pageTitle = "Register";%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
    <%@include file="include/head.inc" %>
    <body>
    <div id="wrapper">
        <%@include file="include/header.inc" %>
        <div id="inner-wrap">
		<div id="container">
		<h2><%= pageTitle%></h2>
        <p>New member register</p>
        <!-- we use jquery validate plugin
        see example: 
        http://docs.jquery.com/Plugins/Validation -->
        <form action="app?operation=registerAccount" method="post" id="registerForm" accept-charset="ISO-8859-1">
            E-mail:<br><input type="text" name="email" id="email" class="required email"><br>
            <label for="password"> Password:</label><br>
            <input type="password" id="password" name="password" maxlength="15" class="required"><br>

            Confirm user name e-mail:<br>
            <input type="text" id="confirmEmail" name="confirmEmail"><br>
            <label for="password">Confirm password:</label><br>
            <input type="password" id="confirmPassword" name="confirmPassword" maxlength="15" class="required"><br>
            <br><br>
            User name<br><input type="text" name="username" class="required">
            <br><br>
            First name:<br><input type="text" name="firstName"><br>
            Last name:<br><input type="text" name="lastName"><br>
            <br>
            Address:<br>
            <input type="text" name="Address" /><br>
            <br>
            <div>
                <input type="submit" name="btnOK" class="button" value="Register">
                <input type="reset" name="btnReset" class="button" value="Clear all">
                <input type="button" name="btnCancel" class="button" id="btnCancel" value="Cancel">
            </div>
        </form>
        </div>
        </div>
        <%@include file="include/footer.inc" %>
        </div>
    </body>
</html>
