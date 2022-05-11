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


public class HardCodedInsertUpDeleExample {
	
	private static FileReader filereader;
	private static Properties properties;
	private static Connection connection;
	private static PreparedStatement preparedStatement;
	//private static ResultSet resultSet; 
	//private static Scanner sc=new Scanner(System.in);
	private static int resultInt;

	public static void main(String[] args) {
		try {
			filereader=new FileReader("G:\\WEJM3\\JDBC Practice\\resources\\dbStudent.properties");
			properties=new Properties();
			properties.load(filereader);
			connection=DriverManager.getConnection(properties.getProperty("dburl"),properties.getProperty("user"),properties.getProperty("password"));
			preparedStatement=connection.prepareStatement(properties.getProperty("create"));
			 resultInt=preparedStatement.executeUpdate();
			 System.out.println(resultInt+"Create Table Successfully");

	       preparedStatement=connection.prepareStatement(properties.getProperty("Insert"));
			preparedStatement.setInt(1,101);
			preparedStatement.setString(2,"Radhika");
			preparedStatement.setDouble(3,87);
			 resultInt=preparedStatement.executeUpdate();
			System.out.println(resultInt+"row created");
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
