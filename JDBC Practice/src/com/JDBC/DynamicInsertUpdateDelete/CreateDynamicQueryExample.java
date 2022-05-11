package com.JDBC.DynamicInsertUpdateDelete;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class CreateDynamicQueryExample {
	private static FileReader fileReader;
	private static Properties properties;
	private static Connection connection;
	private static PreparedStatement preparedStatement;

	public static void main(String[] args)
	{
		try {
			fileReader=new FileReader("G:\\WEJM3\\JDBC Practice\\resources\\dbBrand.properties");
			properties=new Properties();
			properties.load(fileReader);
			connection=DriverManager.getConnection(properties.getProperty("dburl"),properties.getProperty("user"),properties.getProperty("password"));
			preparedStatement=connection.prepareCall(properties.getProperty("create"));
			int resultInt=preparedStatement.executeUpdate();
			System.out.println(resultInt+"Create Table Successfully");
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
