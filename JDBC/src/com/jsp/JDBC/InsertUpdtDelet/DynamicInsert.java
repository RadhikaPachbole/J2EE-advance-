package com.jsp.JDBC.InsertUpdtDelet;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;


public class DynamicInsert {
	private static FileReader fileReader;
	private static Properties properties;
	private static Connection connection;
	private static PreparedStatement preparedStatement;
	private static Scanner sc=new Scanner(System.in);
	private static ResultSet resultSet;

	public static void main(String[] args) {
		try {
			fileReader=new FileReader("G:\\WEJM3\\JDBC\\resources\\dbCustomerProperties.properties");
			properties=new Properties();
			properties.load(fileReader);
			connection=DriverManager.getConnection(properties.getProperty("dburl"),properties.getProperty("user"),properties.getProperty("password"));
			
			//Insert Record In the table Dynamically
			preparedStatement=connection.prepareStatement(properties.getProperty("insert"));
			System.out.println("Enter cid: ");
			preparedStatement.setInt(1,sc.nextInt());
			System.out.println("Enter Name: ");
			preparedStatement.setString(2,sc.next());
			System.out.println("Enter Address:");
			preparedStatement.setString(3,sc.next());
			
			int resultInt=preparedStatement.executeUpdate();
			System.out.println(resultInt+" Row Inserted ");
			
			//Display Record code
			preparedStatement=connection.prepareStatement(properties.getProperty("display"));
			resultSet=preparedStatement.executeQuery();
			while (resultSet.next()) 
			{
				System.out.println(resultSet.getString(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
				
			}
			
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
