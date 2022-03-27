package com.airlinebooking.flyaway.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.airlinebooking.flyaway.dao.FlightDoa;
import com.airlinebooking.flyaway.dao.RouteDoa;
import com.airlinebooking.flyaway.model.Flight;

public class FlightController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		Flight flight = new Flight();
		flight.setName(request.getParameter("name"));
		flight.setRate(Integer.parseInt(request.getParameter("rate")));

		RouteDoa routeDoa= new RouteDoa();
		Integer routeId = routeDoa.getRouteId(request.getParameter("source"),request.getParameter("destination"));
		
		
		flight.setRouteId(routeId);
		
		FlightDoa flightDoa= new FlightDoa();
		flightDoa.createFlight(flight);
		
		request.getRequestDispatcher("success.jsp").forward(request, response);


	}

}
