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
	out.print("<h3>�׽�Ʈ 2 �������Դϴ�. - dispatcher2 ���� </h3> ");
	out.print("������ 2 ȣ�⿡ �����Ͽ����ϴ�");
	
	out.close();
}
}
