package com.xworkz.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.cj.xdevapi.Statement;
import com.xworkz.constants.ConnectionConstants;
import com.xworkz.jdbcreadoperations.SelectQuery1;
import com.xworkz.jdbcreadoperations.SelectQuery2;
import com.xworkz.jdbcreadoperations.SelectQuery3;
import com.xworkz.jdbcreadoperations.SelectQuery4;
import com.xworkz.jdbcreadoperations.SelectQuery5;
import com.xworkz.jdbcreadoperations.SelectQuery6;
import com.xworkz.query.College;

public class StudentRunner {
	
    public static void main(String[] args) {

        Connection connection = null;
        try {
            connection = DriverManager.getConnection(ConnectionConstants.URL.getValue(),
                    ConnectionConstants.USERNAME.getValue(), ConnectionConstants.PASSWORD.getValue());
            java.sql.Statement statement = connection.createStatement();
            
        //    int value =statement.executeUpdate(new College().getInsertQuery());
        //    if(value>0) {
          //  	System.out.println("saveds");
          //  }
            ResultSet resultSet1 = statement.executeQuery(new SelectQuery1().getSelectQuery1());
            while (resultSet1.next()) {
                System.out.println(resultSet1.getString("name"));
            }
            System.out.println("###############################");

            ResultSet resultSet2 = statement.executeQuery(new SelectQuery2().getSelectQuery2());
            while (resultSet2.next()) {
                System.out.println(resultSet2.getString("name"));
            }
            System.out.println("###############################");

            ResultSet resultSet3 = statement.executeQuery(new SelectQuery3().getSelectQuery3());
            while (resultSet3.next()) {
                System.out.println(resultSet3.getString("YOP"));
            }
            System.out.println("###############################");

            ResultSet resultSet4 = statement.executeQuery(new SelectQuery4().getSelectQuery4());
            while (resultSet4.next()) {
                System.out.println(resultSet4.getString("email"));
                System.out.println(resultSet4.getString("password"));
            }
            System.out.println("###############################");

            ResultSet resultSet5 = statement.executeQuery(new SelectQuery5().getSelectQuery5());
            while (resultSet5.next()) {
                System.out.println(resultSet5.getString("email"));
                System.out.println(resultSet5.getString("password"));
            }
            System.out.println("###############################");

            ResultSet resultSet6 = statement.executeQuery(new SelectQuery6().getSelectQuery6());
            while (resultSet6.next()) {
                System.out.println(resultSet6.getString("name"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
