package com.liwei.controller;

import com.liwei.entity.User;
import com.liwei.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Liver
 * @Description
 * @date 2021/6/29 8:05
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 登录服务
     * @param user
     * @return
     */
    @PostMapping(value = "/login")
    @ResponseBody
    public String login(@RequestBody User user){
        return userService.login(user);
    }

    /**
     * 注册服务
     * @param user
     */
    @PostMapping("/register")
    @ResponseBody
    public void register(@RequestBody User user){
        userService.add(user);
    }

    /**
     * 分页查询
     * @param page 当前页
     * @param limit 条数
     * @return
     */
    @GetMapping("/getPageUser")
    @ResponseBody
    public Map<String, Object> getPageUser(@RequestParam int page, @RequestParam int limit) {
        //查出所有用户
        List<User> allUser = userService.queryUserList();
        int count = allUser.size();
        //开始索引
        int fromIndex = (page - 1) * limit;
//        结束索引
        int toIndex = page * limit;
//        末页
        if (toIndex > count) {
            toIndex = count;
        }
//        返回指定索引列表
        List<User> pageUser = allUser.subList(fromIndex, toIndex);
//        返回指定lay-ui框架表格自动渲染指定json数据格式
        Map<String, Object> map = new HashMap<>();
        map.put("code", 0);
        map.put("msg", "成功");
        map.put("count", count);
        map.put("data", pageUser);
        return map;
    }

    /**
     * 通过用户名查找用户
     * @param username
     * @return
     */
    @RequestMapping("/getUserByName")
    public User getUserByName(@RequestParam String username){
        return userService.findByUserName(username);
    }

    /**
     * 字段修改
     * @param userId 用户if
     * @param field 字段名
     * @param value 要修改的值
     */
    @RequestMapping("/update")
    public void update(@RequestParam int userId, @RequestParam String field,@RequestParam String value){
        userService.edit(userId,field,value);
    }

    /**
     * 删除用户By  id
     * @param userId
     */
    @RequestMapping(value = "/delete")
    public void delete(@RequestParam int userId){
        User user = new User();
        user.setUserId(userId);
        userService.delete(user);
    }


    /**
     * 批量删除
     * @param list
     */
    @PostMapping(value = "/deleteBatch")
    public void deleteBatch(@RequestBody List<User> list){
        userService.deleteBatch(list);
        }
}