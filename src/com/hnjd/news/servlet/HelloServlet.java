package com.hnjd.news.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	
	public HelloServlet() {
		System.out.println("servlet����...");
	}
	
	//servlet��ʼ����ʱ��  �״η��ʸ�Servlet���г�ʼ������
	@Override
	public void init() throws ServletException {
		System.out.println("servlet��ʼ��...");
	}
	
	
	//servlet�����ʱ��
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		super.service(arg0, arg1);
	}
	
	
	//servlet���ٵ�ʱ�� �ر�tomcat������
	@Override
	public void destroy() {
		System.out.println("servlet����....");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("servlet����doget....");
	}
	
}
