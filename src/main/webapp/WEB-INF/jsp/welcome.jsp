<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
<h1>Student Info</h1>
<tr>
    <th>Student ID</th>
    <th>First Name</th>
    <th>Last Name</th>
</tr>
<tr>
    <td>${student.studentid}</td>
    <td>${student.fname}</td>
    <td>${student.lname}</td>
</tr>
</table>
</body>
</html>