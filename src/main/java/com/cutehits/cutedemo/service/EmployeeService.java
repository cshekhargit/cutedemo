package com.cutehits.cutedemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cutehits.cutedemo.bo.Employee;
import com.cutehits.cutedemo.bo.EmployeeInt;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeInt emprepository;
	

	public Employee addEmp(Employee emp)
	{
		return emprepository.save(emp);
	}
}
