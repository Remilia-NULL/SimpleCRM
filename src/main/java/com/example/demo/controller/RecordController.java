package com.example.demo.controller;


import com.example.demo.pojo.Record;
import com.example.demo.service.RecordService;
import com.example.demo.util.ResultPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/record")
public class RecordController {

    @Autowired
    private RecordService recordService;

    @ResponseBody
    @RequestMapping("/add")
    public Record add(Record record) {
        boolean logo = recordService.add(record);
        return logo ? record : null;
    }

    @ResponseBody
    @RequestMapping("/showAll")
    public ResultPage<Record> showAll() {
        List<Record> customers = recordService.showAll();
        ResultPage<Record> data = new ResultPage<>();
        data.setCode(0);
        data.setMsg("");
        data.setCount(customers.size());
        data.setData(customers);
        return data;
    }

    @ResponseBody
    @RequestMapping("/del")
    public int del(Record record) {
        return recordService.del(record.getCustomerId());
    }


    @ResponseBody
    @RequestMapping("/edit")
    public int edit(Record record) {
        return recordService.edit(record);
    }

    @ResponseBody
    @RequestMapping("/delById")
    public int delById(String ids) {
        return recordService.delById(ids);
    }
}
