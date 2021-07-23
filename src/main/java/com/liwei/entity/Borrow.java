package com.liwei.entity;

import java.util.Date;

/**
 * @author Liver
 * @Description 借阅情况实体类
 * @date 2021/6/28 17:25
 */

public class Borrow {
//    借出时间
    private Date borrowDate;
//    归还时间
    private Date returnDate;
//    是否已归还
    private boolean back;
//    借书人id
    private int borrowUserId;
//    书本id
    private int borrowBookId;

    public Borrow() {
    }

    public Borrow(Date borrowDate, Date returnDate, boolean back, int borrowUserId, int borrowBookId) {
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
        this.back = back;
        this.borrowUserId = borrowUserId;
        this.borrowBookId = borrowBookId;
    }

    public Date getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(Date borrowDate) {
        this.borrowDate = borrowDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public boolean isBack() {
        return back;
    }

    public void setBack(boolean back) {
        this.back = back;
    }

    public int getBorrowUserId() {
        return borrowUserId;
    }

    public void setBorrowUserId(int borrowUserId) {
        this.borrowUserId = borrowUserId;
    }

    public int getBorrowBookId() {
        return borrowBookId;
    }

    public void setBorrowBookId(int borrowBookId) {
        this.borrowBookId = borrowBookId;
    }

    @Override
    public String toString() {
        return "Borrow{" +
                "borrowDate=" + borrowDate +
                ", returnDate=" + returnDate +
                ", back=" + back +
                ", borrowUserId=" + borrowUserId +
                ", borrowBookId=" + borrowBookId +
                '}';
    }
}
