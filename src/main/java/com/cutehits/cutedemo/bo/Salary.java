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
		@Column(name = "emp_id_FK")	
	protected int id;
	
	//protected int emp_id;
	protected float salary;
	
	public Salary() {
		
	}

public Salary(int id, float salary) {
	super();
	this.id = id;
	this.salary = salary;
		
	}

}
