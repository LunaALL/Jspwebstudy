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
		//web.xml에서 선언한 컨텍스트 변수 가져오기 <context-param> 
		//서블릿 컨텍스트 객체를 지역변수로 선언 
		io.print("서블릿 콘텍스트 경로 생성 "+ str);
		
		//서버 정보 추출 
		io.print("서블릿 버전은 :"+slc.getMajorVersion() +"최소 버전은"+ slc.getMinorVersion());
		io.print("<br>서버 정보 :"+slc.getServerInfo());
		io.print("<br/> 웹 어플리케이션 경로 "+ slc.getContextPath());
		io.print("실제 파일 경로"+slc.getRealPath("name.html"));
		slc.log("로그를 기록합니다");
		io.close();
	}

}
