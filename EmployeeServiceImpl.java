package com.Amrutha.emp.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import com.Amrutha.emp.entity.Employee;
import com.Amrutha.emp.service.EmployeeService;
/*
 * JpaRepository= It is a JPA sepcific Extension of Repostitory.It performs CRUD operations
 * @Autowired = It is used for automatic dependency injection
 */
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private JpaRepository<Employee,Integer> jpaRepository;
	@Override
	public List<Employee> getAllEmployeeList(){
		List<Employee> list=jpaRepository.findAll();
		System.out.println("data : "+list);
		return list;
		
	}
	@Override
	public Employee getEmployeeById(Integer id) {
      Employee employee=jpaRepository.getById(id);
		return employee;
	}
	@Override
	public void saveEmployee(Employee employee) {
        jpaRepository.save(employee)	;	
	}
	@Override
	public void updateEmployee(Employee employee) {
		   jpaRepository.save(employee)	;	
		
	}
	
	@Override
	public void deleteEmployeeById(Integer id) {
		   jpaRepository.deleteById(id);	
		
	}
	

}
