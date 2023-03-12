
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student List</title>
</head>
<body>
    <h1>Student List</h1>
    <table>
        <thead>
            <tr>
                <th>Student Id</th>
                <th>Student Name</th>
                <th>Teachers ID</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${listOfStudent}" var="studentObj">
                <tr>
                    <td>${studentObj.sid}</td>
                    <td>${studentObj.sname}</td>
                    <td>${studentObj.tsid}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <br>
    <a href="add-student-form.jsp">Add Student</a>
</body>
</html>
