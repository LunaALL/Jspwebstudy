package month609;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/filtertest1")
public class FilterTestservlet extends HttpServlet {
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		String name=req.getParameter("name");
		out.print("필터 테스트 페이지 1 입니다 <br/>" );
		out.print("가져온 값 정상작동 ? "+name);
		out.close();
		
	}
}
