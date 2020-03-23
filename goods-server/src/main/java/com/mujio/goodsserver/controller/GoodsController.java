package com.mujio.goodsserver.controller;


import com.mujio.goodsserver.entity.Goods;
import com.mujio.goodsserver.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/goods")
@RestController
public class GoodsController {

    @Autowired
    private GoodService goodService;

    @RequestMapping("/{id}")
    @ResponseBody
    public Goods getGoods(@PathVariable("id") int id){
        return goodService.getGoods(id);
    }

}
