
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Class List</title>
</head>
<body>
    <h1>Class List</h1>
    <table>
        <thead>
            <tr>
                <th>Id</th>
                <th>Name</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${listOfClass}" var="classObj">
                <tr>
                    <td>${classObj.cid}</td>
                    <td>${classObj.cname}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <br>
    <a href="add-class-form.jsp">Add Class</a>
</body>
</html>
