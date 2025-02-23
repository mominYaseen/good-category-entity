package com.example.good_category_entity.repo;

import com.example.good_category_entity.entity.Goods;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoodsRepo extends JpaRepository<Goods,Integer> {
}
