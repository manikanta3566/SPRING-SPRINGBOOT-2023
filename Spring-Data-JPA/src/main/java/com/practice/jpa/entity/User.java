package com.practice.jpa.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user_table")
public class User {

    @Id
    private int id;

    private String name;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Role> roles;

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

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
