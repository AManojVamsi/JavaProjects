package com.airlinebooking.flyaway.dbutlis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {

	private static final String URL = "jdbc:mysql://localhost:3306/flyaway";

	private static final String USERNAME = "root";

	private static final String PASSWORD = "root";

	public static Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (SQLException | ClassNotFoundException exception) {
			exception.printStackTrace();
		}
		return connection;

	}

}
