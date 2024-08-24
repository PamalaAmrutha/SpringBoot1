package com.Amrutha.emp.service;

import java.util.List;

import com.Amrutha.emp.entity.Employee;


/*
 * Service Layer= It is a seperates presentation layer from the Database Layer
 */
public interface EmployeeService {

	public List<Employee> getAllEmployeeList();
	public Employee getEmployeeById(Integer id);
	public void saveEmployee(Employee employee);
	public void updateEmployee(Employee employee);
	public void deleteEmployeeById(Integer id);

	

}
