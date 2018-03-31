<%-- 
    Document   : search
    Created on : Mar 29, 2018, 3:02:27 PM
    Author     : User
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Shopping</title>
    </head>
    <body>
        <h1>Product List</h1>
        <form action="ProductFinder">
            <span style="color: red;">
                <c:out value="${param.msg}"/></span>
                <input name="name"/>
                <input type="submit"/>
        </form>
    </body>
</html>
