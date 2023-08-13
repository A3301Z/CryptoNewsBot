package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Registration {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Registration registration = new Registration();
		registration.connectDB();
	}

	public void connectDB() throws SQLException, ClassNotFoundException {
		String url =  "jdbc:mysql://localhost:3306/cryptonewsbot";
		String username = "root";
		String pass = "Ghbdtn564896";

		Class.forName("com.mysql.cj.jdbc.Driver");
		try(Connection connection = DriverManager.getConnection(url, username, pass)) {
			System.out.println("Connection successful");
		}
	}
}
