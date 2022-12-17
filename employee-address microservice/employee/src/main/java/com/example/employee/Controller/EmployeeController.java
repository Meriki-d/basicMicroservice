package com.example.employee.Controller;

import com.example.employee.Services.Impl.EmployeeService;
import com.example.employee.Response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService service;

//    @GetMapping("/employees")
//    public List<Employee1> getemps(){
//        return service.getEmps();
//    }
    @GetMapping("/employees/{id}")
    public ResponseEntity<Response> getemps(@PathVariable int id){
        Response x= service.getEmpById(id);
        return ResponseEntity.status(HttpStatus.OK).body(x);

    }
}
