package com.JDBC.CollectionObject;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class RTOObjectExample {
	private static FileReader fileReader;
	private static Properties properties;
	private static Connection connection;
	private static Statement statement;
	private static ResultSet resultSet;
	private static List<RTO> rtolist=new ArrayList<>();

	public static void main(String[] args)
	{
		try {
			fileReader=new FileReader("G:\\WEJM3\\JDBC Practice\\resources\\dbProperties.properties");
			properties=new Properties();
			properties.load(fileReader);
			connection=DriverManager.getConnection(properties.getProperty("dburl"),properties.getProperty("user"),properties.getProperty("password"));
			statement=connection.createStatement();
			resultSet=statement.executeQuery(properties.getProperty("display"));
			while (resultSet.next()) 
			{
				RTO obj=new RTO();
				obj.setR_id(resultSet.getInt(1));//get the data with respect to data type
				obj.setName(resultSet.getString(2));
				obj.setAddress(resultSet.getString(3));
				obj.setPh_no(resultSet.getLong(4));
				System.out.println(obj);
				
			}
			for (Object o : rtolist) 
			{
			    System.out.println(o);	
			}
			
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
