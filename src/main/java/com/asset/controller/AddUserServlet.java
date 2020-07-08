package com.asset.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.asset.dto.User;
import com.asset.services.AssetServiceJDBCimpl;


@WebServlet("/adduserserv")
public class AddUserServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		String id = req.getParameter("uid");
		String name = req.getParameter("uname");
		String pass=req.getParameter("upass");
		String type=req.getParameter("utype");
		
		int uid =Integer.parseInt(id);
	
		
		User u=new User();
		u.setUserId(uid);
		u.setUserName(name);
		u.setPassword(pass);
		u.setUsertype(type);
			
		AssetServiceJDBCimpl impl=new AssetServiceJDBCimpl();
		boolean b=impl.createUser(u);
		
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


