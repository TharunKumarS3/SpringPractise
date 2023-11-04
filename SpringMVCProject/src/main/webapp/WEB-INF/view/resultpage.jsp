<%@ page language="java" contentType="text/html;charset=UTF-8"
pageEncoding="UTF-8"%>
<html>
<title>Result Page</title>
<body>
<h1 align="center">Love Calculator</h1>
<hr>
<p>
<h2>Love Calculator predicts</h2>
<br>
${userinfo.urname} and ${userinfo.crname} are
<br>
${userinfo.result}
<br>
<a href="/SpringMVCProject/sendEmail">Send Result to email</a>
</p>
</body>
</html>