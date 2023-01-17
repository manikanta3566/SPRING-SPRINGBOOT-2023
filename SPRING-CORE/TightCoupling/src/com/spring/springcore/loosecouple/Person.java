package com.spring.springcore.loosecouple;

public class Person {
    Animal animal;
    public Person(Animal animal){
        this.animal=animal;
    }
    public void callAnimalhandle(){
        animal.handleAnimal();
    }
}
