package com.xworkz.jdbc;

public class DosaRunner 
{
	
	public static void main(String[] args) 
	{
		try {
			Class.forName("com.xworkz.jdbc.Dosa");
			System.out.println("Dosa class loaded successfully");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("MySQL JDBC Driver loaded successfully.");
		}catch (ClassNotFoundException c) {
			// TODO: handle exception
			c.printStackTrace();
		}
		
		
	}

}
