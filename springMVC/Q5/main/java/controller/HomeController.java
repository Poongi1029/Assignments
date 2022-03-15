package org.example.controller;


import org.example.dao.EmployeeDaoImpl;
import org.example.entity.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class HomeController {
    ApplicationContext context = new AnnotationConfigApplicationContext(javaConfig.class);
    List<Employee> employeeList;
    EmployeeDaoImpl employeeDao;
    ModelAndView modelAndView;

    @RequestMapping(path = "/login",method = RequestMethod.POST)
    public ModelAndView register(@RequestParam("name")String name,@RequestParam("dept")String dept,
                                 @RequestParam("designation")String designation,@RequestParam("salary") String salary) {


        employeeDao = context.getBean("EmployeeDao", EmployeeDaoImpl.class);
        ModelAndView model = new ModelAndView();

        Employee employee = new Employee();
        employee.setName(name);
        employee.setDepartment(dept);
        employee.setDesignation(designation);
        employee.setSalary(salary);

        System.out.println(employee);

        System.out.println("Employees inserted: "+employeeDao.InsertEmployee(employee));
        model.addObject("Employee",employee);
        model.setViewName("login");
        return model;
   }

   @RequestMapping("/login")
    public ModelAndView getAllEmployees(){
       employeeDao = context.getBean("EmployeeDao", EmployeeDaoImpl.class);

       modelAndView = new ModelAndView();

       employeeList = employeeDao.getAllEmployees();
       modelAndView.addObject("Employeelist",employeeList);
       modelAndView.setViewName("login");
       return modelAndView;
   }

   @RequestMapping("/update/{id}")
   public ModelAndView update(@PathVariable(value = "id")int id){
       System.out.println("This is my update controller");
        Employee employee = new Employee();

        for(Employee e: employeeList){
            if(e.getId() == id){
                employee = e;
            }
        }
        System.out.println(employee);

        modelAndView = new ModelAndView("update");
        modelAndView.addObject("id",employee.getId());
        modelAndView.addObject("name",employee.getName());
        modelAndView.addObject("department",employee.getDepartment());
        modelAndView.addObject("designation",employee.getDesignation());
        modelAndView.addObject("salary",employee.getSalary());
        return modelAndView;
   }

    @RequestMapping("/{id}")
    public ModelAndView delete(@PathVariable(value="id") int id){
        System.out.println("This is my delete controller");
        Employee employee = new Employee();
        for(Employee e: employeeList){
            if(e.getId() == id){
                employee = e;
            }
        }
        System.out.println(employee);

        employeeDao.DeleteEmployee(employee);
        System.out.println("Employee Deleted Successfully");
        modelAndView = new ModelAndView("delete");
        return modelAndView;

    }
   @RequestMapping(path="/update/updateform",method = RequestMethod.POST)
    public ModelAndView updateEmployee(@ModelAttribute("employee")Employee employee){
       System.out.println(employee);
       System.out.println("Updated Rows : "+employeeDao.UpdateEmployee(employee));
       System.out.println("Updated Successfully!!");
       modelAndView = new ModelAndView("updateform");

       modelAndView.addObject("Employee",employee);
       return modelAndView;
   }
}
