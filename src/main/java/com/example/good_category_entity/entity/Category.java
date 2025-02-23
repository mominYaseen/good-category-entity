package com.example.good_category_entity.entity;

import jakarta.persistence.*;

@Entity
public class Category {
//    id int primary key not null auto_increment ,
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int id;

//    name varchar(100) not null unique
    @Column(name = "name",nullable = false,length = 255)
    private String name;

    public Category() {
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
}
