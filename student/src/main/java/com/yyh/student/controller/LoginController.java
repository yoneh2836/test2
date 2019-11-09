package com.yyh.student.controller;

import com.yyh.student.entity.User;
import com.yyh.student.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * User: 鄢意辉
 * Date: 2019/11/7/007
 * Time: 16:02
 */
@Controller
public class LoginController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public String login(String username, String password, HttpSession session, Model model) {
        User user = userService.selectUser(username,password);
        if (user!=null) {
            session.setAttribute("user",user);
            return "main";
        } else {
            model.addAttribute("msg", "用户名或密码错误，请重新登录");
            return "index";
        }
    }

}
