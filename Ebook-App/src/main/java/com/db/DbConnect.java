package com.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnect {
	
	private static Connection conn;
	public static Connection getConn()
	{
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");  
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ebook_app?serverTimezone=UTC","root","password");			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
}
