package com;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 * Servlet implementation class SessionDemo
 */
@WebServlet("/SessionDemo")
public class SessionDemo extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		ServletOutputStream out=response.getOutputStream();
		HttpSession session=request.getSession();
		if(session.isNew()) {
			out.println("<h1>you are comming for the first time....</h1>"+session.getId());
		}
		else {
			out.println("<h1>This is not your first visit....:"+session.getId());
		}
	}
}
