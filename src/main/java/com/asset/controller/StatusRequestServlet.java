package com.asset.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.asset.dto.Asset;
import com.asset.services.AssetServiceJDBCimpl;



@WebServlet("/statusrequest")
public class StatusRequestServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		AssetServiceJDBCimpl impl=new AssetServiceJDBCimpl();
		List<Asset> a= impl.statusRequest();
		if(a!=null)
		{
			req.setAttribute("requestdata",a); 
		    RequestDispatcher rd=req.getRequestDispatcher("./StatusRequest.jsp");   		    
		    rd.forward(req, resp);
		}
		
	}
	}

