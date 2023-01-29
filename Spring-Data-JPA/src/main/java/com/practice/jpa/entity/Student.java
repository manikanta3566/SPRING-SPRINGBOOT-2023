package com.practice.jpa.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "student_table")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "student_name")
    private String name;

    private String about;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "laptop_id")
    private Laptop laptop;

    @OneToMany(mappedBy = "student",cascade = CascadeType.PERSIST)
    private List<Course> courses;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
