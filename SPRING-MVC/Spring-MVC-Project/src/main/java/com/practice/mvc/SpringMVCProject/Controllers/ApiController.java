package com.practice.mvc.SpringMVCProject.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api")
public class ApiController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello world";
    }
}
