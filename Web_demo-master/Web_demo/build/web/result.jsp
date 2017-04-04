<%-- 
    Document   : result
    Created on : Mar 20, 2017, 3:51:58 PM
    Author     : FirstZa
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Customer Result</h1>
        <p>${msg}</p>
        <h3>${customer.name}</h3>
        <c:forEach items="${customers}" var="c" varStatus="vs">
            <p>${vs.count}.   ${c.name}</p>
        </c:forEach>
        
    </body>
</html>
