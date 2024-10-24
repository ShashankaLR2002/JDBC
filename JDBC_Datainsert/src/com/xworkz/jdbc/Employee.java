package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Employee {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/Employee_details";
		String userName = "root";
		String password = "Shashank@2002";

		String insertQuery = "INSERT INTO Employee_table (Employee_id, name, email) VALUES (20, 'Harish', 'harish@gmail.com')";
		Connection connection = null;
		Statement statement = null;

		try {

			connection = DriverManager.getConnection(url, userName, password);
			statement = connection.createStatement();

			int value = statement.executeUpdate(insertQuery);

			if (value > 0) {
				System.out.println(value + " records saved successfully for first table.");
			} else {
				System.out.println("No records saved.");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}


	}

}