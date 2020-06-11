<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>인크루드 테스트 페이지</title>
</head>
<body>
<% for(int i=2; i<10;i++){
	for(int j=1; j<10 ; j++){
		out.print(i+"*"+j+"="+(i*j)); %><br>
	  <% } %> <br>
	<% } %>



</body>
</html>