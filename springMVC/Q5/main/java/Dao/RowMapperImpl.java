package org.example.dao;

import org.example.entity.Employee;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RowMapperImpl implements RowMapper<Employee> {

    @Override
    public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
        Employee employee = new Employee();

        employee.setId(rs.getInt(1));
        employee.setName(rs.getString(2));
        employee.setDepartment(rs.getString(3));
        employee.setDesignation(rs.getString(4));
        employee.setSalary(rs.getString(5));

        return employee;
    }
}
