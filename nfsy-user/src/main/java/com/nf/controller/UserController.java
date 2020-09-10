package com.nf.controller;

import com.nf.pojo.User;
import com.nf.service.UserService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    UserService userService;
    @RequestMapping("/sendMail")
    public String sendMail(@RequestBody Map map){
        Object email = map.get("email");
        return userService.sendMail(email.toString());
    }
}
