package com.liwei.entity;

/**
 * @author Liver
 * @Description 用户实体类
 * @date 2021/6/28 13:05
 */
public class User {
    private int userId;
    //用户名
    private String username;
    //密码
    private String password;
    //手机号码
    private String phone;
//    借阅编号
    private String cardNumber;
    //是否为管理员
    private boolean Admin;

    public User(int userId, String username, String password, String phone, String cardNumber, boolean admin) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.cardNumber = cardNumber;
        Admin = admin;
    }

    public User() {
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public boolean isAdmin() {
        return Admin;
    }

    public void setAdmin(boolean admin) {
        Admin = admin;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", Admin=" + Admin +
                '}';
    }
}
