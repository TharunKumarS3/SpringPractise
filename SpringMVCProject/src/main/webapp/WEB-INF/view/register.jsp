<%@ page language="java" contentType="text/html;charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<title>Registration</title>
<style type="text/css">
.errors
{

color:red;
position:fixed;
text-align:left;
margin-left:20px;
}
</style>
<body>
<h1 align="center">Love Calculator</h1>
<hr>

<h1 align="center">Register here</h1>
<div align="center"?>
<form:form method="get" action="reg" modelAttribute="userRegistration">
<p>
<label for="urname">User : </label>
<form:input id="urname" path="name"/>
<form:errors path="name" cssClass="errors"/>
</p>

<p>
<label for="uname">UserName : </label>
<form:input id="uname" path="userName"/>
<form:errors path="userName" cssClass="errors"/>
</p>

<p>
<label for="pass">Password : </label>
<form:input id="pass" path="password"/>
</p>
<p>
<label for="age">Age : </label>
<form:input id="age" path="age"/>
<form:errors path="age" cssClass="errors"/>
</p>
<p>
<label for="sex">Sex : </label>
<form:select id="sex" path="ursex">
    <form:option value="Male" label="Male"/>
    <form:option value="Female" label="Female"/>
</form:select>
</p>
<div align="center">
<h3>Communication</h3>
<label for="email">Email</label>
<form:input path="communicationDTO.email" id="email"/>
<form:errors path="communicationDTO.email" cssClass="errors"/>
<br>
<label for="phone">Phone</label>
<form:input path="communicationDTO.phone" id="phone"/>
</div>

<br>
<input type="submit" value="register"/>
</form:form>
</div>
</body>
</html>