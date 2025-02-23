package com.example.good_category_entity.entity;

import jakarta.persistence.*;

@Entity
public class Goods {

//    id INT NOT NULL PRIMARY KEY auto_increment,

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
//    name varchar(255) not null,
    @Column(name = "name",nullable = false,length = 255)
    private String name;
//    description TEXT NOT NULL ,
    @Column(name = "description",nullable = false,columnDefinition = "TEXT")
    private String description;

    @ManyToOne
    @JoinColumn(name = "categories" , referencedColumnName = "id")
    private Category category;

    public Goods() {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
