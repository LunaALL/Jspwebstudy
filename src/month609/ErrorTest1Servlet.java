package month609;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/errorTest")
public class ErrorTest1Servlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		
		String getQuery=req.getQueryString();
		out.print("겟방식에 쿼리문자열 출력 :"+ getQuery);
		out.print("이 쿼리의 길이는 ? length"+ getQuery.length());
		out.close();
		
	
		
		
	}

}
