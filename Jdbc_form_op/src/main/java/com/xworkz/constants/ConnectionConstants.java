package com.xworkz.constants;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public enum ConnectionConstants {
    URL("jdbc:mysql://localhost:3306/Form_con_db"), 
    USERNAME("root"), 
    PASSWORD("Shashank@2002");

    private String value;

    private ConnectionConstants(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(), PASSWORD.getValue());
            
            if (connection == null) {
                System.err.println("Connection is null. Please check your database credentials and URL.");
            }

            return connection;
        } catch (SQLException e) {
            System.err.println("SQLException: " + e.getMessage());
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.err.println("ClassNotFoundException: MySQL JDBC Driver not found");
            e.printStackTrace();
        }
        return null;
    }

}