package com.liwei.service;

import com.liwei.entity.Fine;
import com.liwei.mapper.FineMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Liver
 * @Description
 * @date 2021/6/30 11:45
 */
@Service
public class FineService implements FineMapper {

    @Autowired
    private FineMapper fineMapper;

    @Override
    public List<Fine> listAll() {
        return fineMapper.listAll();
    }

    @Override
    public void add(Fine fine) {

    }

    @Override
    public void edit(Fine fine) {

    }

    @Override
    public void delete(Fine fine) {

    }
}
