package com.example.good_category_entity.controller;

import com.example.good_category_entity.entity.Goods;
import com.example.good_category_entity.dto.GoodsRequest;
import com.example.good_category_entity.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    private GoodsService service;


    @PostMapping("/save-good")
    public Goods save(@RequestBody GoodsRequest goodsRequest){

        System.out.println(goodsRequest.toString());

        return service.save(goodsRequest);
    }

}
