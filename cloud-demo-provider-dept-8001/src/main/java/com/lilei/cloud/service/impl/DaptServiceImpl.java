package com.lilei.cloud.service.impl;

import com.lilei.cloud.dao.DeptDao;
import com.lilei.cloud.entity.Dept;
import com.lilei.cloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DaptServiceImpl implements DeptService {
    @Autowired
    DeptDao dao;

    @Override
    public boolean add(Dept dept) {
        return dao.addDept(dept);
    }

    @Override
    public Dept get(Long id) {
        return dao.findById(id);
    }

    @Override
    public List<Dept> list() {
        return dao.findAll();
    }
}
