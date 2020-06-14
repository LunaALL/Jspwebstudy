<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>login</title>
</head>
<body>
<form action="logincheck.jsp" method="post">
ID: <input type="text" name="id">
비번: <input type="password" name="pwd">
	<input type="submit" value="로그인">
</form>
<a href="logincheck.jsp">로그아웃</a>
</body>
</html>