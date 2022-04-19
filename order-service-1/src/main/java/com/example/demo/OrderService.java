package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

	@Autowired
	OrderRepository orderRepository;
	
	Integer saveOrder(Order order) {
		orderRepository.save(order);
		System.out.println("Order Saved");
		return order.getId();
	}
	
	public List<Order> getAllOrders() {
		
		return orderRepository.findAll();
	}


}
