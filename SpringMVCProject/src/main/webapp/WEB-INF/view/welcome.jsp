<%@ page language="java" contentType="text/html;charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>Home </title>
<style type="text/css">
.errors
{

color:red;
position:fixed;
text-align:left;
margin-left:20px;
}
</style>
</head>
<body>
<h1 align="center">Love Calculator</h1>
<hr>

<form:form action="cal" method="get" modelAttribute="userinfo">
<div align="center">
<p>
<label for="ur">Your Name :</label>
<form:input id="ur" path="urname"/>
<form:errors path="urname" cssClass="errors"/>
</p>

<p>
<label for="cr">Crush Name :</label>
<form:input id="cr" path="crname"/>
<form:errors path="crname" cssClass="errors"/>
</p>

<p>
<form:checkbox path="agree" id="check"/>
<label>I am agreeing that this is for fun</label>
<form:errors path="agree" cssClass="errors"/>
</p>
</body>

<input type="submit" value="calculate">
</div>
</form:form>
</html>