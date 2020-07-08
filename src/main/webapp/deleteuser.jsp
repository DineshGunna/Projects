<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delete Asset</title>
<link rel="stylesheet" type="text/css" href="CSS/formdesign.css">
</head>
<body>

<div id="addform">
<form method="get" action="./deleteuserserv">
<p align="center" style="font-size: 25px;">Delete User</p>
<table align="center" cellpadding="10px" width="100%">
	<tr>
		<td>User Id :</td>
		<td><input type="text" name="userId" required></td>
	</tr>
	
	<tr align="center">
		<td colspan="2"><input type="submit" value="Delete User" style="background-color: yellowgreen;">&nbsp;&nbsp;&nbsp;&nbsp;
		<input type="reset" value="Clear" style="background-color: red;"></td>
	</tr>

</table>
</form>
</div>

</body>
</html>