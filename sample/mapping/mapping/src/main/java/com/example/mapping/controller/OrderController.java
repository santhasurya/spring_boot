package com.example.mapping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.mapping.dto.OrderRequest1;
import com.example.mapping.dto.OrderResponse2;
import com.example.mapping.model.Customer1;
import com.example.mapping.repository.Customer1Repository;
//import com.example.mapping.repository.ProductRepository;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private Customer1Repository customerRepository;
    // @Autowired
    // private ProductRepository productRepository;

    @PostMapping("/placeOrder")
    public Customer1 placeOrder(@RequestBody OrderRequest1 request) {
        return customerRepository.save(request.getCustomer());
    }

    @GetMapping("/findAllOrders")
    public List<Customer1> findAllOrders() {
        return customerRepository.findAll();
    }

    @GetMapping("/getInfo")
    public List<OrderResponse2> getJoinInformation() {
        return customerRepository.getJoinInformation();
    }
}