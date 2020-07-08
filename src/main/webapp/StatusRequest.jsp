<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="com.asset.dto.Asset"%>
<%@page import="com.asset.dao.AssetDAOJDBCimpl"%>
<%@page import="com.asset.services.AssetServiceJDBCimpl"%>
<%@page import="java.sql.ResultSet"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page session="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Allocated Asset</title>
<link rel="stylesheet" type="text/css" href="CSS/table.css">
</head>
<body>
	 <%
		HttpSession session = request.getSession(false);
		if (session == null) {
			response.sendRedirect("./login.jsp");
		}
		
		else {
			List<Asset> list = (List<Asset>)request.getAttribute("requestdata");
			
			
			%>
			
			<style>
			
			table,th,td{
			border: 1px solid black;
			}
		</style>
		<h2 align="center">All Requests</h2>
		<center>
		<table cellpadding ="10" cellspacing = "5">
		<tr>
			
			<th>AssetId</th>
			<th>AssetName</th>
			<th>AssetDes</th>
			<th>Quantity</th>
			<th>Status</th>
		
		
		</tr>
		
		<%
		
		 for(int i=0;i< list.size();i++){
			 Asset at = (Asset) list.get(i);
			 
			 %>
			 
			 <tr>
			 
			 <td><%=at.getAssetId()%></td>
				<td><%=at.getAssetName()%></td>
				<td><%=at.getDes()%></td>
				<td><%=at.getQuantity()%></td>
				<td><%=at.getStatus()%></td>
			 
			 </tr>
			 
			 <% } %>
			 
			 </table>
			 
		
	<%
				}
			%>
</body>
</html>