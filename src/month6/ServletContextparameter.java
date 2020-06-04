package month6;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servletpar")
public class ServletContextparameter extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter io =resp.getWriter();
		
		ServletContext slc = this.getServletContext();
		String str= slc.getInitParameter("contextConfig"); 
		//web.xml���� ������ ���ؽ�Ʈ ���� �������� <context-param> 
		//���� ���ؽ�Ʈ ��ü�� ���������� ���� 
		io.print("���� ���ؽ�Ʈ ��� ���� "+ str);
		
		//���� ���� ���� 
		io.print("���� ������ :"+slc.getMajorVersion() +"�ּ� ������"+ slc.getMinorVersion());
		io.print("<br>���� ���� :"+slc.getServerInfo());
		io.print("<br/> �� ���ø����̼� ��� "+ slc.getContextPath());
		io.print("���� ���� ���"+slc.getRealPath("name.html"));
		slc.log("�α׸� ����մϴ�");
		io.close();
	}

}
