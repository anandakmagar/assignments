package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC02 {
	public static void main(String[] args) {
		/*
		 * 1. Register the driver
		 * 2. Create the connection
		 * 3. Create the Statement and execute the query
		 * 4. Close the connection
		 */
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("MySQL driver has been registered");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels?characterEncoding=utf8", "root", "root");
			
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from employees where firstName like 'A%'");
			System.out.println("Statement created and Query executed");
			
			while(rs.next()) {
				System.out.println("Employee ID: " + rs.getString(1) + "    " + "First Name: " + rs.getString(2));
			}
			
			rs.close(); con.close(); st.close();
			System.out.println("ResultSet, Connection, and Statement closed");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
