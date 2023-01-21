package com.practice.springcoreconcepts.lifecycle;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Student {

    private String name;

    @PostConstruct
    public void postConstruct(){
        name="sachin";
    }

    @PreDestroy
    public void preDestroy(){
        name=null;
        System.out.println(name);
    }

    public String getName(){
        return name;
    }
 }
