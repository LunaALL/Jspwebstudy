<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>������ ���ؽ�Ʈ ����</title>
</head>
<body>
������ ���ؽ�Ʈ page context�� jsp���ϸ��� ���� �ڵ� �����Ǵ� ��ü��.

<%! 
int num=0;
public void work(String p, PageContext pc){
	try{
		JspWriter out = pc.getOut();
		if(p.equals("include")){
			out.print("-- include �� -- <br> ");
			pc.include("example7.jsp");
			out.print("-- include �� -- <br> ");
		}else if(p.equals("forward")){
			pc.forward("login.jsp");
		}
	}catch(Exception e){
		System.out.println("���� �߻�!!");
		System.out.println("����Ƚ�� "+ (++num));
		
		
	}

}
	%>
<%
String p = request.getParameter("p");
this.work(p, pageContext);
 
%>

</body>
</html>