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
<h1 style="color:red">Registration Page</h1>
<br>
<br>
<div style="color:blue">
<form:form action="registraton" modelAttribute="reg">
	<span>FullNmae&nbsp;&nbsp;&nbsp;&nbsp;</span>
	<form:input path="FullNmae"/>
	<br>
	<br>
	<span>Email&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
	<form:input path="Email"/>
	<br>
	<br>
	<span>Mobile no&nbsp;&nbsp;&nbsp;&nbsp;</span>
	<form:input path="Mobno"/>
	<br>
	<br>
	<span>City&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
	<form:input path="City"/>
	<br>
	<br>
	<span>Dob&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
	<form:input path="Dob" type="date"/>
	<br>
	<br>
	<span>Qualification</span>
	<form:input path="Qual"/>
	<br>
	<br>
	<span>State&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
	<form:input path="State"/>
	<br>
	<br>
	<span>Yoc&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
	<form:input path="Yoc"/>
	<br>
	<br>
	<span>password&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
	<form:input path="password"/>
	<br>
	<br>
	<form:button type="submit">submit</form:button>
</form:form>
</div>
</center>

</body>
</html>