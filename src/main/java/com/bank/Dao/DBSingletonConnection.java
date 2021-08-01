package com.bank.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBSingletonConnection {

	private static Connection conn=null;
	public static Connection getConnectionInstance() {
			  
			try {
				
				
				String URL="jdbc:mysql://localhost:3306/bank";
				
				String user="root";
				String pwd="root";
				
				Class.forName("com.mysql.cj.jdbc.Driver");
						conn=DriverManager.getConnection(URL,user,pwd);
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return conn;
		}
	
}
