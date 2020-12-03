package com.example.demo.service;

import com.example.demo.dao.OrderDao;
import com.example.demo.pojo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderDao orderDao;

    public int add(Order order) {
        return orderDao.add(order);
    }

    public List<Order> showAll() {
        return orderDao.showAll();
    }

    public int del(int ordersId) {
        return orderDao.del(ordersId);
    }

    public int edit(Order order) {
        return orderDao.edit(order);
    }

    public int delById(String ids) {
        return orderDao.delById(ids);
    }
}
