package com.Q9.SpringRest9;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.Q9.SpringRest9.customer.Customer;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
public class CustomerControllerTest {
	
	@Autowired
    private WebApplicationContext wac;

    private MockMvc mockMvc;

    ObjectMapper om =new ObjectMapper();

    
    public void setup() throws Exception {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }

    @Test
    public void getAllDetails() throws Exception {
        this.mockMvc.perform(get("/customer")).andExpect(status().isOk());
    }

    @Test
    public void getCustomerById() throws Exception {
        this.mockMvc.perform(get("/customer/15")).andExpect(status().isOk());
    }

    @Test
    public void addCustomer() throws  Exception {
        Customer  customer = new Customer();
        customer.setId(69);
        customer.setEmail("test@Gmail.com");
        customer.setAddress("test");
        customer.setName("test");

        String jsonRes = om.writeValueAsString(customer);
        this.mockMvc.perform(post("/customer").content(jsonRes).contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk());
    }

    @Test
    public void deleteCustomer() throws Exception {
        this.mockMvc.perform(delete("/customer/10")).andExpect(status().isOk());
    }
}
