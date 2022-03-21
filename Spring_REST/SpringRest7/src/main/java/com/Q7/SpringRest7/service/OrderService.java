package com.Q7.SpringRest7.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Q7.SpringRest7.model.Order;
import com.Q7.SpringRest7.repository.OrderRepo;


@Service
public class OrderService {
	@Autowired
    OrderRepo orderRepo;

    public List<Order> getAllOrders(){
        //System.out.println(orderRepo.findAll());
        return  orderRepo.findAll();
    }

    public Order AddOrder(Order order){


        return orderRepo.insert(order);
    }
    public  Order getOrderById(String id){
        return  orderRepo.findById(id).get();
    }
    public  boolean deteleOrder(String id){
        orderRepo.deleteById(id);
        return true;
    }
    public  Order updateOrder(Order order){
        return  orderRepo.save(order);
    }
}
