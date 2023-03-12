
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Subject List</title>
</head>
<body>
    <h1>Subject List</h1>
    <table>
        <thead>
            <tr>
                <th>Id</th>
                <th>Name</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${listOfSubject}" var="subjectObj">
                <tr>
                    <td>${subjectObj.subid}</td>
                    <td>${subjectObj.subname}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <br>
    <a href="add-subject-form.jsp">Add Subject</a>
</body>
</html>