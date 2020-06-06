package month6;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/loginExcute")
public class Loginoutserviceserv extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		String id= req.getParameter("id");
		String pwd = req.getParameter("pwd"); 
		
		if(id.isEmpty() || pwd.isEmpty()) {
			out.print("id랑 비밀번호를 다시 입력하세요");
			return;
			
		}
		HttpSession session= req.getSession();
		//isnew 새로운 세션을 만들었을때 트루
		if(session.isNew()|| session.getAttribute("id")==null) {
			session.setAttribute("id", id);
			out.print("현재 로그인을 완료하였습니다.");
		} else {
			out.print("현재 로그인 상태입니다.");
		}
		}
	
	//get은 새로고침하였을때 로그인 유지를 위함
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		HttpSession session = req.getSession(false);
		
		if(session !=null && session.getAttribute("id")!=null) {
			session.invalidate();
			out.print("로그아웃이 완료되었습니다.");	
		} else {
			out.print("세션이 유지되고 있는(로그인되지 않음)상황이 아닙니다.");			
		}
		out.close();
		
		
	}

}
