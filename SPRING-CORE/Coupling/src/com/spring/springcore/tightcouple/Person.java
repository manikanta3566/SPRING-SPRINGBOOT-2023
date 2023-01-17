package com.spring.springcore.tightcouple;

public class Person {
    Animal animal=new Animal();
    public Person(){
        System.out.println("person created");
    }
    public void callAnimalHandler(){
        animal.handleAnimal();
    }
}
