<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page session="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delete Employee</title>
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
		<form action="./delemp" method="get">
		<p align="center" style="font-size: 25px;">Delete Employee</p>
			<table align="center" cellpadding="10px" width="100%">
				<tr>
					<td>Employee ID :</td>
					<td><input class="id" type="text" name="eno"
						 required></td>
				</tr>
				<tr align="center">
					<td colspan="2"><input type="submit" value="Delete Employee"
						class="submit"> &nbsp;&nbsp;&nbsp;&nbsp; <input
						class="reset" type="reset" value="Clear"></td>
				</tr>

			</table>
		</form>
	</div>
</body>
</html>