package com.airlinebooking.flyaway.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.airlinebooking.flyaway.dbutlis.DataBaseConnection;
import com.airlinebooking.flyaway.model.Route;

public class RouteDoa {

	public Route createRoute(Route route) {
		try {
			Connection connection = DataBaseConnection.getConnection();
			PreparedStatement preparedStatement = connection
					.prepareStatement("insert into troute(source,destination) values(?,?)");

			preparedStatement.setString(1, route.getSource());
			preparedStatement.setString(2, route.getDestination());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return route;
	}

	public Integer getRouteId(String source, String destination) {
		Integer routeId = null;

		try {
			Connection connection = DataBaseConnection.getConnection();
			PreparedStatement preparedStatement;
			preparedStatement = connection
					.prepareStatement("select route_id from  troute where source= ? and destination =?");
			preparedStatement.setString(1, source);
			preparedStatement.setString(2, destination);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				routeId = resultSet.getInt("route_id");

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return routeId;
	}

	public static ResultSet getSource() {
		ResultSet resultSet = null;

		try {
			Connection connection = DataBaseConnection.getConnection();
			PreparedStatement preparedStatement;
			preparedStatement = connection.prepareStatement("select distinct source from  troute");

			resultSet = preparedStatement.executeQuery();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return resultSet;
	}
	
	public static ResultSet getDestination() {
		ResultSet resultSet = null;

		try {
			Connection connection = DataBaseConnection.getConnection();
			PreparedStatement preparedStatement;
			preparedStatement = connection.prepareStatement("select distinct destination from  troute");

			resultSet = preparedStatement.executeQuery();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return resultSet;
	}

}
