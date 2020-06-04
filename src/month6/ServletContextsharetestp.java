package month6;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Servtest2")
public class ServletContextsharetestp extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter io = resp.getWriter();
		
		ServletContext sc = this.getServletContext();
		
		Shareinfo in1 =(Shareinfo)sc.getAttribute("창용");
		Shareinfo in2 =(Shareinfo)sc.getAttribute("우용");
		
		io.print("info1을 출력합니다... 나이 :"+ in1.getage());
		io.print("info1을 출력합니다... 이름 :"+ in1.getname());
		
		io.print("info2을 출력합니다... 나이 :"+ in2.getage());
		io.print("info2을 출력합니다... 이름 :"+ in2.getname());
		
		io.close();
		
		
	}
}
