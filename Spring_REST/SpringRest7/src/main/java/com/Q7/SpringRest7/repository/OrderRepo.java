package com.Q7.SpringRest7.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.Q7.SpringRest7.model.Order;


@Repository
public interface OrderRepo extends MongoRepository<Order,String> {
	
}
