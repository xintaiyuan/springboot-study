package com.example.springboot.mapper;

import com.example.springboot.pojo.User;

/**
 * @InterfaceName: UserMapper
 * @Desc TODO
 * @Author XinTai-Yuan
 * @Date 2021/7/14 17:11
 * @Version 1.0
 **/

public interface UserMapper {

    public User findUserByUsername(String username);

    public void deleteById(Integer id);

    public void insert(User user);

    public void update(User user);

}
