package com.cutehits.cutedemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cutehits.employee.Employee;
import com.cutehits.employee.EmployeeInt;

@SpringBootApplication
public class CutedemoApplication implements CommandLineRunner {

	@Autowired
	private EmployeeInt employeeInt;
	public static void main(String[] args) {
		SpringApplication.run(CutedemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		employeeInt.save(new Employee(1,"abc"));
		
	}

}
