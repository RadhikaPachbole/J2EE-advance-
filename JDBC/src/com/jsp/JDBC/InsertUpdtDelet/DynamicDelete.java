package com.jsp.JDBC.InsertUpdtDelet;
//Dynamic Update passing a dynamic Query
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

public class DynamicDelete {
	private static FileReader fileReader;
	private static Properties properties;
	private static Connection connection;
	private static PreparedStatement preparedStatement;
	static Scanner sc=new Scanner(System.in);
     private static int result;
     private static ResultSet resultSet;
	public static void main(String[] args) {
		try {
			fileReader=new FileReader("G:\\WEJM3\\JDBC\\resources\\dbCustomerProperties.properties");
			properties=new Properties();
			properties.load(fileReader);
			connection=DriverManager.getConnection(properties.getProperty("dburl"),properties.getProperty("user"),properties.getProperty("password"));
			
			//Delete Record Successfully
			preparedStatement = connection.prepareStatement(properties.getProperty("delete")); 
			 System.out.println("Enter the cid whatever u want to Delete :");
			 preparedStatement.setInt(1,sc.nextInt());
			 result=preparedStatement.executeUpdate();
			 System.out.println(result+" row (s) Deleted");
			 
			 //Display Record Successfully
			 preparedStatement=connection.prepareStatement(properties.getProperty("display"));
			 resultSet=preparedStatement.executeQuery();
			 while (resultSet.next()) 
			 {
				 System.out.println(resultSet.getString(1));
				 System.out.println(resultSet.getString(2));
				 System.out.println(resultSet.getString(3));
				 System.out.println();
				
			}
			 System.out.println("  After Deleting Updated Table Display  ");
			 
			 
			
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
