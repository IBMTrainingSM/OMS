package com.ibm.demo.service;

import com.ibm.demo.entity.Order;
import com.ibm.demo.repo.OrderRepository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {//Spring Beans
@Autowired
OrderRepository orderRepository;
public String createOrder(Order order)
{
	Order savedOrder=orderRepository.save(order);
	return savedOrder.getId();
}

public List<Order> getOrders()
{
  return new ArrayList<Order>();	
 
}
public void updateOrder(int orderId) {

}


public void deleteOrder(int deleteId) {
	System.out.println("Order Deleted");
	
}

public Order getOrder(int orderId) {
 return new Order();
	
}

}
