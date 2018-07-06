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
		request.setCharacterEncoding("utf-8");//post提交方式，设置中文编码
		//1.接收浏览器端发送过来的请求web.xml
	    //2.同时还要接受浏览器端的参数
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		String score=request.getParameter("score");
		users emp=new users();
		emp.name=name;
		emp.score=Double.parseDouble(score);
		emp.password=password;
		empdao.usersLogin(emp);
		//3.向页面响应结果，回到emplist.jsp页面
		response.sendRedirect("list");
		
}
}
