package com.asset.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.asset.services.AssetService;
import com.asset.services.AssetServiceJDBCimpl;



@WebServlet("/deleteuserserv")
public class DeleteUserServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		String userId =req.getParameter("userId");
		
		
		int uid =Integer.parseInt(userId);
		
		AssetService impl=new AssetServiceJDBCimpl();
		boolean b=impl.deleteUser(uid);
		if(b)
		{
			resp.sendRedirect("./Success.jsp");
		}
		else
		{
			resp.sendRedirect("./Failed.jsp");
		}
		
	}

}