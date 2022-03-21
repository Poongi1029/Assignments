package com.Q5.SpringRest5.employee;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class EmployeeService {
	@Autowired
    EmployeeRepo employeeRepo;

    public List<Employee> getAllemployees(){
        final List<Employee> employeeList = new ArrayList<>();

        employeeRepo.findAll().forEach(employeeList::add);
        return  employeeList;
    }

    public Employee getEmployeeById(int id){
      return  employeeRepo.findById(id).get();
    }

    public Employee addEmployee(Employee employee){
        return employeeRepo.save(employee);
    }

    public boolean deleteEmployee(int id){
    	employeeRepo.deleteById(id);
         return true;
    }
  public Employee updateEmployee(Employee employee){
        return employeeRepo.save(employee);
  }
}
