package com.practice.mvc.SpringMVCProject.DTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Student {

    private int id;
    private String name;
    private String phoneNumber;

    private String email;

    //    @JsonIgnore
    private Type type = Type.ONLINE;

    public enum Type {
        ONLINE, OFFLINE
    }

    public Student(int id, String name, String phoneNumber, String email, Type type) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.type = type;
    }

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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @JsonProperty
    public Type getType() {
        return type;
    }

    @JsonIgnore
    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", type=" + type +
                '}';
    }
}
