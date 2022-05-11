package com.jsp.JDBC.InsertUpdtDelet;
//This Prog Insert the record using Properties file or prog java or execute query
//Hard coded Query pass in that is an static query it is also called as an static Query
//The Query which is present in .properties file
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
public class JdbcInsUpdDel {
	private static FileReader filereader;
	private static Properties properties;
	private static Connection connection;
	private static Statement statement;
	private static int resultInt;

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			filereader=new FileReader("G:\\WEJM3\\JDBC\\resources\\dbProperties.properties");
			properties=new Properties();
			properties.load(filereader);
			connection=DriverManager.getConnection(properties.getProperty("dburl"),properties.getProperty("user"),properties.getProperty("password"));
			//create statement process on query an prepare a statement
			statement=connection.createStatement();
			//executeUpdate consist work on 3 type Insert,update,delete--return type is integer format
			resultInt=statement.executeUpdate(properties.getProperty("query2"));
			resultInt +=statement.executeUpdate(properties.getProperty("query3"));
			// 2 row or record inserted
			System.out.println(resultInt+"row (s) affected");
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
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
				if (filereader!=null) {
					try {
						filereader.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
					
					}
					
				}
				
				
			}
			
		
	}


