package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBC05 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels?characterEncoding=utf8", "root", "root");
			PreparedStatement psmt = con.prepareStatement("update students set studentname = ? where studentid = ?");
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Enter the new student's name");
			psmt.setString(1, scanner.nextLine());
			System.out.println("Enter the student's id");
			psmt.setInt(2, scanner.nextInt());
			
			int i = psmt.executeUpdate();
			System.out.println(i + " record has been updated");
			
			psmt.close(); con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
