package com.jsp.JDBC.InsertUpdtDelet;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Employee {
	private static FileReader filereader;
	private static Properties properties;
	private static Connection connection;
	private static Statement statement;
	private static int resultInt;
	private static int resultup;
	private static int resultDe;

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			filereader=new FileReader("G:\\WEJM3\\JDBC\\resources\\dbEmployee.properties");
			properties=new Properties();
			properties.load(filereader);
			connection=DriverManager.getConnection(properties.getProperty("dburl"),properties.getProperty("user"),properties.getProperty("password"));
			statement=connection.createStatement();
			resultInt=statement.executeUpdate(properties.getProperty("query1"));
			resultInt +=statement.executeUpdate(properties.getProperty("query2"));
			resultInt +=statement.executeUpdate(properties.getProperty("query3"));
			resultInt +=statement.executeUpdate(properties.getProperty("query4"));
			resultInt +=statement.executeUpdate(properties.getProperty("query5"));
    
			System.out.println(resultInt+"rows (s) created");
			
			resultup=statement.executeUpdate(properties.getProperty("query6"));
			resultup +=statement.executeUpdate(properties.getProperty("query7"));
			 
			System.out.println(resultup+ "rows (s) Updated");
			
			resultDe=statement.executeUpdate(properties.getProperty("query8"));
			
			System.out.println(resultDe+"row (s) Deleted");
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if (connection!=null) {
				
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if (statement!=null) {
					try {
						statement.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				if(filereader!=null) 
				{
					try {
						filereader.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				}
				
			}
		}
		

}


