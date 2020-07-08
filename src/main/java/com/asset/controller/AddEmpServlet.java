package com.asset.controller;

import java.io.IOException;
import java.io.PrintWriter;

import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.asset.dto.Employee;
import com.asset.services.AssetServiceJDBCimpl;


@WebServlet("/addemp")
public class AddEmpServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		
		try
		{
		
		String eid = req.getParameter("eno");
		String ename = req.getParameter("ename");
		String job=req.getParameter("job");
		String mgr=req.getParameter("manager");
		//String hiredate=req.getParameter("hiredate");
		String deptid=req.getParameter("deptid");
		
		
		int id =Integer.parseInt(eid);
		int depid=Integer.parseInt(deptid);
		int manager=Integer.parseInt(mgr);
		
		SimpleDateFormat st=new SimpleDateFormat("yyyy-mm-dd");
		java.util.Date hiredate=st.parse(req.getParameter("hiredate"));
		java.sql.Date hdate=new java.sql.Date(hiredate.getTime());
		
		
		
		Employee e=new Employee();
		e.setEmpNo(id);
		e.setEname(ename);
		e.setJob(job);
		e.setMgr(manager);
		e.setHireDate(hdate);
		e.setDeptId(depid);
		
		AssetServiceJDBCimpl impl=new AssetServiceJDBCimpl();
		boolean b=impl.addEmployee(e);
		
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
