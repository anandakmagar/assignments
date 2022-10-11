package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBC04 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels?characterEncoding=utf8", "root", "root");
			PreparedStatement psmt = con.prepareStatement("insert into students values(?, ?, ?)");
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Enter the student id");
			psmt.setInt(1, scanner.nextInt());
			scanner.nextLine();
			System.out.println("Enter the student's name");
			psmt.setString(2, scanner.nextLine());
			System.out.println("Enter the stydent's email");
			psmt.setString(3, scanner.nextLine());
			
			int i = psmt.executeUpdate();
			System.out.println(i + " record has been inserted");
			
			psmt.close(); con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
