package com.cogent.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.cogent.model.Products;

public class ProductRepoImpl implements ProductRepo {

	@Override
	public void addProduct(Products product) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch63?characterEncoding=utf8", "root", "root");
			PreparedStatement psmt = con.prepareStatement("insert into products values(?, ?, ?, ?, ?, ?)");

			psmt.setInt(1, product.getPid());
			psmt.setString(2, product.getPname());
			psmt.setString(3, product.getPcat());
			psmt.setDate(4, new java.sql.Date(product.getManufacture_date().getTime()));
			psmt.setDouble(5, product.getPrice());
			psmt.setDate(6, new java.sql.Date(product.getExpiry_date().getTime()));
			
			int i = psmt.executeUpdate();
			System.out.println(i + " record has been inserted");
			
			psmt.close(); con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteProductById(int pid) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch63?characterEncoding=utf8", "root", "root");
			PreparedStatement psmt = con.prepareStatement("delete from products where pid = ?");
			
			psmt.setInt(1, pid);
			
			int i = psmt.executeUpdate();
			System.out.println(i + " record has been deleted");
			
			psmt.close(); con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteProductsByCategory(String pcat) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch63?characterEncoding=utf8", "root", "root");
			PreparedStatement psmt = con.prepareStatement("delete from products where pcat = ?");
			
			psmt.setString(1, pcat);
			
			int i = psmt.executeUpdate();
			System.out.println(i + " record has been deleted");
			
			psmt.close(); con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void findCheapestProductInCategory(String pcat) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch63?characterEncoding=utf8", "root", "root");
			PreparedStatement psmt = con.prepareStatement("select pname, min(price) from products where pcat = ?");
			
			psmt.setString(1, pcat);
			
			ResultSet rs = psmt.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getString(1) + " $" + rs.getString(2));
			}
			
			psmt.close(); con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void findProductById(int pid) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch63?characterEncoding=utf8", "root", "root");
			PreparedStatement psmt = con.prepareStatement("select * from products where pid = ?");
			
			ResultSet rs = psmt.executeQuery();
			
			while(rs.next()) {
				System.out.println("Product ID: " + rs.getString(1) + "||  Product: " + rs.getString(2) + "||  Category: " + 
			rs.getString(3) + "||  Manufactured Date: " + 
			rs.getString(4) + "||  Price: " + rs.getString(5) + "||  Expiration: " + rs.getString(6));
			}
			
			psmt.close(); con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		
	}

	@Override
	public ArrayList<String> findProductByCategory(String pcat) {
		ArrayList<String> products = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch63?characterEncoding=utf8", "root", "root");
			PreparedStatement psmt = con.prepareStatement("select * from products where pcat = ?");
//			
//			Scanner scanner = new Scanner(System.in);
//			
//			System.out.println("Enter the category name");
//			psmt.setInt(1, scanner.nextInt());
//			scanner.nextLine();
//			
			
			psmt.setString(1, pcat);
			ResultSet rs = psmt.executeQuery();
			
			//ResultSet results = stmt.executeQuery("..."); 

			//Stores properties of a ResultSet object, including column count
			ResultSetMetaData rsmd = rs.getMetaData(); 
			int columnCount = rsmd.getColumnCount();

			products = new ArrayList<>(columnCount); 
			while (rs.next()) {              
			   int i = 1;
			   while(i < columnCount) {
			        products.add(rs.getString(i));
			   }
			   return products;
			}
			
			
			psmt.close(); con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return products;
		
	}

	@Override
	public void updateProduct(int pid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Products> findExpiredProducts() {
		// TODO Auto-generated method stub
		return null;
	}


}
