package org.example.controller;

import org.example.dao.EmployeeDaoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class javaConfig {

    @Bean("ds")
    public DriverManagerDataSource dataSource(){
        System.out.println("This is my Data Source Bean");
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/springjdbc1");
        dataSource.setUsername("root");
        dataSource.setPassword("poonguzhali1029");

        return dataSource;
    }

    @Bean("jdbcTemplate")
    public JdbcTemplate setjdbcTemplate(){
        System.out.println("This is my Jdbc Template Bean");
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource());
        return jdbcTemplate;
    }

    @Bean("EmployeeDao")
    public EmployeeDaoImpl employeeDao(){
        System.out.println("This is my EmployeeDao Bean");
        EmployeeDaoImpl employeeDao = new EmployeeDaoImpl();
        employeeDao.setJdbcTemplate(setjdbcTemplate());
        return employeeDao;
    }
}
