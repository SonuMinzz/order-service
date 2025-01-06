package com.example.aws.cicd.practical;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Repository
public class OrderDao {


    public List<Order> getOrders()
    {
         return Stream.of(
                 new Order(100,"mobile",1,10000.25),
                 new Order(101,"tv",1,12000.25),
                 new Order(102,"fridge",1,15000.25),
                 new Order(103,"calculator",1,5000.25),
                 new Order(104,"blower",1,3000.25)
         ).collect(Collectors.toList());

    }


}
