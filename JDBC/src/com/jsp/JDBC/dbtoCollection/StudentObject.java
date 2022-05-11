package com.jsp.JDBC.dbtoCollection;
//jdbc to collection--->using List Interface-->purpose of that data record convert to java Object 
//conversion of table attribute of different type is convert to java object-->internally work as a Collection
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

public class StudentObject {
	private static Connection connection;
	private static FileReader fileReader;
	private static Statement statement;
	private static ResultSet resultSet;
	private static Properties properties=new Properties();
    private static List<Students> studentList=new ArrayList<>();
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			fileReader=new FileReader("G:\\WEJM3\\JDBC\\resources\\dbProperties.properties");
			properties.load(fileReader);
			connection=DriverManager.getConnection(properties.getProperty("dburl"),properties.getProperty("user"),properties.getProperty("password"));
			statement=connection.createStatement();
			resultSet=statement.executeQuery(properties.getProperty("query"));
			while (resultSet.next()) {
				Students students=new Students();
				students.setStudentsId(resultSet.getInt(1));
				students.setStudentsName(resultSet.getString(2));
				students.setEmailId(resultSet.getString(3));
				students.setPhoneNumber(resultSet.getLong(4));
				students.setAddress(resultSet.getString(5));
				System.out.println(students);
				
			}
			for (Object o:studentList) {
				System.err.println(o);
				
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
