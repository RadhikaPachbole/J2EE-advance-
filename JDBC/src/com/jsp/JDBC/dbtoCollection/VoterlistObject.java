package com.jsp.JDBC.dbtoCollection;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class VoterlistObject {
	private static FileReader fileReader;
	private static Connection connection;
	private static Statement statement;
	private static ResultSet resultSet;
	private static Properties properties=new Properties();

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			fileReader=new FileReader("G:\\WEJM3\\JDBC\\resources\\dbvoterlist.properties");
			properties.load(fileReader);
			connection=DriverManager.getConnection(properties.getProperty("dburl"),properties.getProperty("user"),properties.getProperty("password"));
			statement=connection.createStatement();
			resultSet=statement.executeQuery(properties.getProperty("query"));
			while (resultSet.next()) {
				voterlist voterlist = new voterlist(); 
				voterlist.setVoter_id(resultSet.getInt(1));
				voterlist.setName(resultSet.getString(2));
				voterlist.setPhone_no(resultSet.getLong(3));
				voterlist.setAddress(resultSet.getNString(4));
				voterlist.setWard_no(resultSet.getInt(5));
				System.out.println(voterlist);
				
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
			if(connection!=null)
			{
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

}
