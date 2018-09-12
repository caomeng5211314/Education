package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class loginController {


    @RequestMapping("/login")
    @ResponseBody
    public Object login(Model model){

        System.out.println("成功");

        return null;
    }
}
