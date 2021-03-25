package com.ibm.demo.service;

import com.ibm.demo.entity.Order;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class OrderService {//Spring Beans

public String createOrder(Order order)
{
	return "Order Created";
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
