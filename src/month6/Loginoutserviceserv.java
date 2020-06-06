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
			out.print("id�� ��й�ȣ�� �ٽ� �Է��ϼ���");
			return;
			
		}
		HttpSession session= req.getSession();
		//isnew ���ο� ������ ��������� Ʈ��
		if(session.isNew()|| session.getAttribute("id")==null) {
			session.setAttribute("id", id);
			out.print("���� �α����� �Ϸ��Ͽ����ϴ�.");
		} else {
			out.print("���� �α��� �����Դϴ�.");
		}
		}
	
	//get�� ���ΰ�ħ�Ͽ����� �α��� ������ ����
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		HttpSession session = req.getSession(false);
		
		if(session !=null && session.getAttribute("id")!=null) {
			session.invalidate();
			out.print("�α׾ƿ��� �Ϸ�Ǿ����ϴ�.");	
		} else {
			out.print("������ �����ǰ� �ִ�(�α��ε��� ����)��Ȳ�� �ƴմϴ�.");			
		}
		out.close();
		
		
	}

}
