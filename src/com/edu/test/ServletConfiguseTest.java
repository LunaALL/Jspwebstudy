package com.edu.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletConfiguseTest extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter io = resp.getWriter();
		String env = this.getInitParameter("charset");
		req.setCharacterEncoding(env);
		io.print("<h2>���� charset init������ �̿��Ͽ� �����ϱ� </h2>");
		io.print("�̸� :"+req.getParameter("name"));
		
		io.close();
	}

}
