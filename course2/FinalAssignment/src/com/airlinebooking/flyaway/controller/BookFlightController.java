package com.airlinebooking.flyaway.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

public class BookFlightController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, javax.servlet.http.HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setAttribute("flightname", request.getParameter("flightname"));
		request.setAttribute("source", request.getParameter("source"));
		request.setAttribute("destination", request.getParameter("destination"));
		request.setAttribute("rate", request.getParameter("rate"));
		request.setAttribute("flightid", request.getParameter("flightid"));
		request.setAttribute("date", request.getParameter("date"));

		request.getRequestDispatcher("payment.jsp").forward(request, response);
	}

}
