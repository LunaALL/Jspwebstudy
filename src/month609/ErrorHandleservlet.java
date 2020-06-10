package month609;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//errorTest1 서블릿으로 의도적인 에러를 낼거임 
@WebServlet("/errorHandle")
public class ErrorHandleservlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		Integer code =(Integer)req.getAttribute("javax.servlet.error.status_code");
		String message =(String)req.getAttribute("javax.servlet.error.message");
		Object type =req.getAttribute("javax.servlet.error.exception_type");
		
		Throwable exception = (Throwable)req.getAttribute("javax.servlet.error.exception");
		
		String uri = (String)req.getAttribute("javax.servlet.error.request_uri");
		out.print("에러발생!!  에러를 파악하는 페이지입니다. ");
		out.print("<h2>Error Code    :" + code + "</h2>" );
		out.print("<h2>Error Message    :" + message + "</h2>" );
		out.print("<h2>Error Type    :" + type + "</h2>" );
		out.print("<h2>Error Object    :" + exception + "</h2>" );
		out.print("<h2>Error URI   :" + uri + "웹 서블릿에서 오류가 났습니다. </h2>" );
		
		out.close();
		
		
		
	}
}
