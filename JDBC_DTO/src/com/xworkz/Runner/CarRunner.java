package com.xworkz.Runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.xworkz.connection.ConnectionConstants;
import com.xworkz.dto.CarDTO;

public class CarRunner {
    public static void main(String[] args) {
        CarDTO cdto = new CarDTO(1, "Vinay", "AudiQ7", 1.400000);
        CarDTO cdto1 = new CarDTO(2, "Vithesh", "MercedesMaybach", 8.500000);
        CarDTO cdto2 = new CarDTO(3, "Puttaraj", "LamborghiniUrus", 4.500000);
        CarDTO cdto3 = new CarDTO(4, "Shamanth", "Thar", 1800000);
        CarDTO cdto4 = new CarDTO(5, "Shashank", "RangeRover", 1.500000);
        CarDTO cdto5 = new CarDTO(6, "Arjun", "Defender", 5.000000);
        CarDTO cdto6 = new CarDTO(7, "Akshay", "InnovaCrysta", 1800000);
        CarDTO cdto7 = new CarDTO(8, "Siddarth", "MiniCooper", 4000000);
        CarDTO cdto8 = new CarDTO(9, "Kavya", "Endeavour", 4500000);
        CarDTO cdto9 = new CarDTO(10, "Chandini", "Discovery", 2500000);

        Connection con = null;
        PreparedStatement preparedStatement = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            con = DriverManager.getConnection(ConnectionConstants.URL.getValue(),ConnectionConstants.USERNAME.getValue(),ConnectionConstants.PASSWORD.getValue());

            String insertQuery = "INSERT INTO Car_table (id, owner, model, price) VALUES (?, ?, ?, ?)";
            preparedStatement = con.prepareStatement(insertQuery);

            preparedStatement.setInt(1, cdto.getId());
            preparedStatement.setString(2, cdto.getName());
            preparedStatement.setString(3, cdto.getModel());
            preparedStatement.setDouble(4, cdto.getPrice());
            preparedStatement.addBatch();

            preparedStatement.setInt(1, cdto1.getId());
            preparedStatement.setString(2, cdto1.getName());
            preparedStatement.setString(3, cdto1.getModel());
            preparedStatement.setDouble(4, cdto1.getPrice());
            preparedStatement.addBatch();

            preparedStatement.setInt(1, cdto2.getId());
            preparedStatement.setString(2, cdto2.getName());
            preparedStatement.setString(3, cdto2.getModel());
            preparedStatement.setDouble(4, cdto2.getPrice());
            preparedStatement.addBatch();

            preparedStatement.setInt(1, cdto3.getId());
            preparedStatement.setString(2, cdto3.getName());
            preparedStatement.setString(3, cdto3.getModel());
            preparedStatement.setDouble(4, cdto3.getPrice());
            preparedStatement.addBatch();

            preparedStatement.setInt(1, cdto4.getId());
            preparedStatement.setString(2, cdto4.getName());
            preparedStatement.setString(3, cdto4.getModel());
            preparedStatement.setDouble(4, cdto4.getPrice());
            preparedStatement.addBatch();

            preparedStatement.setInt(1, cdto5.getId());
            preparedStatement.setString(2, cdto5.getName());
            preparedStatement.setString(3, cdto5.getModel());
            preparedStatement.setDouble(4, cdto5.getPrice());
            preparedStatement.addBatch();

            preparedStatement.setInt(1, cdto6.getId());
            preparedStatement.setString(2, cdto6.getName());
            preparedStatement.setString(3, cdto6.getModel());
            preparedStatement.setDouble(4, cdto6.getPrice());
            preparedStatement.addBatch();

            preparedStatement.setInt(1, cdto7.getId());
            preparedStatement.setString(2, cdto7.getName());
            preparedStatement.setString(3, cdto7.getModel());
            preparedStatement.setDouble(4, cdto7.getPrice());
            preparedStatement.addBatch();

            preparedStatement.setInt(1, cdto8.getId());
            preparedStatement.setString(2, cdto8.getName());
            preparedStatement.setString(3, cdto8.getModel());
            preparedStatement.setDouble(4, cdto8.getPrice());
            preparedStatement.addBatch();

            preparedStatement.setInt(1, cdto9.getId());
            preparedStatement.setString(2, cdto9.getName());
            preparedStatement.setString(3, cdto9.getModel());
            preparedStatement.setDouble(4, cdto9.getPrice());
            preparedStatement.addBatch();

            int[] results = preparedStatement.executeBatch();
            System.out.println("Data inserted successfully for " + results.length + " records.");

        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Failed to connect to the database or execute the query.");
            e.printStackTrace();
        } 
        
    }
}
