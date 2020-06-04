package com.edu.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InitparamServlet extends HttpServlet {
	String id, password;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		id=config.getInitParameter("id");
		password=config.getInitParameter("password");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter io = resp.getWriter();
		io.print("<h2>서블릿 web.xml에서 설정한 변수 내용을 가져오기 </h2>");
		io.print("<h3>ID : "+id+"</h3> ");
		io.print("<h3>passwrod :" + password+"</h3>");
		io.close();
	}
	
}
