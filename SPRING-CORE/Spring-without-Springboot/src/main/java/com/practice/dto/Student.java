package com.practice.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Student {

    @Autowired
    private Book book;
    public void studying(){
        System.out.println("student studying");
        book.mathsBook();
    }
}
