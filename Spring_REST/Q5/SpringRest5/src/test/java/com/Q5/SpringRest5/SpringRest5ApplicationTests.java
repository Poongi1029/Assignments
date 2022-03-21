package com.Q5.SpringRest5;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.Q5.SpringRest5.employee.Employee;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
class SpringRest5ApplicationTests {

	@Autowired
    private WebApplicationContext wac;

    private MockMvc mockMvc;

    ObjectMapper om =new ObjectMapper();

//    @Before
    public void setup() throws Exception {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }

    @Test
    public void getAllDetails() throws Exception{
        this.mockMvc.perform(get("/employee")).andExpect(status().isOk());
    }

    @Test
    public void getEmployeeById() throws  Exception {
        this.mockMvc.perform(get("/employee/31")).andExpect(status().isOk());
    }

    @Test
    public void addEmployee() throws Exception {
        Employee e = new Employee();
        e.setEmployeeId(89);
        e.setEmployeeName("testJunit");
        e.setEmployeeSalary("50000");
        e.setEmployeeDepartment("It");
        e.setEmployeeDesignation("tester");

        String jsonRes = om.writeValueAsString(e);
        this.mockMvc.perform(post("/employee").content(jsonRes).contentType(MediaType.APPLICATION_JSON));
    }
    @Test
    public void deleteEmplolyee() throws  Exception{
        this.mockMvc.perform(delete("/employee/20")).andExpect(status().isOk());
        }

}
