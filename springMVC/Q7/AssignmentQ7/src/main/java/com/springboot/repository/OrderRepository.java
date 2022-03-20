package com.springboot.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.springboot.entity.Order;

@Repository
public interface OrderRepository extends MongoRepository<Order, Integer> {

	public Order findById(int id);
	
	public Order findByName(String name);
}
