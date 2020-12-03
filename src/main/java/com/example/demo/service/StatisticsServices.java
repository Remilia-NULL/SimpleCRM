package com.example.demo.service;

import com.example.demo.dao.StatisticsDao;
import com.example.demo.pojo.Statistics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StatisticsServices {
    @Autowired
    private StatisticsDao statisticsDao;


    public List<Statistics> countData() {
        return statisticsDao.countData();
    }

    public List<Statistics> amountData() {
        return statisticsDao.amountData();
    }
}
