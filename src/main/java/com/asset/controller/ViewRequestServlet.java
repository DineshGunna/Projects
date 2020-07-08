package com.asset.controller;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.asset.dto.Asset;
import com.asset.dto.AssetRequest;
import com.asset.services.AssetServiceJDBCimpl;



@WebServlet("/viewreq")
public class ViewRequestServlet extends HttpServlet {

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		AssetServiceJDBCimpl impl=new AssetServiceJDBCimpl();
		List<AssetRequest> a= impl.fetchRequest();
		if(a!=null)
		{
			req.setAttribute("assetreq",a); 
		    RequestDispatcher rd=req.getRequestDispatcher("./ViewRequest.jsp");   		    
		    rd.forward(req, resp);
		}
		
	}
	}
