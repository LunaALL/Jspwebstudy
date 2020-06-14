<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>로그인체커</title>
</head>
<body>
로그인은 post 방식으로 요청, 로그아웃은 get 방식으로 요청하여 한페이지에서 처리함. <br/>	

<% 
if(request.getMethod().equals("POST")) {
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	
	if(id.isEmpty() || pwd.isEmpty() ) {
	request.setAttribute("error", "ID 또는 비밀번호를 입력해주세요.");
	RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
	rd.forward(request, response);
	return; } 
	
	//로그인 처리
	
	if(session.isNew() || session.getAttribute("id")==null) {
		session.setAttribute("id", id);
		out.print("새로운 세션 생성이 완료되었습니다.");//printwriter 가 내장객체라 바로 사용가능
	}else{
		out.print("이미 로그인되었습니다.");
	}
	%>
	id =<%= id %>  pwd= <%= pwd %>
	
	<% }else if(request.getMethod().equals("GET")) {
		if(session.getAttribute("id")!=null && session!=null){
			session.invalidate();
			out.print("로그 아웃 완료");
			
		} else{
			out.print("로그인 상태가 아닙니다");
		}
	
	
	//get방식으로 들어온건 로그아웃 처리를 한다. <a 태그 href로 받음 
}
	
	%>

</body>
</html>