package com.Q7.SpringRest7;

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

import com.Q7.SpringRest7.model.Order;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
class SpringRest7ApplicationTests {

	@Autowired
    private WebApplicationContext wac;

    private MockMvc mockMvc;

    ObjectMapper om =new ObjectMapper();

//    @Before
    public void setup() throws Exception {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }



    @Test
    public void getAllOrder() throws Exception {
        this.mockMvc.perform(get("/orders")).andExpect(status().isOk());
    }


   @Test
   public void addOrder() throws  Exception{
       Order order = new Order();
       order.setItem("coffe");
       order.setId("15");
       order.setAmountPaid(50);

       String jsonRes = om.writeValueAsString(order);
       this.mockMvc.perform(post("/orders").content(jsonRes).contentType(MediaType.APPLICATION_JSON))
               .andExpect(status().isOk());

    }

    @Test
    public void getOrderById() throws Exception {
        this.mockMvc.perform(get("/orders/15")).andExpect(status().isOk());
    }

   @Test
   public void deleteOrder() throws Exception {
        this.mockMvc.perform(delete("/orders/15")).andExpect(status().isOk());
    }

}
