package com.xworkz.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.constants.ConnectionConstants;

public class Runner {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement prst = null;
		try {
			con = DriverManager.getConnection(ConnectionConstants.URL.getValue(),
					ConnectionConstants.USERNAME.getValue(), ConnectionConstants.PASSWORD.getValue());

			prst = con.prepareStatement("INSERT INTO Pre_stmnt VALUES (?, ?, ?)");
			prst.setInt(1, 1);
			prst.setString(2, "Bacardi");
			prst.setString(3, "250");

		int value = prst.executeUpdate();

			if (value > 0) {
				System.out.println("Saved");
			} else {
				System.out.println("Not saved");
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
