<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>�α���üĿ</title>
</head>
<body>
�α����� post ������� ��û, �α׾ƿ��� get ������� ��û�Ͽ� ������������ ó����. <br/>	

<% 
if(request.getMethod().equals("POST")) {
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	
	if(id.isEmpty() || pwd.isEmpty() ) {
	request.setAttribute("error", "ID �Ǵ� ��й�ȣ�� �Է����ּ���.");
	RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
	rd.forward(request, response);
	return; } 
	
	//�α��� ó��
	
	if(session.isNew() || session.getAttribute("id")==null) {
		session.setAttribute("id", id);
		out.print("���ο� ���� ������ �Ϸ�Ǿ����ϴ�.");//printwriter �� ���尴ü�� �ٷ� ��밡��
	}else{
		out.print("�̹� �α��εǾ����ϴ�.");
	}
	%>
	id =<%= id %>  pwd= <%= pwd %>
	
	<% }else if(request.getMethod().equals("GET")) {
		if(session.getAttribute("id")!=null && session!=null){
			session.invalidate();
			out.print("�α� �ƿ� �Ϸ�");
			
		} else{
			out.print("�α��� ���°� �ƴմϴ�");
		}
	
	
	//get������� ���°� �α׾ƿ� ó���� �Ѵ�. <a �±� href�� ���� 
}
	
	%>

</body>
</html>