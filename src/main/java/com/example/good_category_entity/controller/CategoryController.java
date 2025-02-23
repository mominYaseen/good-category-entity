package com.example.good_category_entity.controller;

import com.example.good_category_entity.entity.Category;
import com.example.good_category_entity.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService service;


    @PostMapping("save-category")
    public Category save(@RequestBody Category category)
    {
        return service.save(category);
    }


    @GetMapping("/all-category")
    public List<Category> getAllCategory(){
        return service.getAllCategory();
    }
}
