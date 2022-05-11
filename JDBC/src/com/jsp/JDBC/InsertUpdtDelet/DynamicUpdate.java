package com.jsp.JDBC.InsertUpdtDelet;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

public class DynamicUpdate {
	
	private static FileReader fileReader;
	private static Properties properties;
	private static Connection connection;
	private static PreparedStatement preparedStatement;
	private static Scanner sc=new Scanner(System.in);
	private static int result;
	
	public static void main(String[] args) 
	{
		try {
			fileReader=new FileReader("G:\\WEJM3\\JDBC\\resources\\dbCustomerProperties.properties");
			properties=new Properties();
			properties.load(fileReader);
			connection=DriverManager.getConnection(properties.getProperty("dburl"),properties.getProperty("user"),properties.getProperty("password"));
			preparedStatement=connection.prepareStatement(properties.getProperty("update"));
			
			
			System.out.println("Enter the name u want to Update : ");
			preparedStatement.setString(2,sc.next());
			System.out.println("Enter the cid where u want to Update : ");
			preparedStatement.setInt(1,sc.nextInt());
			
			result=preparedStatement.executeUpdate();
			System.out.println(result+" row Updated");
			
			
			
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
