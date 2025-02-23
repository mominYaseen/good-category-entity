package com.example.good_category_entity.service;

import com.example.good_category_entity.entity.Category;
import com.example.good_category_entity.entity.Goods;
import com.example.good_category_entity.dto.GoodsRequest;
import com.example.good_category_entity.repo.GoodsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsService {

    @Autowired
    private GoodsRepo goodsRepo;

    @Autowired
    CategoryService categoryService;

    public Goods save(GoodsRequest goodsRequest){
        System.out.println("category id from request = " + goodsRequest.getCategoryId() );
        Category category = categoryService.getCategoryById(goodsRequest.getCategoryId());

        Goods goods = new Goods();
        goods.setName(goodsRequest.getName());
        goods.setDescription(goodsRequest.getDescription());
        goods.setCategory(category);
        goods.setName(goodsRequest.getName());

        Goods save = goodsRepo.save(goods);
        System.out.printf("good saved in table");
        return save;
    }

}
