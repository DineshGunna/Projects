package com.asset.controller;

import java.io.IOException;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.asset.dto.Asset;

import com.asset.services.AssetServiceJDBCimpl;



@WebServlet("/viewallocated")
public class ViewAllocatedAssetServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		

		AssetServiceJDBCimpl impl=new AssetServiceJDBCimpl();
		List<Asset> a= impl.fetchAllocatedAsset();
		if(a!=null)
		{
			req.setAttribute("datalist",a); 
		    RequestDispatcher rd=req.getRequestDispatcher("./ViewAllocatedAsset.jsp");   		    
		    rd.forward(req, resp);
		}
		
	}
	}


