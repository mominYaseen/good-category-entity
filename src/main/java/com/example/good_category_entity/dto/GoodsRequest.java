package com.example.good_category_entity.dto;


public class GoodsRequest {
    private String name;
    private String description;
    private int categoryId; // User selects this

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

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
}

//INSERT INTO CATEGORY (name) values ('Food Items');
//INSERT INTO CATEGORY (name) values ('Clothing and Accessories');
//INSERT INTO CATEGORY (name) values ('Household Essentials');
//INSERT INTO CATEGORY (name) values ('Education and Learning');
//INSERT INTO CATEGORY (name) values ('Electronics');
//INSERT INTO CATEGORY (name) values ('Furniture');
//INSERT INTO CATEGORY (name) values (' Health and Hygiene');
//INSERT INTO CATEGORY (name) values ('Toys and Recreational Items');
//INSERT INTO CATEGORY (name) values ('Miscellaneous');