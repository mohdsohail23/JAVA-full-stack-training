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
<h1>Welcome Page...</h1>
<%
	LoginBean bean=(LoginBean)session.getAttribute("myloginbean");
	String uname=bean.getUname();
	
	out.println("Welcome....:"+uname);
	
%>
</body>
</html>