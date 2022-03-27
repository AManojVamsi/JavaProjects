package com.airlinebooking.flyaway.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.airlinebooking.flyaway.dao.RouteDoa;
import com.airlinebooking.flyaway.model.Route;

public class RouteController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		Route route = new Route();
		route.setSource(request.getParameter("source"));
		route.setDestination(request.getParameter("destination"));
		
		RouteDoa routeDoa= new RouteDoa();
		routeDoa.createRoute(route);
		
		request.getRequestDispatcher("success.jsp").forward(request, response);

	}

}
