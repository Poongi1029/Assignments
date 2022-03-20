package com.springboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.Order;
import com.springboot.service.OrderService;

@RestController
public class OrderController {

	@Autowired
	private OrderService orderService;

	@PostMapping("/orders")
	public ResponseEntity<Order> addOrder(@RequestBody Order order) {
		try {
			System.out.println(order);
			orderService.addOrder(order);
			return ResponseEntity.ok(order);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	@GetMapping("/orders")
	public ResponseEntity<List<Order>> getAllOrder() {
		List<Order> list = orderService.getAllOrders();

		if (list.size() <= 0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(list));

	}

	 @GetMapping("/orders/{id}")
	    public ResponseEntity<Order> getOrderById(@PathVariable("id") int id) {

	        try {
	            Order order = orderService.getOrderById(id);
	            return ResponseEntity.of(Optional.of(order));
	        } catch (Exception e) {
	            e.printStackTrace();
	            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	        }

	    }

	 @GetMapping("/orders/name")
	    public ResponseEntity<Order> getOrderByName(@RequestParam(value = "name") String name) {
	        try {
	            Order order = orderService.getOrderByName(name);
	            return ResponseEntity.of(Optional.of(order));
	        } catch (Exception e) {
	            e.printStackTrace();
	            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	        }
	    }
	
	 
	 @PutMapping("/orders/{id}")
	    public ResponseEntity<Order> updateOrder(@RequestBody Order order, @PathVariable("id") int id) {
	        Order order1 = null;
	        try {
	            order1 = orderService.updateOrder(order);
	            return ResponseEntity.ok().body(order1);
	        } catch (Exception e) {
	            e.printStackTrace();
	            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	        }
	    }

	 @DeleteMapping("/orders/{id}")
	    public ResponseEntity<Order> deleteOrder(@PathVariable("id") int id) {
	        try {
	            Order order = orderService.getOrderById(id);
	            orderService.deleteOrder(id);
	            return ResponseEntity.ok().body(order);
	        } catch (Exception e) {
	            e.printStackTrace();
	            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	        }
	    }
	 
}

