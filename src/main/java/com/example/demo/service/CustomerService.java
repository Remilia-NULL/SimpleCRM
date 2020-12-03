package com.example.demo.service;

import com.example.demo.dao.CustomerDao;
import com.example.demo.pojo.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerDao customerDao;

    public boolean add(Customer customer) {
        return customerDao.add(customer) > 0;
    }

    public List<Customer> showAll() {
        return customerDao.showALl();
    }

    public int del(int customerId) {
        return customerDao.del(customerId);
    }

    public int edit(Customer customer) {
        return customerDao.edit(customer);
    }

    public int delById(String ids) {
        return customerDao.delById(ids);
    }
}
