package com.example.demo.controller;


import com.example.demo.pojo.Customer;
import com.example.demo.pojo.Order;
import com.example.demo.service.OrderService;
import com.example.demo.util.ResultPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @ResponseBody
    @RequestMapping("/add")
    public int add(Order order) {
        return orderService.add(order);
    }

    @ResponseBody
    @RequestMapping("/showAll")
    public ResultPage<Order> showAll() {
        List<Order> orders = orderService.showAll();
        ResultPage<Order> data = new ResultPage<>();
        data.setCode(0);
        data.setMsg("");
        data.setCount(orders.size());
        data.setData(orders);
        return data;
    }


    @ResponseBody
    @RequestMapping("/del")
    public int del(Order order) {
        return orderService.del(order.getOrdersId());
    }

    @ResponseBody
    @RequestMapping("/edit")
    public int edit(Order order) {
        System.out.println(order);
        return orderService.edit(order);
    }

    @ResponseBody
    @RequestMapping("/delById")
    public int delById(String ids) {
        return orderService.delById(ids);
    }
}
