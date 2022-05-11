package com.JDBC.JDBCImplimentation;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

//3rd way of Implimentation Using .Properties File-->Mention this url path & user,password in .properties file
public class thirdWayImplimentationExample {
	private static FileReader fileReader;
	private static Properties properties;
	private static Connection connection;
	private static Statement statement;
	private static ResultSet resultSet;
	
	static 
	{
		System.out.println("  RTO DETAILS TABLE 3rd WAY USING .properties File  ");
	}

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
	//when u r importing .properties file that time take inputfileReader for reading of .properties file
			//& create obj of Properties Class int that load() is present use them for load the .properties file 
			fileReader=new FileReader("G:\\WEJM3\\JDBC Practice\\resources\\dbProperties.properties");
			properties=new Properties();
			properties.load(fileReader);
			connection=DriverManager.getConnection(properties.getProperty("dburl"),properties.getProperty("user"),properties.getProperty("password"));
			statement=connection.createStatement();
			String query="select * from rto_details";
			resultSet=statement.executeQuery(query);
			while (resultSet.next())
			{
			      System.out.println(resultSet.getString(1)+" | "+
			                         resultSet.getString(2)+" | "+
			                         resultSet.getString(3)+" | "+
			                         resultSet.getString(4));
			      
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
			}
			if (statement!=null) {
				try {
					statement.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			if (resultSet!=null) {
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
