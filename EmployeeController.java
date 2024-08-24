package com.Amrutha.emp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.Amrutha.emp.entity.Employee;
import com.Amrutha.emp.service.EmployeeService;

public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	@GetMapping("/")
	public ModelAndView showEmployeeList() {
		List<Employee> employeeList=employeeService.getAllEmployeeList();
		ModelAndView model=new ModelAndView();
		model.addObject("employeeList",employeeList);
		model.setViewName("EmployeeList");
		return model;
		
	}
	@GetMapping("/newEmployee")
	public ModelAndView showEmployeeForm() {
		ModelAndView model=new ModelAndView();
        model.setViewName("EmployeeForm");
		return model;
		
	}
	@PostMapping("/addEmployee")
	public String saveEmployeeRecord(@RequestParam String name, @RequestParam String job, @RequestParam String salary, @RequestParam String dept, @RequestParam String age, @RequestParam String gender )
	{
         Employee employee = new Employee();
		
		employee.setEmpName(name);
		
		employee.setEmpJob(job);
		
		employee.setEmpSalary(Double.parseDouble(salary));
		
		employee.setDeptName(dept);
		
		employee.setEmpAge(Integer.parseInt(age));
		
		employee.setEmpGender(gender);
		
		employeeService.saveEmployee(employee);
		
		
		return "redirect:/";
	}
	@GetMapping("editEmployee")
	public ModelAndView showEmployeeEditForm(@RequestParam String employeeid)
	{
		
		Employee employee = employeeService.getEmployeeById( Integer.parseInt(employeeid));
		
		ModelAndView model = new ModelAndView();
		
		model.addObject("emp", employee);
		
		model.setViewName("EmployeeEditForm");
		
		return model ;
	}
	@PostMapping("/updateEmployee")
	public String updateEmployee(@RequestParam String id, @RequestParam String name, @RequestParam String job, @RequestParam String salary, @RequestParam String dept, @RequestParam String age, @RequestParam String gender )
	{
		Employee employee = new Employee();
		
		employee.setEmpId(Integer.parseInt(id));
		
		employee.setEmpName(name);
		
		employee.setEmpJob(job);
		
		employee.setEmpSalary(Double.parseDouble(salary));
		
		employee.setDeptName(dept);
		
		employee.setEmpAge(Integer.parseInt(age));
		
		employee.setEmpGender(gender);
		
		employeeService.updateEmployee(employee);
		
		return "redirect:/";
	}
	@GetMapping("/deleteEmployee")
	public String deleteEmployee(@RequestParam String employeeid)
	{
		employeeService.deleteEmployeeById( Integer.parseInt(employeeid));
		
		return "redirect:/";
	}
	
	

}
