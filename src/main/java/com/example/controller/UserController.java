package com.example.controller;

import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String index() {
        return "test";
    }

    @RequestMapping("/save")
    public String save(User user, Model model){
        userService.save(user);
        List<User> list = userService.findBaAll();
        model.addAttribute("list",list);
        return "test";
    }

    @RequestMapping("/findByAll")
    public String findByAll(){
        return "test";
    }

}
