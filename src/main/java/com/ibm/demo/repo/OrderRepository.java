package com.ibm.demo.repo;

import com.ibm.demo.entity.Order;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<Order ,String> {

}
