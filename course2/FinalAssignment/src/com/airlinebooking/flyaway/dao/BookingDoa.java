package com.airlinebooking.flyaway.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.airlinebooking.flyaway.dbutlis.DataBaseConnection;

public class BookingDoa {

	public void ceateBooking(String phonenumber, int flightId) {
		try {
			Connection connection = DataBaseConnection.getConnection();
			PreparedStatement preparedStatement = connection
					.prepareStatement("insert into tbooking(phonenumber,flight_id) values(?,?)");

			preparedStatement.setString(1, phonenumber);
			preparedStatement.setInt(2, flightId);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
