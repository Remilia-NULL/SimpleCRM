package com.example.demo.dao;


import com.example.demo.pojo.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerDao {
    int add(Customer customer);

    List<Customer> showALl();

    int del(int customerId);

    int edit(Customer customer);

    int delById(String ids);
}
