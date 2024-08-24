package com.Amrutha.emp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Amrutha.emp.entity.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee ,Integer>{
	

}
