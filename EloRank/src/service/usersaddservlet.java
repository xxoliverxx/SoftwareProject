package service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.empdao;
import dao.users;


public class usersaddservlet {
	public void service(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");//post�ύ��ʽ���������ı���
		//1.����������˷��͹���������web.xml
	    //2.ͬʱ��Ҫ����������˵Ĳ���
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		String score=request.getParameter("score");
		users emp=new users();
		emp.name=name;
		emp.score=Double.parseDouble(score);
		emp.password=password;
		empdao.usersLogin(emp);
		//3.��ҳ����Ӧ������ص�emplist.jspҳ��
		response.sendRedirect("list");
		
}
}
