package com.xworkz.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Student_Details {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/Student_details";
		String userName = "root";
		String password = "Shashank@2002";

		String insertQuery = "INSERT INTO Student_table (Student_id, name, usn) VALUES (20, 'pramath', '1nt21ec749')";

		Connection connection = null;
		Statement statement = null;

		try {
			connection = DriverManager.getConnection(url, userName, password);
			statement = connection.createStatement();

			int value = statement.executeUpdate(insertQuery);

			if (value > 0) {
				System.out.println(value + " record saved successfully for Student_table.");
			} else {
				System.out.println("No records saved.");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}