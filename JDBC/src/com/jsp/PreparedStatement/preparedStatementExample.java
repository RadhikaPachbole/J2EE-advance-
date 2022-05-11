package com.jsp.PreparedStatement;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class preparedStatementExample {
	private static FileReader fileReader;
	private static Properties properties;
	private static Connection connection;
	private static PreparedStatement preparedStatement;
   
   //private static int result;
	
	private static ResultSet resultSet;

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			fileReader=new FileReader("G:\\WEJM3\\JDBC\\resources\\dbProperties.properties");
			properties=new Properties();
			properties.load(fileReader);
			connection = DriverManager.getConnection(properties.getProperty("dburl"),properties.getProperty("user"),properties.getProperty("password"));
			preparedStatement=connection.prepareStatement(properties.getProperty("query"));
			resultSet=preparedStatement.executeQuery();
			while (resultSet.next())
			{
				System.out.println(resultSet.getString(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
				System.out.println(resultSet.getString(4));
				System.out.println(resultSet.getString(5));
				System.out.println();

           }
			
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
	}

}
