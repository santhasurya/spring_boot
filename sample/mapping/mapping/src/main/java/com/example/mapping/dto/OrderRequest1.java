package com.example.mapping.dto;

import com.example.mapping.model.Customer1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderRequest1 {

    private Customer1 customer;
}