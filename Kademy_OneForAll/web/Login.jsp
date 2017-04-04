<%-- 
    Document   : Login
    Created on : Apr 4, 2017, 3:48:19 PM
    Author     : KARTOON
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <form action="/Kademy_OneForAll/LoginServlet">
            Username <input type="text" name="Username"><br>
            Password <input type="password" name="Password"><br>
            <input type="submit" value="Login">
           
        </form>
       
    </body>
</html>
