package com.practice.jpa.entity;

import javax.persistence.*;

@Entity
@Table(name = "laptop_table")
public class Laptop {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String brand;

    private String price;

    @OneToOne(mappedBy = "laptop")
    private Student student;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
