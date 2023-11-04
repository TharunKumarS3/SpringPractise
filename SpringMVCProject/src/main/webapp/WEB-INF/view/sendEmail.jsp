<%@ page language="java" contentType="text/html;charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>Send Email</title>
</head>
<body>
<h1> Hi ${userinfo.urname}</h1>
<h2>Send Result to the Email</h2>
<form:form action="processEmail" method="GET" modelAttribute="emailDTO">
<label>Enter your email</label>
<form:input path="userEmail"/>
<input type="submit" value="send email"/>
</form:form>
</body>
</html>