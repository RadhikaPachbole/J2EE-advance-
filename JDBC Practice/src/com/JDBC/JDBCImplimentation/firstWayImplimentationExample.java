package com.JDBC.JDBCImplimentation;

//1st way of Implimentation Single URL String as Argument ---url along with Username & password

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class firstWayImplimentationExample {
	private static Statement statement;
	private static Connection connection;
	private static ResultSet resultSet;
	
	static {
		System.out.println("    RTO DETAILS LIST USING 1ST WAY    ");
	}
	

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice?user=root & password=root");
			String query="select* from rto_details";
			statement=connection.createStatement();
			resultSet=statement.executeQuery(query);
			while (resultSet.next()) {
				System.out.println(resultSet.getString(1)+ "  |  "+
						           resultSet.getString(2)+ "  |  "+
						           resultSet.getString(3)+ "  |  "+
						           resultSet.getString(4));
						
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 catch (SQLException e) {
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
			if (statement!=null)
			{
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
