package com.airlinebooking.flyaway.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import com.airlinebooking.flyaway.dao.BookingDoa;

public class PaymentController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, javax.servlet.http.HttpServletResponse response)
			throws ServletException, IOException {

		int flightId = Integer.parseInt(request.getParameter("flightid"));
		String phoneNumber = request.getParameter("mobile");
		BookingDoa bookingDoa = new BookingDoa();
		bookingDoa.ceateBooking(phoneNumber, flightId);
		
		request.setAttribute("flightname", request.getParameter("flightname"));
		request.setAttribute("source", request.getParameter("source"));
		request.setAttribute("destination", request.getParameter("destination"));
		request.setAttribute("rate", request.getParameter("rate"));
		request.setAttribute("name", request.getParameter("name"));
		request.setAttribute("age", request.getParameter("age"));
		request.setAttribute("mobile", request.getParameter("mobile"));
		request.setAttribute("date", request.getParameter("date"));
		
		
		request.getRequestDispatcher("bookingsuccess.jsp").forward(request, response);
	}

}
