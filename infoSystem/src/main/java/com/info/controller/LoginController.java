package com.info.controller;

import com.info.entity.User;
import com.info.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

    //注入userServics
    @Autowired
    UserService userService;

    @RequestMapping("/")
    public String show() {

        return "login";

    }

    @RequestMapping(value = "/loginIn", method = RequestMethod.POST)
    public String loginIn(String userid, String password, Model model) {
        User userAdmin = userService.loginIn(userid, password);
        if (userAdmin != null) {
            // 登录验证成功，返回成功页面
            //return "redirect:userQuestion";
            //String ms= "sucsss";
            return  "success";

        } else {
            // 登录验证失败，设置错误信息并返回登录页面
            model.addAttribute("error", "管理者ID と パスワード 確認してください。"); // 设置错误信息
            return "login";
        }
    }


}
