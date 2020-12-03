package com.example.demo.dao;


import com.example.demo.pojo.Record;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface RecordDao {
    int add(Record record);

    List<Record> showAll();

    int del(int recordId);

    int delById(String ids);

    int edit(Record record);
}
