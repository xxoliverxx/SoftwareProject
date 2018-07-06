package service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.empdao;
import dao.users;

import dao.empdao;

public class usersmatchservlet {
	public void service(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		
		String name=request.getParameter("name");
		String rank=request.getParameter("rank");
		empdao.usersMatch(name, rank);
		response.sendRedirect("list");
		}
}
