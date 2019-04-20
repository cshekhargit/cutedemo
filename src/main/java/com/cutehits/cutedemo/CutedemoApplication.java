package com.cutehits.cutedemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cutehits.cutedemo.bo.Employee;
import com.cutehits.cutedemo.bo.EmployeeInt;
import com.cutehits.cutedemo.bo.Salary;
import com.cutehits.cutedemo.bo.SalaryInt;

@SpringBootApplication
public class CutedemoApplication implements CommandLineRunner {

	@Autowired
	private EmployeeInt employeeInt;
	@Autowired
	private SalaryInt salaryint;
	public static void main(String[] args) {
		SpringApplication.run(CutedemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Salary sal = new Salary(1,5000);
		Employee myemployee = new Employee(1,"CS",sal);
		employeeInt.save(myemployee);
		//salaryint.save(new Salary(2,5000) );
		
	}

}
