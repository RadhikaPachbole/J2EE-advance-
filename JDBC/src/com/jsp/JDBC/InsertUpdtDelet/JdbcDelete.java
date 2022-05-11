package com.jsp.JDBC.InsertUpdtDelet;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;


public class JdbcDelete {
	private static FileReader filereader;
	private static Properties properties;
	private static Connection connection;
	private static Statement statement;
	private static int resultInt;

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			filereader=new FileReader("G:\\WEJM3\\JDBC\\resources\\dbProperties.properties");
			properties=new Properties();
			properties.load(filereader);
			connection=DriverManager.getConnection(properties.getProperty("dburl"),properties.getProperty("user"),properties.getProperty("password"));
			statement=connection.createStatement();
			resultInt=statement.executeUpdate(properties.getProperty("query6"));
			resultInt=statement.executeUpdate(properties.getProperty("query7"));
			System.out.println(resultInt +"rows (s) Deleted");
			
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
