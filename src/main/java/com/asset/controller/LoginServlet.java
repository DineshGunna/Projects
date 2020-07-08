package com.asset.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.asset.dto.User;
import com.asset.services.AssetServiceJDBCimpl;



@WebServlet("/login1")
public class LoginServlet extends HttpServlet {
	
	

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username1 = req.getParameter("username");
		String password1 = req.getParameter("password");
		String usertype1 = req.getParameter("usertype");
		
		
		
//		System.out.println("Inside LoginServ");
		AssetServiceJDBCimpl impl = new AssetServiceJDBCimpl();
		User u = impl.login(username1, password1, usertype1);

		if(u!=null)
		{
			if(usertype1.equalsIgnoreCase("Admin"))
			{
				HttpSession session = req.getSession(false);
				session.setAttribute("user", u);
				resp.sendRedirect("./adminpage.jsp");
				
			}
			if(usertype1.equalsIgnoreCase("Manager"))
			{
				HttpSession session = req.getSession(false);
				session.setAttribute("user", u);
				resp.sendRedirect("./userpage.jsp");
			}
			else
			{
				System.out.println("Choose some user");
			}
			
		}else {
			//Login Failed
			System.out.println("Login Failed");
			resp.sendRedirect("./login.jsp");
		}
		
	}
}
