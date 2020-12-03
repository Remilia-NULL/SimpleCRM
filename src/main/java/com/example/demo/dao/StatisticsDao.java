package com.example.demo.dao;

import com.example.demo.pojo.Statistics;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;


@Repository
public interface StatisticsDao {
    List<Statistics> countData();

    List<Statistics> amountData();
}
