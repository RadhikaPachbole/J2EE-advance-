package com.JDBC.DynamicInsertUpdateDelete;

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

public class UpdateDynamicExample {
	private static FileReader filereader;
	private static Properties properties;
	private static Connection connection;
	private static PreparedStatement preparedStatement;
	private static Scanner sc=new Scanner(System.in);
	private static ResultSet resultset;

	public static void main(String[] args) 
	{
		try {
			filereader=new FileReader("G:\\WEJM3\\JDBC Practice\\resources\\dbBrand.properties");
			properties=new Properties();
			properties.load(filereader);
			connection=DriverManager.getConnection(properties.getProperty("dburl"),properties.getProperty("user"),properties.getProperty("password"));
			preparedStatement=connection.prepareCall(properties.getProperty("Update"));
			
			System.out.println("Enter the name which you want to Update: ");
			preparedStatement.setString(1,sc.next());
			System.out.println("Enter the brand Id which you want to Update : ");
			preparedStatement.setInt(2,sc.nextInt());
			
			int resultInt=preparedStatement.executeUpdate();
			System.out.println(resultInt+" Row Updated ");
			
			preparedStatement=connection.prepareStatement(properties.getProperty("Display"));
			resultset=preparedStatement.executeQuery();
			while (resultset.next()) 
			{
				System.out.println(resultset.getString(1));
				System.out.println(resultset.getString(2));
				System.out.println(resultset.getString(3));
				
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
