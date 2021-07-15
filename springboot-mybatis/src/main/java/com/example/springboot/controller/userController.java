package com.example.springboot.controller;

import com.example.springboot.mapper.UserMapper;
import com.example.springboot.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName userController
 * @Desc TODO
 * @Author XinTai-Yuan
 * @Date 2021/7/14 17:25
 * @Version 1.0
 **/
@Controller
public class userController {

    @Autowired
    private UserMapper userMapper;

    @ResponseBody
    @GetMapping("/select/{name}")
    public User User(@PathVariable("name") String username){
        User user = userMapper.findUserByUsername(username);
        return user;
    }

    @ResponseBody
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Integer id){
        userMapper.deleteById(id);
        return "删除成功";
    }

    @ResponseBody
    @GetMapping("/insert")
    public User insert(User user){
        userMapper.insert(user);
        return user;
    }

    @ResponseBody
    @GetMapping("/update/{id}")
    public User update(User user,
                       @PathVariable("id") Integer id){
        userMapper.update(user);
        return user;
    }


}
