package com.cutehits.cutedemo.bo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "Emp_Salary")
public class Salary {

	 @Id @GeneratedValue
	   @Column(name = "salary_id")
	protected int id;
	@Column(name = "emp_id")
	protected int emp_id;
	protected float salary;
	
	public Salary() {
		
	}

public Salary(int emp_id, float salary) {
	super();
	this.emp_id = emp_id;
	this.salary = salary;
		
	}

}
