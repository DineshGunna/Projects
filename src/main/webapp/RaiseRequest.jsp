<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page session="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Raise Request</title>
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
<form method="get" action="./assetrequest">
<p align="center" style="font-size: 25px;">Raise Request</p>
<table align="center" cellpadding="10px" width="100%">
	<tr>
		<td>Allocation Id :</td>
		<td><input type="text" name="aid" required></td>
	</tr>
	<tr>
		<td>Asset Id :</td>
		<td><input type="text" name="asid" required></td>
	</tr>
	<tr>
		<td> Emp No:</td>
		<td><input type="text" name="eno"></td>
	</tr>
	<tr>
		<td>Allocation Date :</td>
		<td><input type="Date" name="adate" required></td>
	</tr>
	<tr>
		<td>Release Date :</td>
		<td><input type="Date" name="rdate" required></td>
	</tr>
	<tr align="center">
		<td colspan="2"><input type="submit" value="Raise Request" style="background-color: yellowgreen;">&nbsp;&nbsp;&nbsp;&nbsp;
		<input type="reset" value="Clear" style="background-color: red;"></td>
	</tr>

</table>
</form>
</div>

</body>
</html>