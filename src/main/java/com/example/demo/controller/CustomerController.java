package com.example.demo.controller;


import com.example.demo.pojo.Customer;
import com.example.demo.service.CustomerService;
import com.example.demo.util.ResultPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @ResponseBody
    @RequestMapping("/customer/add")
    public Customer add(Customer customer) {
        boolean logo = customerService.add(customer);
        return logo ? customer : null;
    }

    @ResponseBody
    @RequestMapping("/customer/showAll")
    public ResultPage<Customer> showAll() {
        List<Customer> customers = customerService.showAll();
        ResultPage<Customer> data = new ResultPage<>();
        data.setCode(0);
        data.setMsg("");
        data.setCount(customers.size());
        data.setData(customers);
        return data;

    }

    @ResponseBody
    @RequestMapping("/customer/del")
    public int del(Customer customer) {
        return customerService.del(customer.getCustomerId());
    }


    @ResponseBody
    @RequestMapping("/customer/edit")
    public int edit(Customer customer) {
        return customerService.edit(customer);
    }

    @ResponseBody
    @RequestMapping("/customer/delById")
    public int delById(String ids) {
        return customerService.delById(ids);
    }
}
