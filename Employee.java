package com.Amrutha.emp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="emp_id")
    private Integer EmpId;
	
	@Column(name="emp_Name")
    private String empName;
	
	@Column(name="emp_Job")
	private String empJob;
	
	@Column(name="emp_Salary")
    private Double empSalary;
	
	@Column(name="dept_Name")
    private String deptName;
	
	@Column(name="emp_Age")
	private Integer empAge;
    
	@Column(name="emp_Gender")
    private String empGender;
	
    
	public String getEmpGender() {
		return empGender;
	}
	public void setEmpGender(String empGender) {
		this.empGender = empGender;
	}
	public Integer getEmpId() {
		return EmpId;
	}
	public void setEmpId(Integer empId) {
		EmpId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpJob() {
		return empJob;
	}
	public void setEmpJob(String empJob) {
		this.empJob = empJob;
	}
	public Double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(Double empSalary) {
		this.empSalary = empSalary;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public Integer getEmpAge() {
		return empAge;
	}
	public void setEmpAge(Integer empAge) {
		this.empAge = empAge;
	}
	@Override
	public String toString() {
		return "Employee [EmpId=" + EmpId + ", empName=" + empName + ", empJob=" + empJob + ", empSalary=" + empSalary
				+ ", deptName=" + deptName + ", empAge=" + empAge + ", empGender=" + empGender + "]";
	}
	
	
    

}
