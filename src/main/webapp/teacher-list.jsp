
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Teacher List</title>
</head>
<body>
    <h1>Teacher List</h1>
    <table>
        <thead>
            <tr>
                <th>Id</th>
                <th>Name</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${listOfTeacher}" var="teacherObj">
                <tr>
                    <td>${teacherObj.tid}</td>
                    <td>${teacherObj.tname}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <br>
    <a href="add-student-form.jsp">Add Student</a>
</body>
</html>