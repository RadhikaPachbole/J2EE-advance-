package com.jdbc.jdbcimplementation;
//1st way of Single URL String as argument jdbc implementation

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcImplimentation {

	static Connection connection;
	static Statement statement;
	static ResultSet resultSet;
	
	public static void main(String[] args) {
		try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				//String path--username---password
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/WEJM3?user=root & password=root");
		 String query="select * from students";	
				   statement=connection.createStatement();
				     resultSet=statement.executeQuery(query);
				     while(resultSet.next())
				     {
				    System.out.println(resultSet.getString(1)+" | "+resultSet.getString(2)+" | "+resultSet.getString(3)+" | "+resultSet.getString(4));
				    	 
				     }
				 } catch (ClassNotFoundException e) {
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
