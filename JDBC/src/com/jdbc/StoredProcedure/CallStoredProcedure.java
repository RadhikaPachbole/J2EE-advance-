package com.jdbc.StoredProcedure;

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
	private static FileReader filereader;
	private static Properties properties;
	private static Connection connection;
	

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			filereader=new FileReader("G:\\WEJM3\\JDBC\\resources\\dbProperties.properties");
			properties=new Properties();
			properties.load(filereader);
			connection=DriverManager.getConnection(properties.getProperty("dburl"),properties.getProperty("user"),properties.getProperty("password"));
			
		    CallableStatement prepareCall=connection.prepareCall("call proc");
			ResultSet executeQuery=prepareCall.executeQuery();
			while (executeQuery.next()) {
				System.out.println(executeQuery.getInt("eid"));
				System.out.println(executeQuery.getString("ename"));
				//System.out.println(executeQuery.getString("sal"));
				
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
