package month609;


import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import com.sun.corba.se.impl.orb.ParserTable.TestAcceptor1;
import com.sun.org.apache.xml.internal.security.Init;

@WebFilter(filterName = "TestAnnotation", urlPatterns = "/third")
public class Filterano implements javax.servlet.Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		System.out.println("서블릿 실행전 수행");
		chain.doFilter(request, response);
		System.out.println("서블릿 실행후 수행 ");
		
	}

	
}
