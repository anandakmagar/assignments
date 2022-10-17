/**
 * 
 */
package com.cogent.client;

import java.util.List;
import java.util.Scanner;

import com.cogent.bean.EmployeeBean;
import com.cogent.service.EmployeeService;
import com.cogent.service.EmployeeServiceImpl;

/**
 * @author Ananda Magar
 *
 * @date Sep 28, 2022
 */

public class EmployeeClient {

	public static void main(String[] args) {
		EmployeeService employeeService = new EmployeeServiceImpl();
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			
		System.out.println("****************************");
		System.out.println(" EMPLOYEE MANAGEMENT SYSTEM");
		System.out.println("****************************");
		System.out.println("1. Add Employee");
		System.out.println("2. View All Employees");
		System.out.println("3. Find Employee By ID");
		System.out.println("4. Delete Employee By ID");
		System.out.println("5. Find Youngest Employee");
		System.out.println("6. Display Employees From India");
		System.out.println("7. Display Employees From Bangalaore, India");
		System.out.println("8. EXIT!!!!");
		
		System.out.println();
		System.out.println();
		
		System.out.println("Please select your desired option");
		
		System.out.println();
		
		int option = scanner.nextInt();
		scanner.nextLine();

			switch (option) {
				case 1:
					EmployeeBean employeeBean = new EmployeeBean();
					System.out.println("Enter employee ID");
					employeeBean.setEmployeeId(scanner.nextLong());
					scanner.nextLine();
					System.out.println("Enter employee's first name");
					employeeBean.setEmployeeFname(scanner.nextLine());
					System.out.println("Enter employee's last name");
					employeeBean.setEmployeeLname(scanner.nextLine());
					System.out.println("Enter employee's email");
					employeeBean.setEmployeeEmail(scanner.nextLine());
					System.out.println("Enter employee's age");
					employeeBean.setEmployeeAge(scanner.nextInt());
					System.out.println("Enter employee's marital status");
					employeeBean.setEmployeeIsMarried(scanner.nextBoolean());
					scanner.nextLine();
					System.out.println("Enter employee's city");
					employeeBean.setEmployeeCity(scanner.nextLine());
					System.out.println("Enter employee's country");
					employeeBean.setEmployeeCountry(scanner.nextLine());
					
					employeeService.addEmployee(employeeBean);
					break;
				case 2:
					employeeService.viewAllEmployees();
					break;
			    case 3:
					System.out.println("Please enter the employee id to be searched");
					EmployeeBean employeeBean1 = employeeService.findEmployeeById(scanner.nextInt());
					if (employeeBean1 != null) {
						System.out.println(employeeBean1.getEmployeeId() + " " + employeeBean1.getEmployeeFname() + " " + employeeBean1.getEmployeeEmail() + " " + employeeBean1.getEmployeeAge() + " " + employeeBean1.isEmployeeIsMarried() + " " + employeeBean1.getEmployeeCity() + " " + employeeBean1.getEmployeeCountry());
						break;
					}
					else {
						System.out.println("Employee not found");
					}
					break;
			    case 4:
			    	System.out.println("Please enter the employee id that you want to delete");
			    	employeeService.deleteEmployeeById(scanner.nextLong());
			    	scanner.nextLine();
			    	break;
			    case 5: 
			    	EmployeeBean youngestEmployee = employeeService.findYoungestEmployee();
			    	System.out.println(youngestEmployee.getEmployeeFname() + " " + youngestEmployee.getEmployeeLname() + " || " + youngestEmployee.getEmployeeAge());
			    	break;
			    case 6: 
			    	List<EmployeeBean> employeesFromIndia = employeeService.findEmployeesFromIndia();
			    	for(EmployeeBean employee: employeesFromIndia) {
			    		System.out.println("Name: " + employee.getEmployeeFname() + " " + employee.getEmployeeLname() + " || Address: " + employee.getEmployeeCity() + ", " + employee.getEmployeeCountry());
			    	}
			    	break;
			    case 7:
			    	List<EmployeeBean> employeesFromBangaloreIndia = employeeService.displayEmployeesFromBangaloreIndia();
			    	for(EmployeeBean employee: employeesFromBangaloreIndia) {
			    		System.out.println("Name: " + employee.getEmployeeFname() + " " + employee.getEmployeeLname() + " || Address: " + employee.getEmployeeCity() + ", " + employee.getEmployeeCountry());
			    	}
			    	break;
				case 8: 
					System.out.println("You have successfully EXITED the system");
					System.exit(0);
					break;
			}
		}
	}
}
