package com.cutehits.employee;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

//http://www.springboottutorial.com/spring-boot-crud-rest-service-with-jpa-hibernate
//http://www.springboottutorial.com/hibernate-jpa-tutorial-with-spring-boot-starter-jp
@Entity
@Table(name = "EMPLOYEE")
public class Employee {
	
	 @Id @GeneratedValue
	   @Column(name = "id")
	   private int id;
	 private String name;
	 
	 public Employee(){
		 
	 }
	 

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
