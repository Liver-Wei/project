package com.liwei.mapper;

import com.liwei.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Liver
 * @Description
 * @date 2021/6/28 19:58
 */

@Mapper
@Repository
public interface UserMapper {
    /**
     * 查询所有用户
     * @return 所有用户列表
     */
    List<User> queryUserList();

    /**
     * 使用用户名查找用户
     * @param username
     * @return
     */
    User findByUserName(String username);

    /**
     * 添加用户
     * @param user
     */
    void add(User user);

    /**
     * 删除用户
     * @param user
     */
    void delete(User user);

    /**
     * 更改用户信息
     * @param user
     */
    void edit(int userId,String field,String value);

}
