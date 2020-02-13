<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!--   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> -->
<%@ page session="false"%>
<html>
<head>
<title></title>
</head>
<body>
<h1>${headerinfo}</h1>
<form action="/SpringForm/userController/user" >
loginID:  <input type = "text" name = "id"/> 
password: <input type = "password" name = "pass"/>
<input type ="submit" value = "Submit"/>
</form></body>
</html>