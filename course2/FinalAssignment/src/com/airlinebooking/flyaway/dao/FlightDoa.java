package com.airlinebooking.flyaway.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.airlinebooking.flyaway.dbutlis.DataBaseConnection;
import com.airlinebooking.flyaway.model.Flight;

public class FlightDoa {

	public Flight createRoute(Flight flight) {
		try {
			Connection connection = DataBaseConnection.getConnection();
			PreparedStatement preparedStatement = connection
					.prepareStatement("insert into tflights(name,rate) values(?,?)");

			preparedStatement.setString(1, flight.getName());
			preparedStatement.setInt(2, flight.getRate());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flight;
	}

	public Flight createFlight(Flight flight) {
		try {
			Connection connection = DataBaseConnection.getConnection();
			PreparedStatement preparedStatement = connection
					.prepareStatement("insert into tflights(name,rate,route_id) values(?,?,?)");

			preparedStatement.setString(1, flight.getName());
			preparedStatement.setInt(2, flight.getRate());
			preparedStatement.setInt(3, flight.getRouteId());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flight;
		
	}
	
	
	public ResultSet getFlightDetails(Integer sourceId) {
		ResultSet resultSet=null;
		try {
			Connection connection = DataBaseConnection.getConnection();
			PreparedStatement preparedStatement;
			preparedStatement = connection
					.prepareStatement("select * from  tflights where route_id=?");
			preparedStatement.setInt(1, sourceId);
			resultSet = preparedStatement.executeQuery();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return resultSet;
	}

}
