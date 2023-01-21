package com.practice.springcoreconcepts.beanscope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
//@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Person {

    @Autowired
    private Address address;
    public Person(){
        System.out.println("person created");
    }
    public void walk(){
        System.out.println("person is walking");
    }

    public Address getAddress(){
        return address;
    }
}
