package edu.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class VytvorenieTabulky {
	
	static final String DB_URL = "jdbc:mysql://localhost/skolenie";
	
	static final String USER = "root";
	static final String PASS = "";

	public static void main(String[] args) {
		
		Connection con = null;
		Statement stm = null;
		
		try {
			con = DriverManager.getConnection(DB_URL, USER, PASS);
			stm = con.createStatement();
			String sql = "CREATE TABLE studenti"
					+ "(id INTEGER NOT NULL,"
					+ "meno VARCHAR(255),"
					+ "priezvisko VARCHAR(255),"
					+ "vek INTEGER,"
					+ "PRIMARY KEY(id))";
			stm.executeUpdate(sql);
			System.out.println("Tabulka studenti vytvorena ...");
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
