package com.mujio.mall.service;

import com.mujio.mall.entity.Goods;
import com.mujio.mall.mapper.GoodsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodService {

    @Autowired
    private GoodsMapper goodsMapper;

    public Goods getGoods(int id){
        return goodsMapper.getGoods(id);
    }
}
