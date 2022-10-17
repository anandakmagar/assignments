/**
 * 
 */
package com.cogent.service;

import java.util.List;

import com.cogent.bean.EmployeeBean;
import com.cogent.repo.EmployeeRepo;
import com.cogent.repo.EmployeeRepoImpl;

/**
 * @author Ananda Magar
 *
 * @date Sep 28, 2022
 */

public class EmployeeServiceImpl implements EmployeeService {
	
	EmployeeRepo employeeRepo = new EmployeeRepoImpl();

	
	@Override
	public void addEmployee(EmployeeBean employeeBean) {
		employeeRepo.addEmployee(employeeBean);
	}

	
	@Override
	public void viewAllEmployees() {
		employeeRepo.viewAllEmployees();
	}

	
	@Override
	public EmployeeBean findEmployeeById(long employeeId) {
		return employeeRepo.findEmployeeById(employeeId);
	}

	
	@Override
	public void deleteEmployeeById(long employeeId) {
		employeeRepo.deleteEmployeeById(employeeId);
	}

	
	@Override
	public EmployeeBean findYoungestEmployee() {
		return employeeRepo.findYoungestEmployee();
	}

	
	@Override
	public List<EmployeeBean> findEmployeesFromIndia() {
		return employeeRepo.findEmployeesFromIndia();
	}

	
	@Override
	public List<EmployeeBean> displayEmployeesFromBangaloreIndia() {
		return employeeRepo.displayEmployeesFromBangaloreIndia();
	}

}
