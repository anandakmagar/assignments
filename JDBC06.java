package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBC06 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels?characterEncoding=utf8", "root", "root");
			PreparedStatement psmt = con.prepareStatement("delete from students where studentid = ?");
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Enter the student id that is to be deleted");
			psmt.setInt(1, scanner.nextInt());
			
			int i = psmt.executeUpdate();
			System.out.println(i + " record has been deleted");
			
			psmt.close(); con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		

	}

}
