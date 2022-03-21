package com.Q5.SpringRest5.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Autowired
    EmployeeService employeeService;

    @RequestMapping(value = "/employee",method = RequestMethod.GET)
    public List<Employee> getAllDetails(){
       List<Employee> employeeList= employeeService.getAllemployees();
       return employeeList;
    }

    @RequestMapping(value="/employee/{id}",method=RequestMethod.GET)
    public Employee getEmployeeById(@PathVariable("id") int id){
        return employeeService.getEmployeeById(id);
    }

    @RequestMapping(value="/employee",method =RequestMethod.POST)
    public Employee addEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);

    }

    @RequestMapping(value="/employee/{id}",method = RequestMethod.DELETE)
    public boolean deleteEmplolyee(@PathVariable("id") int id){
        return employeeService.deleteEmployee(id);

    }

    @RequestMapping(value = "/employee",method = RequestMethod.PUT)
    public  Employee updateEmployee(@RequestBody Employee employee){
        return employeeService.updateEmployee(employee);
    }
}
