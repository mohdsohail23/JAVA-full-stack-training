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
 * Servlet implementation class CounterSessionDemo
 */
@WebServlet("/CounterSessionDemo")
public class CounterSessionDemo extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		ServletOutputStream out=response.getOutputStream();
		HttpSession session=request.getSession();
		Object obj=session.getAttribute("counter");
		
		if(obj==null) {
			out.println("<h1>You are visiting for the first time....</h1>");
			session.setAttribute("counter", 2);
		}
		else {
			int c=Integer.parseInt(obj.toString());
			out.println("<h1>You are visiting for the ....:"+c+" time");
			session.setAttribute("counter", ++c);
		}
	}
}