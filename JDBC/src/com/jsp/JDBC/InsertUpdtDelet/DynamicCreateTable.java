package com.jsp.JDBC.InsertUpdtDelet;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.util.Properties;

//Passing Dynamic Query and Creation Of Table---->Customer Table is created

public class DynamicCreateTable {
	private static FileReader fileReader;
	private static Properties properties;
	private static Connection connection;
	private static PreparedStatement preparedStatement;

	public static void main(String[] args) 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			fileReader=new FileReader("G:\\WEJM3\\JDBC\\resources\\dbCustomerProperties.properties");
			properties=new Properties();
			properties.load(fileReader);
			connection=DriverManager.getConnection(properties.getProperty("dburl"),properties.getProperty("user"),properties.getProperty("password"));
			preparedStatement=connection.prepareStatement(properties.getProperty("create"));
			int resultInt=preparedStatement.executeUpdate();
			System.out.println(resultInt+" Customer Table is Created ");
			
			
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
