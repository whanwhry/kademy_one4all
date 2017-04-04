<%-- 
    Document   : home
    Created on : Mar 31, 2017, 12:48:09 PM
    Author     : nunnnunns
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
 <h1>Hello World!</h1>
        <form action="Search" method="post">
            <input type="text" name="name">
            <input type="submit" value="Search">  
        </form>
        <p>${msg}</p> 
        <c:forEach items="${f}" var="c" varStatus="vs">
            <h3>${f.fileName}</h3>
        </c:forEach>
            <c:forEach items="${t}" var="c" varStatus="vs">
            <h3>${t.tagName}</h3>
        </c:forEach>
    </body>
</html>
