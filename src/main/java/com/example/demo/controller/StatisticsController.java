package com.example.demo.controller;

import com.example.demo.pojo.Statistics;
import com.example.demo.service.StatisticsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/statistics")
public class StatisticsController {

    @Autowired
    private StatisticsServices statisticsServices;

    @ResponseBody
    @RequestMapping("/count")
    public List<Statistics> countData() {
        return statisticsServices.countData();
    }

    @ResponseBody
    @RequestMapping("/amount")
    public List<Statistics> amountData() {
        return statisticsServices.amountData();
    }
}
