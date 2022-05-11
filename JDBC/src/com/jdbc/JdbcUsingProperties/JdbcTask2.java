package com.jdbc.JdbcUsingProperties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JdbcTask2 {
	private static Connection connection;
	private static Statement statement;
	private static ResultSet resultset;
	private static FileReader filereader;
	private static Properties properties;

	
	static 
	{
		System.out.println("---|   Voters List 2022   |---");
		System.out.println();
	}

	public static void main(String[] args)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			filereader=new FileReader("G:\\WEJM3\\JDBC\\resources\\dbvoterlist.properties");
			properties=new Properties();
			properties.load(filereader);
			connection=DriverManager.getConnection(properties.getProperty("dburl"),
					properties.getProperty("user"),
					properties.getProperty("password"));
			statement=connection.createStatement();
			String query="select*from VOTERLIST";
			resultset=statement.executeQuery(properties.getProperty(query));
			while(resultset.next())
			{
				System.out.println(resultset.getString(1));
				System.out.println(resultset.getString(2));
				System.out.println(resultset.getString(3));
				System.out.println(resultset.getString(4));
				System.out.println(resultset.getString(5));
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
		finally {
			if (connection!=null) {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(statement!=null)
				{
					try {
						statement.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				if(resultset!=null)
				{
					try {
						resultset.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		}
		
	}

}
