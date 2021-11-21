<%@page import="com.LoginBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="myloginbean" class="com.LoginBean" scope="session">
		<jsp:setProperty name="myloginbean" property="*"/>
	</jsp:useBean>
	<%-- <%
		String uname=request.getParameter("uname");
		String upass=request.getParameter("upass");
		
		LoginBean mybean=new LoginBean();
		mybean.setUname(uname);
		mybean.setUpass(upass);
		
		session.setAttribute("myloginbean",mybean);
	%> --%>
	
	
	
	<%-- <jsp:forward page="welcome.jsp"></jsp:forward> --%>
	
	<form action="welcome.jsp">
		<input type="submit" value="Go To Welcome Page"/>
	</form>
</body>
</html>