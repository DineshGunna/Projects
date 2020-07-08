package com.asset.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.asset.dto.AssetRequest;
import com.asset.services.AssetServiceJDBCimpl;



@WebServlet("/assetrequest")
public class AssetRequestServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try
		{
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		String allid = req.getParameter("aid");
		String asid = req.getParameter("asid");
		String empno=req.getParameter("eno");
		
		SimpleDateFormat st=new SimpleDateFormat("yyyy-mm-dd");
		java.util.Date alldate=st.parse(req.getParameter("adate"));
		java.sql.Date allocationdate=new java.sql.Date(alldate.getTime());
		
		SimpleDateFormat st1=new SimpleDateFormat("yyyy-mm-dd");
		java.util.Date reldate=st1.parse(req.getParameter("rdate"));
		java.sql.Date releasedate=new java.sql.Date(alldate.getTime());
		
		
		
		
		//String reldate=req.getParameter("rdate");
		
		int allocationid =Integer.parseInt(allid);
		int assetid=Integer.parseInt(asid);
		int employeeno=Integer.parseInt(empno);
		//Date releasedate=Date.valueOf(reldate);
			
		AssetRequest ar=new AssetRequest();
		ar.setAllocationId(allocationid);
		ar.setAssetId(assetid);
		ar.setEmpNo(employeeno);
		ar.setAllocationDate(allocationdate);
		ar.setReleaseDate(releasedate);
		
		AssetServiceJDBCimpl as=new AssetServiceJDBCimpl();
		boolean b=as.requestAsset(ar);
		
		if(b)
		{
			resp.sendRedirect("./Success.jsp");
		}
		else
		{
			resp.sendRedirect("./Failed.jsp");
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
