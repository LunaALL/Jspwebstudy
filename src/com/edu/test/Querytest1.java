package com.edu.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;
@WebServlet("/querytest")
public class Querytest1 extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
	}
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html;charset=UTF-8");
		req.setCharacterEncoding("UTF-8");
		PrintWriter io = resp.getWriter();
		io.print("<html> <head><title>�����׽�Ʈ </title> </head>");
		io.print("<body> ");
		io.print("<h1>Post ������� ��û�Ǿ����ϴ�. </h1> <br/>");
		String name= req.getParameter("name");
		io.print("�̸� : "+name);
		io.print("</body> </html>");
		io.close();
	}
	

}
