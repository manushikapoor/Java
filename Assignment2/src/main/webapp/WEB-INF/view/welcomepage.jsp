<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>WELCOME</title>
</head>
<body>
Fill up the form to register an employee :
<br>
<table border=0px>
<form name="form1" action="save-user" method="post">
<tr>
<td><input type="text" name="text1" placeholder="enter name" value="${user.name}"></td></tr>
<tr>
<td><input type="text" name="text2" placeholder="enter address" value="${user.address}"></td></tr>
<tr>
<td><input type="number" name="text3" placeholder="enter contact number" value="${user.phone}"></td></tr>
<tr>
<td><input type="text" name="text4" placeholder="enter email id" value="${user.email}"></td></tr>
<tr>
<td><input type="text" name="text5" placeholder="enter experience" value="${user.exp}"></td></tr>
</table>
<br>
<input type="submit" name="submit">
</form>
<br>
</body>
</html>
