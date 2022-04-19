package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController{
	
   @Autowired
   OrderService orderService;
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	Integer createOrder(@RequestBody Order order) {
		System.out.println(order.getName());
		System.out.println(order.getPrice());
		System.out.println(order.getDiscount());
		return orderService.saveOrder(order);
	}
	
	@GetMapping
	List<Order> getOrders(){
		return orderService.getAllOrders();
	}
	
}

