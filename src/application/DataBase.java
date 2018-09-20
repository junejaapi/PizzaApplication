package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataBase {
	
	private Connection connect() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:sqlite:C://Project_AshishJuneja_Eclipse/db/profile.db");
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return conn;
	}
	
	public void profile(String email, String code, String imagepath) {
		String sql = "INSERT INTO PROFILE(user, code, imagepath) VALUES(?, ?, ?)";
		
		try {
			Connection conn= this.connect();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, email);
			pstmt.setString(2, code);
			pstmt.setString(3, imagepath);
			pstmt.executeUpdate();
			
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public void updateProfile(String email, String imagepath) {
		String sql = "UPDATE PROFILE SET imagepath = ? WHERE user = ?";
		
		try {
			Connection conn= this.connect();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, imagepath);
			pstmt.setString(2, email);
			pstmt.executeUpdate();
			
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	
	public void customerOrder(String email, String crust, String toppings, String size, String instructions, Double price, Double discount, Double tax) {
	String sql = "UPDATE PROFILE SET crust = ?, SET toppings = ?, SET size = ?, SET instructions = ?, SET price = ?, SET discount = ?, SET tax = ? WHERE user = ?";
		
		try {
			Connection conn= this.connect();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, crust);
			pstmt.setString(2, toppings);
			pstmt.setString(3, size);
			pstmt.setString(4, instructions);
			pstmt.setDouble(5, price);
			pstmt.setDouble(6, discount);
			pstmt.setDouble(7, tax);
			pstmt.setString(8, email);
			pstmt.executeUpdate();
			
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
}
