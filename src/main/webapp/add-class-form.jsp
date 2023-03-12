<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Class</title>
</head>
<body>
    <h1>Add Class</h1>
    <form method="post" action="ClassController">
        <label for="cid">Class Id:</label>
        <input type="text" id="cid" name="cid" required><br><br>
        <label for="cname">Class Name:</label>
        <input type="text" id="cname" name="cname" required><br><br>
        <input type="submit" value="Add Class">
    </form>
    
    <br/>
    <a href="ClassController">View Class List</a>
</body>
</html>
