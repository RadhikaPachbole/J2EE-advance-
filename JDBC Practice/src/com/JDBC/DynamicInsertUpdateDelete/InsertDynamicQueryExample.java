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

public class InsertDynamicQueryExample {
	private static FileReader fileReader;
	private static Properties properties;
    private static Connection connection;
    private static PreparedStatement preparedStatement;
    private static Scanner sc=new Scanner(System.in);
    private static ResultSet resultSet;
	public static void main(String[] args) 
	{
		try {
			fileReader=new FileReader("G:\\WEJM3\\JDBC Practice\\resources\\dbBrand.properties");
			properties=new Properties();
			properties.load(fileReader);
			connection=DriverManager.getConnection(properties.getProperty("dburl"),properties.getProperty("user"),properties.getProperty("password"));
			preparedStatement=connection.prepareStatement(properties.getProperty("Insert"));
			
			System.out.println("Enter the brand Id:  ");
			preparedStatement.setInt(1,sc.nextInt());
			
			System.out.println("Enter the brand Name:  ");
			preparedStatement.setString(2,sc.next());
			
			System.out.println("Enter the Ratings : ");
			preparedStatement.setInt(3,sc.nextInt());
			
			int resultInt =preparedStatement.executeUpdate();
			System.out.println(+resultInt+" Row Inserted ");
			
			preparedStatement=connection.prepareStatement(properties.getProperty("Display"));
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
