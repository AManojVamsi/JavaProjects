package com.airlinebooking.flyaway.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.airlinebooking.flyaway.dao.AdminDao;

public class LoginController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String userName= request.getParameter("username");
		String password= request.getParameter("password");
		
		request.setAttribute("username", userName);
		
		boolean isValidUser = AdminDao.validaLogin(userName, password);
		
		if(isValidUser) {
			request.getRequestDispatcher("adminpanel.jsp").forward(request, response);
		}
		
		else {
			request.getRequestDispatcher("errorlogin.jsp").forward(request, response);
		}

	}

}
