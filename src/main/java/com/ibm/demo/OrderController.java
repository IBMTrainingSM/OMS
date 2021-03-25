package com.ibm.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.ibm.demo.entity.Order;
@RestController
public class OrderController {
   @PostMapping("/order")
           String createOrder(Order order)
                  {
	   System.out.println(order);
	   return "success";
	   }
   @GetMapping("/order")
        String getOrder()
        {return "Order Created";}
   @PutMapping("/order/{id}")
   String Updateorder(@PathVariable("id")int orderId)
   {System.out.println(orderId);
	   return "Order Updated";
	   }
   @DeleteMapping("/order/{id}")
   String DeleteOrder(@PathVariable("id")int deleteId,HttpRequest httpRequest)
   {
	   System.out.println(httpRequest.getHeaders());
	   System.out.println(deleteId);
	   return "Order Deleted";
	   
   }

}
