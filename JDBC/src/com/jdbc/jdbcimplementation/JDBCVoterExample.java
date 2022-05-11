package com.jdbc.jdbcimplementation;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCVoterExample {
	static Connection connection;
	static Statement statement;
	static ResultSet resultSet;
	
	static 
	{
		System.out.println("   VOTER LIST 2022    ");
	}

	public static void main(String[] args) {
		
		    try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/VOTERLIST? user=root & password=root");
				String query="select* from VOTERLIST";
				statement=connection.createStatement();
				resultSet=statement.executeQuery(query);
				 while(resultSet.next())
			      {
			    	  System.out.println(resultSet.getString(1)+" | "+resultSet.getString(2)+" | "+resultSet.getString(3)+" | "+resultSet.getString(4)+" | "+resultSet.getString(5));
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
