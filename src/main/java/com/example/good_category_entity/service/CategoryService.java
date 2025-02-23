package com.example.good_category_entity.service;

import com.example.good_category_entity.entity.Category;
import com.example.good_category_entity.repo.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepo repo;

    public Category save(Category category){
        return repo.save(category);
    }

    public Category getCategoryById(int id){
        return repo.findById(id).get();
    }

    public List<Category> getAllCategory(){
        return repo.findAll();
    }


}
