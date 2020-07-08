<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page session="false"%>
<%@page import="com.asset.dto.User"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Page</title>
<link rel="stylesheet" type="text/css" href="CSS/page.css">
</head>
<body>

	 <%
		HttpSession session = request.getSession(false);
		if(session == null){
			response.sendRedirect("./login.jsp");
		}
	%> 

	<div>
		<img src="image/banner1.jpg" style="border-radius: 10px;" width="1340"
			height="350">
	</div>

	<div class="container">


		<div class="dropdown">
			<a href="RaiseRequest.jsp" class="dropbtn"> Raise Request </a>
		</div>

		<div class="dropdown">
			<a href="statusrequest" class="dropbtn"> Status of Request </a>
		</div>
		<div class="dropdown" align="right">
			<a href="./logout" class="dropbtn"> Logout </a>
		</div>



	</div>

	<h1 align="center">This is the User(Manager) Page</h1>

	<div class="footer">
		<b class="foottext">&copy; copyright
			AssertManagementSystem/The Achievers</b>
	</div>

</body>
</html>