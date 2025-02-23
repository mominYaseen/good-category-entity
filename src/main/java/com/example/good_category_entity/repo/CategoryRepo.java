package com.example.good_category_entity.repo;

import com.example.good_category_entity.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category,Integer> {
}
