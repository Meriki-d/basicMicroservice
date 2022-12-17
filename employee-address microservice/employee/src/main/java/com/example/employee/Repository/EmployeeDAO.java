package com.example.employee.Repository;

import com.example.employee.Entity.Employee1;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeDAO extends CrudRepository<Employee1,Integer> {

}
