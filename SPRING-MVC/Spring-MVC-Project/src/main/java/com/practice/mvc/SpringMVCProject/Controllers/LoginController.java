package com.practice.mvc.SpringMVCProject.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @RequestMapping("/login")
    public String loginPage(){
        return "login";
    }
}
