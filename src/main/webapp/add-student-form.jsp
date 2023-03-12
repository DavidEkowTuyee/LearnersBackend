<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Class</title>
</head>
<body>
    <h1>Add Student</h1>
    <form method="post" action="StudentController">
        
        <label for="sname">Student Name:</label>
        <input type="text" id="sname" name="sname" required><br><br>
        
        <input type="submit" value="Add Student">
        
    </form>
    
    <br/>
    <a href="StudentController">View Student List</a>
</body>
</html>
