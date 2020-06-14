<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>페이지 컨텍스트 예제</title>
</head>
<body>
페이지 컨텍스트 page context는 jsp파일마다 각각 자동 생성되는 객체임.

<%! 
int num=0;
public void work(String p, PageContext pc){
	try{
		JspWriter out = pc.getOut();
		if(p.equals("include")){
			out.print("-- include 전 -- <br> ");
			pc.include("example7.jsp");
			out.print("-- include 후 -- <br> ");
		}else if(p.equals("forward")){
			pc.forward("login.jsp");
		}
	}catch(Exception e){
		System.out.println("오류 발생!!");
		System.out.println("오류횟수 "+ (++num));
		
		
	}

}
	%>
<%
String p = request.getParameter("p");
this.work(p, pageContext);
 
%>

</body>
</html>