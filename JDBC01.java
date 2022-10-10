package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC01 {
	public static void main(String[] args) {
		try {
			// Registering driver class by passing its name in Class.forName() method
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("MySQL Driver is available");
			
			String url = "jdbc:mysql://localhost:3306/classicmodels?characterEncoding=utf8";
			
			// Establishing connection with database using getConnection() method of DriverManager class
			// After establishing the connection, it is stored in reference variable of Connection class
			Connection con = DriverManager.getConnection(url, "root", "root");
			System.out.println("Connected");
			
			// Creating the Statement and 
			// Executing the sql query that will be returning the rows into the ResultSet
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from employees");
			
			// Going through each rows of the table
			while(rs.next()) {
				System.out.println(rs.getString(1) + "     " + 
			rs.getString(2) + "     " + rs.getString(3) + "     " + 
						rs.getString(4) + "     " + 
			rs.getString(5));
			}
			
			// Closing the ResultSet, Statement, and Connection
			rs.close(); st.close(); con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
