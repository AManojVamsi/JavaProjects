package com.airlinebooking.flyaway.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.airlinebooking.flyaway.dbutlis.DataBaseConnection;

public class AdminDao {

	public  static boolean validaLogin(String username, String password) {
		try {
			Connection connection = DataBaseConnection.getConnection();
			PreparedStatement preparedStatement = connection
					.prepareStatement("select * from tadmin where admin_name=? and admin_pass=?");

			preparedStatement.setString(1, username);
			preparedStatement.setString(2, password);
			ResultSet resultset = preparedStatement.executeQuery();
			return resultset.next();
		} catch (SQLException e) {
			return false;
		}

	}

	public static boolean updatePassword(String userName, String password) {
		try {
			Connection connection = DataBaseConnection.getConnection();
			PreparedStatement preparedStatement = connection
					.prepareStatement("update tadmin set admin_pass=? where admin_name=?");

			preparedStatement.setString(1, password);
			preparedStatement.setString(2, userName);
		 int executeUpdate = preparedStatement.executeUpdate();
		 return executeUpdate>0;
		} catch (SQLException e) {
			return false;
		}

	}

}
