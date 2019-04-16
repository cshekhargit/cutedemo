package com.cutehits.cutedemo.bo;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface EmployeeInt extends CrudRepository<Employee, Long>  {

}
