<%@page import="java.sql.Date"%>
<%@page import="com.asset.dto.AssetRequest"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page session="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Request</title>
<link rel="stylesheet" type="text/css" href="CSS/table.css">
</head>
<body>
	 <%
		HttpSession session = request.getSession(false);
		if (session == null) {
			response.sendRedirect("./login.jsp");
		}
		
		else {
			List<AssetRequest> list = (List<AssetRequest>)request.getAttribute("assetreq");
		
			%>
			
			<style>
			
			table,th,td{
			border: 1px solid black;
			}
		</style>
		<h2 align="center">All  Requests</h2>
		<center>
		<table cellpadding ="10" cellspacing = "5">
		<tr>
			
			<th>AllocationId</th>
			<th>AssetId</th>
			<th>Empno</th>
			<th>Allocation Date</th>
			<th>Release Date</th>
			
		
		
		</tr>
		
		<%
		
		 for(int i=0;i< list.size();i++){
			 AssetRequest at = (AssetRequest) list.get(i);
			 
			 %>
			 
			 <tr>
			 
			 <td><%=at.getAllocationId()%></td>
				<td><%=at.getAssetId()%></td>
				<td><%=at.getEmpNo()%></td>
				<td><%=at.getAllocationDate()%></td>
				<td><%=at.getReleaseDate()%></td>
			 
			 </tr>
			 
			 <% } %>
			 
			 </table>
			 
		
	<%
				}
			%>
</body>
</html>