package com.asset.controller;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.asset.services.AssetServiceJDBCimpl;


@WebServlet("/delemp")
public class DeleteEmpServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		String eid = req.getParameter("eid");
		
		int id =Integer.parseInt(eid);
		
		AssetServiceJDBCimpl impl=new AssetServiceJDBCimpl();
		boolean b=impl.deleteEmployee(id);
		
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
