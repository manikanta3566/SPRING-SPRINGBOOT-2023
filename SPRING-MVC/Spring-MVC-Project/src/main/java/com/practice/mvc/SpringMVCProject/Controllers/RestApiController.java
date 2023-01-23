package com.practice.mvc.SpringMVCProject.Controllers;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;

@RestController
@RequestMapping("/v0/api")
public class RestApiController {

    //@RequestMapping(value = "/hello",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    @GetMapping(value = "/hello",produces = MediaType.APPLICATION_JSON_VALUE)
    public String hello() {
        return "hello";
    }
}


