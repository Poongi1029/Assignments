package com.Q9.SpringRest9.customer;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("/customers")
	public List<Customer> getAllCustomers() {
		return customerService.getAllCustomers();
	}
	@RequestMapping("/customers/{id}")
	public Optional<Customer> getCustomer(@PathVariable int id) {
		return customerService.getCustomer(id);
	}
	@RequestMapping(value = "/customers" , method = RequestMethod.POST )
	public void addCustomer(@RequestBody Customer customer) {
		customerService.addCustomer(customer);
	}
	@RequestMapping(value = "/customers/{id}" , method = RequestMethod.PUT )
	public void updateCustomer(@RequestBody Customer customer, @PathVariable int id) {
		customerService.updateCustomer(id, customer);
	}
	@RequestMapping(value = "/customers/{id}" , method = RequestMethod.DELETE)
	public void deleteCustomer(@PathVariable int id) {
		customerService.deleteCustomer(id);
	}
}
