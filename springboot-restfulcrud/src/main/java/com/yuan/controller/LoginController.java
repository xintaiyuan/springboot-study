package com.yuan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @ClassName LoginController
 * @Desc
 * @Author XinTai-Yuan
 * @Date 2021/7/11 17:16
 * @Version 1.0
 **/
@Controller
public class LoginController {

    /*
     * @param null
     * @return:null
     * TODO 重定向还没完成
     * @Author XinTai-Yuan
     * @Description  跳转到登录成功页面
     * @Date 2021/7/12 9:06
     **/

//    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @PostMapping("/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Map<String,Object> Map, HttpSession session
                        ){

        if(!StringUtils.isEmpty(username) && "123".equals(password)){
            session.setAttribute("user",username);
            return "redirect:/success";
        } else {
            Map.put("msg","密码或者用户名错误，请重新输入！");
            return "login";
        }
    }


}
