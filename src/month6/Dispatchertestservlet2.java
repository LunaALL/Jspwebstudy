package month6;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/dispatcher2")
public class Dispatchertestservlet2 extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	resp.setContentType("text/html;charset=UTF8");
	PrintWriter out = resp.getWriter();
	out.print("<h3>테스트 2 페이지입니다. - dispatcher2 서블릿 </h3> ");
	out.print("페이지 2 호출에 성공하였습니다");
	
	out.close();
}
}
