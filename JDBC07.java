package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBC07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println(" EMPLOYEE CRUD OPERATIONS");
			System.out.println("****************************");
			System.out.println("1. Add Employee");
			System.out.println("2. Update Employee By ID");
			System.out.println("3. Delete Employee By ID");
			System.out.println("4. Find Employee By ID");
			System.out.println("5. Find Employee By Name");
			System.out.println("6. Find Employee By Email");
			System.out.println("7. EXIT!!!!");
				
			System.out.println();
			
			System.out.println("Please select your desired option");
			
			System.out.println();
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels?characterEncoding=utf8", "root", "root");
				
				int option = scanner.nextInt();
				scanner.nextLine();
		
					switch (option) {
						case 1:
							PreparedStatement psmt1 = con.prepareStatement("insert into students values(?, ?, ?)");
							
							System.out.println("Enter the student id");
							psmt1.setInt(1, scanner.nextInt());
							scanner.nextLine();
							
							System.out.println("Enter the student name");
							psmt1.setString(2, scanner.nextLine());
							
							System.out.println("Enter the student email");
							psmt1.setString(3, scanner.nextLine());
							
							int i1 = psmt1.executeUpdate();
							System.out.println(i1 + " record has been inserted");
							
							break;
						case 2:
							PreparedStatement psmt2 = con.prepareStatement("update students set studentname = ?, email = ? where studentid = ?");

							System.out.println("Enter the student's new name");
							psmt2.setString(1, scanner.nextLine());
							
							System.out.println("Enter the student's new email");
							psmt2.setString(2, scanner.nextLine());
							
							System.out.println("Enter the student's id");
							psmt2.setInt(3, scanner.nextInt());
							
							int i2 = psmt2.executeUpdate();
							System.out.println(i2 + " record has been deleted");
							
							break;
					    case 3:
							PreparedStatement psmt3 = con.prepareStatement("delete from students where studentid = ?");
							
							System.out.println("Enter the student's id that is to be deleted");
							psmt3.setInt(1, scanner.nextInt());
							
							int i3 = psmt3.executeUpdate();
							System.out.println(i3 + " record has been deleted");
							
							break;
					    case 4:
							PreparedStatement psmt4 = con.prepareStatement("select * from students where studentid = ?");

							System.out.println("Enter the student's id");
							psmt4.setInt(1, scanner.nextInt());
							
							ResultSet rs1 = psmt4.executeQuery();
							
							while(rs1.next()) {
								System.out.println(rs1.getString(1) + "     " + 
							rs1.getString(2) + "     " + rs1.getString(3));
							}
							
					    	break;
					    case 5: 
							PreparedStatement psmt5 = con.prepareStatement("select * from students where studentname = ?");

							System.out.println("Enter the student's name");
							psmt5.setString(1, scanner.nextLine());
							
							ResultSet rs2 = psmt5.executeQuery();
							
							while(rs2.next()) {
								System.out.println(rs2.getString(1) + "     " + 
							rs2.getString(2) + "     " + rs2.getString(3));
							}
					    	break;
					    case 6: 
							PreparedStatement psmt6 = con.prepareStatement("select * from students where email = ?");

							System.out.println("Enter the student's email");
							psmt6.setString(1, scanner.nextLine());
							
							ResultSet rs3 = psmt6.executeQuery();
							
							while(rs3.next()) {
								System.out.println(rs3.getString(1) + "     " + 
							rs3.getString(2) + "     " + rs3.getString(3));
							}
					    	break;
						case 7: 
							System.out.println("You have successfully EXITED the system");
							System.exit(0);
							break;
					}
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
