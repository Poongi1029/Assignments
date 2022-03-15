package org.example.dao;

import org.example.entity.Employee;

import java.util.List;

public interface EmployeeDao {
    int InsertEmployee(Employee employee);
    int UpdateEmployee(Employee employee);
    int DeleteEmployee(Employee employee);
    List<Employee> getAllEmployees();
}
