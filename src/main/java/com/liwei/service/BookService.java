package com.liwei.service;

import com.liwei.entity.Book;
import com.liwei.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Liver
 * @Description
 * @date 2021/6/30 11:43
 */
@Service
public class BookService implements BookMapper {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<Book> listAll() {
        return bookMapper.listAll();
    }

    @Override
    public void add(Book book) {

        bookMapper.add(book);
    }

    @Override
    public void edit(Book book) {

    }

    @Override
    public void delete(Book book) {

    }
}
