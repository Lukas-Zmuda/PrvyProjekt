package edu.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class VlozenieDoTabulky {

	static final String DB_URL = "jdbc:mysql://localhost/skolenie";
	
	static final String USER = "root";
	static final String PASS = "";
	
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pst = null;
		
		try {
			con = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("Pripojenie na DB ...");
			
			pst = con.prepareStatement("INSERT INTO studenti VALUES (?, ?, ?, ?)");
			
			pst.setInt(1, 4);
			pst.setString(2, "Jozef");
			pst.setString(3, "Mrkva");
			pst.setInt(4, 42);
			pst.executeUpdate();
			System.out.println("Pridany riadok");
			
		}catch(SQLException se) {
			se.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pst != null) {
					pst.close();
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
