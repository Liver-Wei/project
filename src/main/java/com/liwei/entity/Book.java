package com.liwei.entity;

import java.util.Date;
/**
 * @author Liver
 * @Description 书本实体类
 * @date 2021/6/28 17:14
 */

public class Book {
    //书本id
    private int bookId;
//    书本名称
    private String bookName;
//    出版社
    private String press;
//    书本总数量
    private int number;
//    现存书本数量
    private int existNumber;
//    书本种类
    private String category;
//    出版时间
    private Date publishDate;
//    作者
    private String author;

    public Book() {
    }

    public Book(int bookId, String bookName, String press, int number, int existNumber, String category, Date publishDate, String author) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.press = press;
        this.number = number;
        this.existNumber = existNumber;
        this.category = category;
        this.publishDate = publishDate;
        this.author = author;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getExistNumber() {
        return existNumber;
    }

    public void setExistNumber(int existNumber) {
        this.existNumber = existNumber;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", press='" + press + '\'' +
                ", number=" + number +
                ", existNumber=" + existNumber +
                ", category='" + category + '\'' +
                ", publishDate=" + publishDate +
                ", author='" + author + '\'' +
                '}';
    }
}
