package com.liwei.mapper;

import com.liwei.entity.Borrow;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Liver
 * @Description
 * @date 2021/6/29 21:20
 */
@Repository
@Mapper
public interface BorrowMapper {
    List<Borrow> listAll();
    void add(Borrow borrow);
    void edit(Borrow borrow);
    void delete(Borrow borrow);
}
