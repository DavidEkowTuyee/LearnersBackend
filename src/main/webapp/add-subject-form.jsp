<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Subject</title>
</head>
<body>
    <h1>Add Subject</h1>
    <form method="post" action="SubjectController">
        <label for="subid">Subject Id:</label>
        <input type="text" id="subid" name="subid" required><br><br>
        <label for="cname">Class Name:</label>
        <input type="text" id="subname" name="subname" required><br><br>
        <input type="submit" value="Add Subject">
    </form>
    
    <br/>
    <a href="SubjectController">View Subject List</a>
</body>
</html>