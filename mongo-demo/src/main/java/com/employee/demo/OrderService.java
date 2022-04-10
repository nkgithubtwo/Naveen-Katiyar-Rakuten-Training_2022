package com.employee.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

	@Autowired
	OrderRepository orderRepository;

	public void save(Order order) {
//		orders.add(order);
		orderRepository.save(order);
		System.out.println("Data Saved Successfully!");

	}

	public List<Order> getAllOrders() {
//		return orders;
		return orderRepository.findAll();

	}

}
