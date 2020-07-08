package com.asset.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.asset.dto.Employee;
import com.asset.services.AssetServiceJDBCimpl;



@WebServlet("/empupdate")
public class UpdateEmpServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		String eid = req.getParameter("eno");
		String ename = req.getParameter("ename");
		String job=req.getParameter("job");
		String mgr=req.getParameter("mgr");
		String deptid=req.getParameter("did");
		
		
		int id =Integer.parseInt(eid);
		int depid=Integer.parseInt(deptid);
		int manager=Integer.parseInt(mgr);
		
		Employee e=new Employee();
		e.setEmpNo(id);
		e.setEname(ename);
		e.setJob(job);
		e.setMgr(manager);
		e.setDeptId(depid);
		
		AssetServiceJDBCimpl impl=new AssetServiceJDBCimpl();
		boolean b=impl.updateEmployee(e);
		
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
