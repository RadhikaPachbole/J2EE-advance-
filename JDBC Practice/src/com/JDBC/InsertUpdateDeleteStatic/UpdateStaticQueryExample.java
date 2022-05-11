package com.JDBC.InsertUpdateDeleteStatic;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class UpdateStaticQueryExample
{
	private static FileReader fileReader;
	private static Properties properties;
	private static Connection connection;
	private static Statement statement;
	private static int resultInt;

	public static void main(String[] args) 
	{
		try {
			fileReader=new FileReader("G:\\WEJM3\\JDBC Practice\\resources\\farmerDB.properties");
			properties=new Properties();
			properties.load(fileReader);
			connection=DriverManager.getConnection(properties.getProperty("dburl"),properties.getProperty("user"),properties.getProperty("password"));
			statement=connection.createStatement();
			resultInt=statement.executeUpdate(properties.getProperty("Update"));
			System.out.println(resultInt+" Update row affected ");
			resultInt+=statement.executeUpdate(properties.getProperty("Update1"));
			System.out.println(resultInt+" Update row affected ");
			System.out.println(" ");
			System.out.println(resultInt+" Total Rows affected ");
			
			
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
