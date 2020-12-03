package com.example.demo.dao;

import com.example.demo.pojo.Order;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderDao {
    int add(Order order);

    List<Order> showAll();

    int del(int ordersId);

    int edit(Order order);

    int delById(String ids);
}
