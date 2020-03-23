package com.mujio.goodsserver.service;


import com.mujio.goodsserver.entity.Goods;
import com.mujio.goodsserver.mapper.GoodsMapper;
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
