package com.liwei.service;

import com.liwei.entity.User;
import com.liwei.mapper.UserMapper;
import com.liwei.util.MD5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Liver
 * @Description
 * @date 2021/6/28 20:10
 */

@Service
public class UserService implements UserMapper {

    private UserMapper userMapper;

//    @Autowired
//    public UserService(UserMapper userMapper) {
//        this.userMapper = userMapper;
//    }

    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    /**
     * 用户登录验证
     * @param user
     * @return String
     */
    public String login(User user){
//        密码采用MD5加密
//        user.setPassword(MD5.md5(user.getPassword()));
        System.out.println(user.toString());
        User dbUser = userMapper.findByUserName(user.getUsername());
        System.out.println(dbUser.toString());
        if (dbUser==null){
            return "user not exist";
        }
        else if (dbUser.getPassword().equals(user.getPassword())){
                return "success";
            }  else  return "error";
    }

//    public void register(User user){
//        userMapper.add(user);
//    }
//
//    public List<User> getAllUser(){
//        return userMapper.queryUserList();
//    }

    @Override
    public List<User> queryUserList() {
        return userMapper.queryUserList();
    }

    @Override
    public User findByUserName(String username) {
        return userMapper.findByUserName(username);
    }

    @Override
    public void add(User user) {
//        密码MD5加密
        user.setPassword(MD5.md5(user.getPassword()));
        userMapper.add(user);
    }

    @Override
    public void delete(User user) {
        userMapper.delete(user);
    }

    @Override
    public void edit(int userId, String field, String value) {
        userMapper.edit(userId,field,value);
    }

    public void deleteBatch(List<User> list){
        for (User user : list) {
            userMapper.delete(user);
        }
    }
}