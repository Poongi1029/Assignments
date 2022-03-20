package com.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springboot.entity.Order;
import com.springboot.repository.OrderRepository;

@Component
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;

	public void addOrder(Order order) {
		System.out.println(order);
		orderRepository.save(order);
		System.out.println("Order Added Successfully");
	}

	public List<Order> getAllOrders() {
		return orderRepository.findAll();
	}

	public Order getOrderById(int id) {
		return orderRepository.findById(id);
	}

	public Order getOrderByName(String name) {
		return orderRepository.findByName(name);
	}

	public Order updateOrder(Order order) {
		return orderRepository.save(order);
	}

	public void deleteOrder(int id) {
		orderRepository.deleteById(id);
	}

}
