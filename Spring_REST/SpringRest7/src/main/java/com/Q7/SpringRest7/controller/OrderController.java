package com.Q7.SpringRest7.controller;


import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Q7.SpringRest7.model.Order;
import com.Q7.SpringRest7.service.OrderService;

@RestController
public class OrderController {
	@Autowired
    private OrderService orderService;


    @RequestMapping(value = "/orders",method = RequestMethod.GET)
    public List<Order> getAllOrder(){
        List<Order> list = new ArrayList<>();
        list = orderService.getAllOrders();
        System.out.println(list);
       return  list;
    }

    @RequestMapping(value = "/orders",method = RequestMethod.POST)
    public Order addOrder(@RequestBody Order order){
        //System.out.println(order.getItem()+" "+order.getAmountPaid());

        return  orderService.AddOrder(order);
    }

    @RequestMapping(value = "/orders/{id}",method = RequestMethod.GET)
    public  Order getOrderById(@PathVariable("id") String id){
        return  orderService.getOrderById(id);
    }

    @RequestMapping(value="/orders/{id}",method = RequestMethod.DELETE)
    public boolean deleteOrder(@PathVariable("id") String id){
        return  orderService.deteleOrder(id);
    }

    @RequestMapping(value="/orders",method = RequestMethod.PUT)
    public Order updateOrder(@RequestBody Order order){
        return  orderService.updateOrder(order);
    }
}
