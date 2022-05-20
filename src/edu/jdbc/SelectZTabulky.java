package edu.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectZTabulky {

	static final String DB_URL = "jdbc:mysql://localhost/skolenie";
	
	static final String USER = "root";
	static final String PASS = "";
	
	public static void main(String[] args) {
		
		Connection con = null;
		Statement stm = null;
		
		try {
			
			con = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("Pripojenie na DB ...");
			
			stm = con.createStatement();
			String sql = "SELECT * FROM studenti";
			ResultSet rs = stm.executeQuery(sql);
			while(rs.next()) {
				int id = rs.getInt("id");
				String meno = rs.getString("meno");
				String priezvisko = rs.getString(3);
				int vek = rs.getInt(4);
				System.out.println(id + ". " + meno + " " + priezvisko + " - " + vek + " rokov.");
			}
			System.out.println("--------------------------------");
			
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
