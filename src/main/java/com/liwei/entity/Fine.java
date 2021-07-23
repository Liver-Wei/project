package com.liwei.entity;

import java.util.Date;

/**
 * @author Liver
 * @Description 罚款信息类
 * @date 2021/6/28 17:03
 */

public class Fine {
//    罚款金额
    private float money;
//    罚款时间
    private Date fineTime;
//    是否已支付费用
    private boolean pay;

    public Fine() {
    }

    public Fine(float money, Date fineTime, boolean pay) {
        this.money = money;
        this.fineTime = fineTime;
        this.pay = pay;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    public Date getFineTime() {
        return fineTime;
    }

    public void setFineTime(Date fineTime) {
        this.fineTime = fineTime;
    }

    public boolean isPay() {
        return pay;
    }

    public void setPay(boolean pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Fine{" +
                "money=" + money +
                ", fineTime=" + fineTime +
                ", pay=" + pay +
                '}';
    }
}
