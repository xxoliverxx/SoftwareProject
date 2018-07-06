package service;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.empdao;
import dao.users;

public class userslistservlet extends HttpServlet{
	protected void service(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		//1.接受浏览器端的请求
		System.out.println("访问成功!");
		//2.链接数据库，查询表中的数据结果
		//访问Dao工厂中定义的emplist方法
		ArrayList<users> emps=empdao.userslist();
		System.out.println("结果集为:"+emps);
		//3.直接向emplist.html跳转，同时将emps结果集在emp'list.html中显示出来
		//转发技术
		//将emps结果集放在request中储存
		request.setAttribute("eps",emps);
		request.getRequestDispatcher("userslist.jsp").forward(request,response);
		}
}
