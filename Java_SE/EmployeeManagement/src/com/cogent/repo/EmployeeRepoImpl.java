/**
 * 
 */
package com.cogent.repo;

import java.util.ArrayList;
import java.util.List;

import com.cogent.bean.EmployeeBean;

/**
 * @author Ananda Magar
 *
 * @date Sep 28, 2022
 */

public class EmployeeRepoImpl implements EmployeeRepo {
	
	List<EmployeeBean> employees = new ArrayList<>();
	
	
	{
		employees.add(new EmployeeBean(1, "Jayant", "Surya", "d@smith.com", 40, false, "Mumbai", "India"));
		employees.add(new EmployeeBean(2, "Ananda", "Magar", "a@magar.com", 30, true, "Bangalore", "India"));
	}

	
	@Override
	public void addEmployee(EmployeeBean employeeBean) {
		employees.add(employeeBean);	
	}

	
	@Override
	public void viewAllEmployees() {
		for(EmployeeBean employee: employees) {
			System.out.println("ID: " + employee.getEmployeeId() + " || " + "First Name: " + employee.getEmployeeFname() + " || " + "Last Name: " + employee.getEmployeeLname() + " || " +  "Email: " + employee.getEmployeeEmail() + " || " + "Age: " + employee.getEmployeeAge() + " || " + "City: " + employee.getEmployeeCity() + " || " + "Country: " + employee.getEmployeeCountry());
		}
	}

	
	@Override
	public EmployeeBean findEmployeeById(long employeeId) {
		EmployeeBean employeeBean = null;
		for(int i = 0; i < employees.size(); i++) {
			if(employeeId == employees.get(i).getEmployeeId()) {
				employeeBean = employees.get(i);
				break;
			}
			return null;
		}
		return employeeBean;
	}

	
	@Override
	public void deleteEmployeeById(long employeeId) {
		for(int i = 0; i < employees.size(); i++) {
			if(employeeId == employees.get(i).getEmployeeId()) {
				employees.remove(i);
				break;
			}
		}
	}

	
	@Override
	public EmployeeBean findYoungestEmployee() {
		//EmployeeBean employeeBean = null;
		EmployeeBean youngestEmployee = employees.get(0);
		for(int i = 0; i < employees.size(); i++) {
			if(employees.get(i).getEmployeeAge() < youngestEmployee.getEmployeeAge()) {
				youngestEmployee = employees.get(i);
			}
		}
		return youngestEmployee;
	}

	
	List<EmployeeBean> employeesFromIndia = new ArrayList<>();
	@Override
	public List<EmployeeBean> findEmployeesFromIndia() {
		for(int i = 0; i < employees.size(); i++) {
			if(employees.get(i).getEmployeeCountry().equals("India")) {
				employeesFromIndia.add(employees.get(i));
			}
		}
		return employeesFromIndia;
	}

	
	List<EmployeeBean> employeesFromBangaloreIndia = new ArrayList<>();
	@Override
	public List<EmployeeBean> displayEmployeesFromBangaloreIndia() {
		for(int i = 0; i < employees.size(); i++) {
			if(employees.get(i).getEmployeeCity().equals("Bangalore") && employees.get(i).getEmployeeCountry().equals("India")) {
				employeesFromBangaloreIndia.add(employees.get(i));
			}
		}
		return employeesFromBangaloreIndia;
	}
}
