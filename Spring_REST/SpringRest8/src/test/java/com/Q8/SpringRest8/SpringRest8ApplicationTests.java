package com.Q8.SpringRest8;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import javax.servlet.ServletContext;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.util.Assert;
import org.springframework.web.context.WebApplicationContext;

import com.Q8.SpringRest8.model.Product;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
class SpringRest8ApplicationTests {

	@Autowired
    private WebApplicationContext wac;

    private MockMvc mockMvc;

    ObjectMapper om =new ObjectMapper();

//    @Before
    public void setup() throws Exception {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }

    @Test
    public void givenWac_whenServletContext_thenItProvidesGreetController() {
        ServletContext servletContext = wac.getServletContext();

//        Assert.assertNotNull(servletContext);
//        Assert.assertTrue(servletContext instanceof MockServletContext);
//        Assert.assertNotNull(wac.getBean("productController"));
    }


    @Test
    public void getAllProducts() throws Exception {
        this.mockMvc.perform(get("/products")).andExpect(status().isOk());
    }


    @Test
    public void getProduct() throws Exception {
        this.mockMvc.perform(get("/products/10")).andExpect(status().isOk());
    }

   @Test
   public void addProduct() throws Exception {
       Product product = new Product();
       product.setId("11");
       product.setProductCost(100.0);
       product.setProductName("Anti dandruff shampoo");
       String jsonReq =om.writeValueAsString(product);
        this.mockMvc.perform(post("/products").content(jsonReq).contentType(MediaType.APPLICATION_JSON)
        ).andExpect(status().isOk());
    }

    @Test
    public void deleteProduct() throws Exception {
        this.mockMvc.perform(delete("/products/10")).andExpect(status().isOk());
    }

}
