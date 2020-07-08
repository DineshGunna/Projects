<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page session="false"%>
<%@page import="com.asset.dto.User"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Page</title>
<link rel="stylesheet" type="text/css" href="CSS/page.css">

</head>
<body>
	<%
		HttpSession session = request.getSession(false);
		if (session == null) {
			response.sendRedirect("./login.jsp");
		}
	%>
	<div>
		<img src="image/banner1.jpg" style="border-radius: 10px;" width="1340"
			height="350">
	</div>

	<div class="container">

		<div class="dropdown">
			<button class="dropbtn">Inventory</button>
			<div class="dropdown-content">
				<a href="addasset.jsp">Add Asset</a>
				<a href="updateasset.jsp">Update Asset</a>
				<a href="deleteasset.jsp">Delete Asset</a>a
			</div>
		</div>
		<div class="dropdown">

			<a href="./viewreq" class="dropbtn"> View Request </a>
		</div>

		<div class="dropdown">
			<button class="dropbtn">List of Assets</button>
			<div class="dropdown-content">
				<a href="./viewallocated">Allocated Asset</a> 
				<a href="./viewunallocated">Unallocated Asset</a>
			</div>
		</div>
		<div class="dropdown">
			<button class="dropbtn">User</button>
			<div class="dropdown-content">
				<a href="adduser.jsp">Add user</a>
				<a href="updateuser.jsp">Update user</a> 
				<a href="deleteuser.jsp">Delete user</a> 
				
			</div>
		</div>
		
		<div class="dropdown">
			<button class="dropbtn">Employee</button>
			<div class="dropdown-content">
				<a href="addemp.jsp">Add Employee</a> 
				<a href="updateemp.jsp">Update Employee</a>
				<a href="deleteemp.jsp">Delete Employee</a> 
				
			</div>
		</div>
		
		
		<div class="dropdown" align="right">
			<a href="./logout" class="dropbtn"> Logout </a>
		</div>
	</div>


	<h1 align="center">This is the Admin Page</h1>

	<div class="footer">
		<b class="foottext">&copy; copyright
			AssertManagementSystem/The Achievers</b>
	</div>

</body>
</html>