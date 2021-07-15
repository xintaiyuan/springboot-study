package com.yuan.mybatisplus;

import com.yuan.mybatisplus.mapper.UserMapper;
import com.yuan.mybatisplus.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisPlusApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
        List<User> users = userMapper.selectList(null);
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void insert(){
        User user = new User();
        user.setAge(100);
        user.setName("张三");
        user.setEmail("88888888@qq.com");
        userMapper.insert(user);
        System.out.println(user);
    }

    @Test
    public void update(){
        User user = new User();
        user.setId(1415504105270525959l);
        user.setAge(3);
        user.setName("心态源");
        user.setEmail("2305336130@qq.com");
        userMapper.updateById(user);
        System.out.println(user);
    }

}
