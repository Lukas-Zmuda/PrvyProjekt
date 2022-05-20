package edu.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class VytvorenieDB {

	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost";
	
	static final String USER = "root";
	static final String PASS = "";
	
	public static void main(String[] args) {
		
		Connection con = null;
		Statement stm = null;
		
		try {
			//toto nie je nutne v JDBC verziach > 4.0
			//Class.forName(JDBC_DRIVER);
			
			System.out.println("Prihlasujem sa na DB server ...");
			con = DriverManager.getConnection(DB_URL, USER, PASS);
			
			System.out.println("Vytvaram databazu skolenie ...");
			stm = con.createStatement();
			String sql = "CREATE DATABASE skolenie";
			stm.executeUpdate(sql);
			System.out.println("Databaza vytvorena ...");			
		}catch(SQLException se) {
			se.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(stm != null) {
					stm.close();
				}
			}catch(SQLException se2) {
				se2.printStackTrace();
			}
			
			try {
				if(con != null) {
					con.close();
				}
			}catch(SQLException se3) {
				se3.printStackTrace();
			}
		}

	}

}
