/**
 * 
 */
package com.cogent.repo;

import java.util.List;

import com.cogent.bean.EmployeeBean;

/**
 * @author Ananda Magar
 *
 * @date Sep 28, 2022
 */
public interface EmployeeRepo {
	
	public void addEmployee(EmployeeBean employeeBean);
	public void viewAllEmployees();
	public EmployeeBean findEmployeeById(long employeeId);
	public void deleteEmployeeById(long employeeId);
	public EmployeeBean findYoungestEmployee();
	public List<EmployeeBean> findEmployeesFromIndia();
	public List<EmployeeBean> displayEmployeesFromBangaloreIndia();
	
}

