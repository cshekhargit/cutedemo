package com.cutehits.cutedemo.bo;

import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name = "Emp_Salary")
public class Salary {

	private int emp_id;
	private float salary;
	
	public Salary() {
		
	}

public Salary(int emp_id, float salary) {
	super();
	this.emp_id = emp_id;
	this.salary = salary;
		
	}

}
