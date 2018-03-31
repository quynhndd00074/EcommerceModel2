<%-- 
    Document   : result
    Created on : Mar 29, 2018, 3:02:09 PM
    Author     : User
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>List Product</title>
    </head>
    
        <h1>List Product</h1>
        <a href="search.jsp">Search</a>
        <jsp:useBean class="com.wpsj.model.ProductFinderBean" id="finder" scope="request"/>
        <table>
            <tr>
                <td>Id</td>
                <td>name</td>
                <td>Description</td>
            </tr>
            <c:forEach items="${finder.products}" var="product">
                <tr>
                    <td><c:out value="${product.id}"/></td>
                    <td><c:out value="${product.name}"/></td>
                    <td><c:out value="${product.desc}"/></td>
                </tr>
            </c:forEach>
        </table>
   
    </html>
