package com.example.demo.service;

import com.example.demo.dao.RecordDao;
import com.example.demo.pojo.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class RecordService {
    @Autowired
    private RecordDao recordDao;

    public boolean add(Record record) {
        return recordDao.add(record) > 0;
    }

    public List<Record> showAll() {
        return recordDao.showAll();
    }

    public int del(int recordId) {
        return recordDao.del(recordId);
    }

    public int delById(String ids) {
        return recordDao.delById(ids);
    }

    public int edit(Record record) {
        return recordDao.edit(record);
    }
}
