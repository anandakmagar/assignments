package jdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

public class JDBC09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
        FileInputStream fis = null;
		try {
			fis = new FileInputStream("C:/EclipseWorkspace/Cogent/src/jdbc.properties");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
        Properties p = new Properties(); 
        try {
			p.load (fis);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
        
        String driver = p.getProperty("driver");
        String url = p.getProperty("url");
        String uname = p.getProperty("uname");
        String pswd = p.getProperty("pswd");

		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try(Connection con = DriverManager.getConnection(url, uname, pswd);
				PreparedStatement psmt = con.prepareStatement("delete from students where studentid = ?");
				) {
			System.out.println("Enter the id to be deleted");
			psmt.setInt(1, scanner.nextInt());
			int i = psmt.executeUpdate();
			System.out.println(i + " has been deleted");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
