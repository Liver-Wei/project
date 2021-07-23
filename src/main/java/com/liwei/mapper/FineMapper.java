package com.liwei.mapper;

import com.liwei.entity.Borrow;
import com.liwei.entity.Fine;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Liver
 * @Description
 * @date 2021/6/29 21:33
 */

@Repository
@Mapper
public interface FineMapper {
    List<Fine> listAll();
    void add(Fine fine);
    void edit(Fine fine);
    void delete(Fine fine);
}
