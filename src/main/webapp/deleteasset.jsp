<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page session="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delete Asset</title>
<link rel="stylesheet" type="text/css" href="CSS/formdesign.css">
</head>
<body>
	<%
		HttpSession session = request.getSession(false);
		if (session == null) {
			response.sendRedirect("./login.jsp");
		}
	%>


	<div id="addform">
		<form method="get" action="./deleteassetserv">
			<p align="center" style="font-size: 25px;">Delete Assets</p>
			<table align="center" cellpadding="10px" width="100%">
				<tr>
					<td>Asset Id :</td>
					<td><input type="text" name="aid" required></td>
				</tr>
				<tr>
					<td>Asset Name :</td>
					<td><input type="text" name="aname" required></td>
				</tr>

				<tr align="center">
					<td colspan="2"><input type="submit" value="Delete Asset"
						style="background-color: yellowgreen;">&nbsp;&nbsp;&nbsp;&nbsp;
						<input type="reset" value="Clear" style="background-color: red;"></td>
				</tr>

			</table>
		</form>
	</div>

</body>
</html>