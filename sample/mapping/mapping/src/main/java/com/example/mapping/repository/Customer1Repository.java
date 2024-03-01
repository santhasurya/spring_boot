package com.example.mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.mapping.dto.OrderResponse2;
import com.example.mapping.model.Customer1;

import java.util.List;

public interface Customer1Repository extends JpaRepository<Customer1, Integer> {

    @Query("SELECT new com.example.mapping.dto.OrderResponse2(c.name , p.productName) FROM Customer c JOIN c.products p")
    public List<OrderResponse2> getJoinInformation();
}