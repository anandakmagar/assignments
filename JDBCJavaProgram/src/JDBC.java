import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Properties;
import java.util.Scanner;

public class JDBC {
	public static void main(String[] args) {
		
        FileInputStream fis = null;
		try {
			fis = new FileInputStream("C:/EclipseWorkspace/JDBCJavaProgram/jdbc.properties");
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
				PreparedStatement psmt = con.prepareStatement("select * from students");
				ResultSet rs = psmt.executeQuery()) {
			Students s = null;
			ArrayList<Students> students = new ArrayList<>();
			while(rs.next()) {
				s = new Students(rs.getInt(1), rs.getString(2), rs.getString(3));
				students.add(s);
			}
			
//			System.out.println("Number of students: " + students.size());
//			for(Students std: students) {
//				System.out.println(std.toString());
//			}
			
			try {
				FileOutputStream fos = new FileOutputStream("students.txt");
				ObjectOutputStream ous = new ObjectOutputStream(fos);
				ous.writeObject(s);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	        try {
	            FileInputStream fis2 = new FileInputStream("students.txt");
	            ObjectInputStream ois = new ObjectInputStream(fis2);
	 
	            Object obj = ois.readObject();
	            
	            ArrayList<Students> student = (ArrayList)obj;
	            for(Students s2: student) {
	            	System.out.println(s2);
	            }
	            
	        
			} catch (IOException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
