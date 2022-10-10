package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC03 {

	public static void main(String[] args) {
		/*
		 * 1. Register the driver
		 * 2. Establish the connection
		 * 3. Create the Statement and execute the query
		 * 4. Close the connection
		 */
		
		try {
			// Registering the driver
			Class.forName("com.mysql.jdbc.Driver");
			
			// Establishing the connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels?characterEncoding=utf8", "root", "root");
			
			// Creating the Statement and executing the query
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from employees");
			
			while(rs.next()) {
				System.out.println(rs.getString(1) + "  " + rs.getString(2));
			}
			
			// Closing the connection
			st.close(); rs.close(); con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
