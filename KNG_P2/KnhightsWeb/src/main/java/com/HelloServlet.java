package com;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Welcome to Servlet....");
		String name=request.getParameter("uname");
		System.out.println("Name...........:"+name);
		String password=request.getParameter("upass");
		System.out.println("Password.........:"+password);
		
		response.setContentType("text/html");
//		ServletOutputStream out=response.getOutputStream();
//		out.println("<h1>"+"WELCOME GUYZZZZ"+"</h1>");
//		out.println("<h1>"+name+":"+password+"</h1>");
		
		if(name.equals("knight")) {
			response.sendRedirect("welcome.jsp");
		}
		else {
			//response.sendRedirect("register.html");
			RequestDispatcher rd=request.getRequestDispatcher("Register.jsp");
			rd.forward(request, response);
		}
	}
	@Override
	public void destroy() {
		System.out.println("Destroy maethod called");
	}
}
