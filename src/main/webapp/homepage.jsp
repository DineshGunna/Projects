<%@page import="com.asset.dto.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page session="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HomePage</title>
</head>
<body>
<h1>Login successfully done</h1>

	<%
		HttpSession session = request.getSession(false);
		if(session == null){
			response.sendRedirect("./login.jsp");
		}
	%>
	
<form action="./logout">
<input type="submit" value="Logout"/>
</form>

</body>
</html>