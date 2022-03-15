package org.example.dao;

import org.example.entity.Employee;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao{

    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int InsertEmployee(Employee employee) {
        System.out.println("This is my insert employee method");
        String query = "INSERT INTO employee(name,department,designation,salary) values (?,?,?,?)";
        return this.jdbcTemplate.update(query,employee.getName(),employee.getDepartment(),employee.getDesignation(),employee.getSalary());
    }

    @Override
    public int UpdateEmployee(Employee employee) {
        System.out.println("This is my update employee method");
        String query = "UPDATE employee SET name=?,department=?,designation=?,salary=? WHERE id=?";

        return this.jdbcTemplate.update(query, employee.getName(), employee.getDepartment(), employee.getDesignation(), employee.getSalary(), employee.getId());
    }

    @Override
    public int DeleteEmployee(Employee employee) {
        System.out.println("This is my delete employee method");
        String query = "DELETE FROM employee WHERE id=?";
        return this.jdbcTemplate.update(query, employee.getId());
    }

    @Override
    public List<Employee> getAllEmployees() {
        String query = "SELECT * FROM employee";

        List<Employee> query1 = this.jdbcTemplate.query(query, new RowMapperImpl());
        System.out.println(query1);
        return query1;
    }

}
