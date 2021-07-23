package com.liwei;

import com.liwei.entity.Book;
import com.liwei.entity.User;
import com.liwei.mapper.UserMapper;
import com.liwei.service.BookService;
import com.liwei.service.UserService;
import com.liwei.util.MD5;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Date;

@SpringBootTest(classes = LibraryApplication.class)
class LibraryApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
        System.out.println(userMapper.findByUserName("admin"));
        System.out.println(userMapper.queryUserList());
    }

    @Autowired
    private UserService userService;
    @Test
    public void addUser(){
        int number=100;
        User user = new User();
        for (int i = 1; i <= number; i++) {
            user.setUsername("user"+i);
            user.setPassword( MD5.md5("password"+i));
            user.setCardNumber("201803101"+i);
            user.setPhone("1312601"+i);
            userService.add(user);
        }
    }

    @Test
    public void addAdmin(){
        int number=1;
        User user = new User();
        for (int i = 1; i <= number; i++) {
            user.setUsername("test");
            user.setPassword( MD5.md5("test"));
            user.setCardNumber("2018013");
            user.setPhone("131283");
            user.setAdmin(true);
            userService.add(user);
        }
    }

    @Autowired
    private BookService bookService;
    @Test
    public void addBook(){
        int number=100;
        Book book = new Book();
        for (int i = 1; i <= number; i++) {
            book.setBookName("书本"+i);
            book.setAuthor("作者"+i);
            book.setCategory("类别"+i);
            book.setExistNumber(i);
            book.setNumber(i);
            book.setPress("出版社"+i);
            book.setPublishDate(new Date());
            bookService.add(book);
        }
    }
}
