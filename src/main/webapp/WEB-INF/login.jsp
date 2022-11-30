<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<center>
<h1 style="color:red">Login page</h1>
<br>
<br>
<div style="color:blue">
<form:form action="login1" modelAttribute="loging">
	<span>FullName</span>
	<form:input path="FullNmae"/>
	<br>
	<br>
	<span>password&nbsp;</span>
	<form:input path="password"/>
	<br>
	<br>
	<form:button type="submit">submit</form:button>
</form:form>
</div>
</center>
</body>
</html>