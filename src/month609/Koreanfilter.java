package month609;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Koreanfilter implements Filter  {
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		System.out.println("doFilter() 호출 전.......");
		chain.doFilter(request, response);
		System.out.println("doFilter() 호출 후....... ");
	}
	
}
