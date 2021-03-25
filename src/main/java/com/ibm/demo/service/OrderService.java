package com.ibm.demo.service;

import com.ibm.demo.entity.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {//Spring Beans

public String createOrder(Order order)
{
	return "Order Created";
}
}
