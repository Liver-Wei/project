package com.liwei.service;

import com.liwei.entity.Borrow;
import com.liwei.mapper.BorrowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Liver
 * @Description
 * @date 2021/6/30 11:44
 */
@Service
public class BorrowService implements BorrowMapper {

    @Autowired
    private BorrowMapper borrowMapper;

    @Override
    public List<Borrow> listAll() {
        return borrowMapper.listAll();
    }

    @Override
    public void add(Borrow borrow) {

    }

    @Override
    public void edit(Borrow borrow) {

    }

    @Override
    public void delete(Borrow borrow) {

    }
}
