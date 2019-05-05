package com.cutehits.cutedemo;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cutehits.cutedemo.bo.Employee;
import com.cutehits.cutedemo.bo.Salary;
import com.cutehits.cutedemo.service.EmployeeService;



@RestController

public class HelloWorldController {

	
	
	private EmployeeService empservice; 
	
	
	
	@RequestMapping("/helloworld")
	public String  HelloWorld()
	{
		
		return "Hello World";
	}
	
	
	
	@RequestMapping("/addemp")
	public Employee addEmp()
	{
		Salary sal = new Salary(1,5000);
		Employee myemployee = new Employee(1,"CS",sal);
		try{
			Employee myemployee1 =empservice.addEmp(myemployee);	
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return myemployee;
	}
	

}
