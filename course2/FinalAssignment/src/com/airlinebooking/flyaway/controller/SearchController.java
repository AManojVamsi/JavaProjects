package com.airlinebooking.flyaway.controller;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.airlinebooking.flyaway.dao.FlightDoa;
import com.airlinebooking.flyaway.dao.RouteDoa;

public class SearchController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			RouteDoa routeDoa = new RouteDoa();
			Integer routeId = routeDoa.getRouteId(request.getParameter("source"), request.getParameter("destination"));

			FlightDoa flightDoa = new FlightDoa();
			ResultSet flightDetails = flightDoa.getFlightDetails(routeId);

			if (flightDetails.next()) {
				flightDetails.beforeFirst();
				request.setAttribute("flightDetails", flightDetails);
				request.setAttribute("source", request.getParameter("source"));
				request.setAttribute("destination", request.getParameter("destination"));
				request.setAttribute("date", request.getParameter("date"));
				

				request.getRequestDispatcher("flightsearchresult.jsp").forward(request, response);
			}
			else {
				request.getRequestDispatcher("error.jsp").forward(request, response);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
