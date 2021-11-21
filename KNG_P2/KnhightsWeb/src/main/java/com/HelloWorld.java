package com;
import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class HelloWorld
 */
@WebServlet(
			loadOnStartup = 1,
			urlPatterns = {"/HelloWorld","*.do","/blabla"},
			initParams = {
					@WebInitParam(name="abc",value="bla bla bla bla"),
					@WebInitParam(name="xyz",value="some value....")
			}
		)
public class HelloWorld extends HttpServlet {
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init of helloworld servlet called....");
		String v1=config.getInitParameter("abc");
		System.out.println(v1);
		String v2=config.getInitParameter("xyz");
		System.out.println(v2);
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("service of helloworld servlet do get called....");
	}	
}