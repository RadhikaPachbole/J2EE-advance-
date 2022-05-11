package com.jsp.jdbc2ndwayImplimentation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//2nd way using path,user,password String Separately

public class jdbcimplimentation2nd {
        static Connection connection;
	 static Statement statement;
	 static ResultSet resultSet;

	public static void main(String[] args) {
		try {
			//1st register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2nd Establish the connection,getConnection() passing an argument
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/WEJM3","root","root");
			//3rd create the query in String format
			
			String query="select * from students";
			//4th create the statement
			statement=connection.createStatement();
		
			//5th Execute the query this statement gives the result
			resultSet=statement.executeQuery(query);
			while(resultSet.next())
			{
				System.out.println(resultSet.getString(1)+"  |  "+resultSet.getString(2)+"  |  "+resultSet.getString(3)+"  |  "+resultSet.getString(4));
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
