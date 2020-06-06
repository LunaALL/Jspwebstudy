package month6;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servtest1")
public class ServletContextsharetest extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		ServletContext co =this.getServletContext();
		
		Shareinfo info1 = new Shareinfo();
		info1.setinfo(20, "김ss");
		co.setAttribute("sss", info1);
		
		
		Shareinfo info2 = new Shareinfo();
		info1.setinfo(26, "dd");
		co.setAttribute("aa", info1);
		
		out.print("각 객체에 대해 등록절차를 마쳤습니다.");
		out.close();
		
		
	}
	

}
