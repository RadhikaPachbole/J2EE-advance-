package com.JDBC.StoredProcedure;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class CallStoredProcedure {
	private static FileReader fileReader;
	private static Connection connection;
	private static Properties properties;
	

	public static void main(String[] args) 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			fileReader=new FileReader("G:\\WEJM3\\JDBC Practice\\resources\\dbProperties.properties");
			properties=new Properties();
			properties.load(fileReader);
			connection=DriverManager.getConnection(properties.getProperty("dburl"),properties.getProperty("user"),properties.getProperty("password"));
			CallableStatement prepareCall=connection.prepareCall("call Emp_Proc");
			ResultSet executeQuery=prepareCall.executeQuery();
			while (executeQuery.next())
			{
				System.out.println(executeQuery.getInt("comp_id"));
				System.out.println(executeQuery.getString("Name"));
				System.out.println(executeQuery.getLong("phno"));
				System.out.println(executeQuery.getString("addrs"));
				
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
		
			
		
	}
}
