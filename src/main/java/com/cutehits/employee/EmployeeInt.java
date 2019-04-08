package com.cutehits.employee;

import org.springframework.stereotype.Repository;
@Repository
import org.springframework.data.repository.CrudRepository;

public interface EmployeeInt extends CrudRepository<Employee, Long>  {

}
