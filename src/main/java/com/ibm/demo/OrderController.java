package com.ibm.demo;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.demo.entity.Order;
import com.ibm.demo.service.OrderService;

@RestController
public class OrderController {//frotend
	@Autowired
	OrderService orderservice;//DI
	@PostMapping("/order")
	String createOrder(@RequestBody @Valid Order order,BindingResult bindingResult) {
		if(bindingResult.hasErrors())
		{
			throw new IllegalArgumentException("Something went wrong");
			
		}
		System.out.println(order);
		return orderservice.createOrder(order);
	}

	@GetMapping("/order")
	String getOrder(@RequestBody Order order) {
		System.out.println(order);
		return "Order Created";
	}

	@PutMapping("/order/{id}")
	String Updateorder(@PathVariable("id") int orderId) {
		System.out.println(orderId);
		return "Order Updated";
	}

	@DeleteMapping("/order/{id}")
	String DeleteOrder(@PathVariable("id") int deleteId) {
		System.out.println(deleteId);
		return "Order Deleted";

	}

}
