<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Teacher</title>
</head>
<body>
    <h1>Add Teacher</h1>
    <form method="post" action="TeacherController">
        <label for="tid">Teacher Id:</label>
        <input type="text" id="tid" name="tid" required><br><br>
        <label for="tname">Teacher Name:</label>
        <input type="text" id="tname" name="tname" required><br><br>
        <input type="submit" value="Add Teacher">
    </form>
    
    <br/>
    <a href="TeacherController">View Teacher List</a>
</body>
</html>