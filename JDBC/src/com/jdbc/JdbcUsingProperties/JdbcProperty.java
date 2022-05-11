package com.jdbc.JdbcUsingProperties;
//3rd way by using or creating properties file
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JdbcProperty {
	 private static Connection connection;
	 private static FileReader fileReader;
	 private static Properties properties;
	 private static Statement statement;
	 private static ResultSet resultSet;
	


	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			fileReader=new FileReader("G:\\WEJM3\\JDBC\\resources\\dbProperties.properties");
			properties=new Properties();
			properties.load(fileReader);
			connection=DriverManager.getConnection(properties.getProperty("dburl"),properties.getProperty("user"),properties.getProperty("password"));
			statement=connection.createStatement();
			String query="select*from students";
			resultSet=statement.executeQuery(properties.getProperty(query));
			while(resultSet.next())
			{
				System.out.println(resultSet.getString(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
				System.out.println(resultSet.getString(4));
				System.out.println(resultSet.getString(5));

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
			if(connection !=null)
			{
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
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
			if(resultSet!=null)
			{
				try {
					resultSet.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
       
	}

}
