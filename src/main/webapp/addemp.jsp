<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page session="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Employee</title>
<link rel="stylesheet" type="text/css" href="CSS/formdesign.css">
</head>
<body class="body">

	<%
		HttpSession session = request.getSession(false);
		if (session == null) {
			response.sendRedirect("./login.jsp");
		}
	%>



	<div id="addform">
		<form action="./addemp" method="get">
		<p align="center" style="font-size: 25px;">Add Employee</p>
			<table align="center" cellpadding="10px" width="100%">
				<tr>
					<td>Employee ID :</td>
					<td><input type="text" name="eno"
						 required></td>
				</tr>
				<tr>
					<td>Employee Name :</td>
					<td><input type="text" name="ename"
						 required></td>
				</tr>
				<tr>
					<td>Job :</td>
					<td><input type="text" name="job" ></td>
				</tr>
				<tr>
					<td>MGR :</td>
					<td><input type="text" name="manager" 
						required></td>
				</tr>
				<tr>
					<td>Hire Date :</td>
					<td><input type="date" name="hiredate"
						 required></td>
				</tr>
				<tr>
					<td>Department ID :</td>
					<td><input type="text" name="deptid"
						 required></td>
				</tr>
				<tr align="center">
					<td colspan="2"><input type="submit" value="Add Employee"
						class="submit">&nbsp;&nbsp;&nbsp;&nbsp; <input
						type="reset" value="Clear" class="reset"></td>
				</tr>

			</table>
		</form>
	</div>
</body>
</html>