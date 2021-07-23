package com.liwei.mapper;

import com.liwei.entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Liver
 * @Description
 * @date 2021/6/29 20:17
 */
@Mapper
@Repository
public interface BookMapper {
    List<Book> listAll();
    void add(Book book);
    void edit(Book book);
    void delete(Book book);
}
