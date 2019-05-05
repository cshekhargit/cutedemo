package com.cutehits.cutedemo.bo;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import javax.persistence.Table;



//http://www.springboottutorial.com/spring-boot-crud-rest-service-with-jpa-hibernate
//http://www.springboottutorial.com/hibernate-jpa-tutorial-with-spring-boot-starter-jp
@Entity
@Table(name = "EMPLOYEE")
public class Employee implements Serializable {
	
	 @Id @GeneratedValue
	   @Column(name = "id")
	   private int id;
	 private String name;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="Salary_PK")
	private Salary salary;
	
	 public Salary getSalary() {
		return salary;
	}


	public void setSalary(Salary salary) {
		this.salary = salary;
	}


	public Employee(){
		 
	 }
	 

	public Employee(int id, String name,Salary salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	 
	 

}
