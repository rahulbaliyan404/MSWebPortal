package com.home.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class DbConnection {
	private static final String DRIVER;
	private static final String URL;
	private static final String USERNAME;
	private static final String PASSWORD;

	static {
		DRIVER = "com.mysql.jdbc.Driver";
		URL = "jdbc:mysql:localhost:3306:mydb";
		USERNAME = "root";
		PASSWORD = "root";
	}

	private static Connection connection;

	public static Connection getConnection() throws SQLException {
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return connection;
	}
}
