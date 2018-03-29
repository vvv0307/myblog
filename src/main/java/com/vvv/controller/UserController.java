package com.vvv.controller;

import com.vvv.pojo.User;
import com.vvv.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by vvv on 2018/3/29.
 */
//注册用户
@Controller
@RequestMapping (value = "/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping(value="/register",method = RequestMethod.POST)
    @ResponseBody
    public void register(HttpServletRequest request){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        int role = Integer.valueOf(request.getParameter("role"));
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setRole(role);
        userService.register(user);
    }

}
