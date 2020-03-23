package com.mujio.mall.service;

import com.mujio.mall.entity.Goods;
import com.mujio.mall.entity.Order;
import com.mujio.mall.mapper.ConnMapper;
import com.mujio.mall.mapper.GoodsMapper;
import com.mujio.mall.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    private ConnMapper connMapper;

    @Autowired
    private GoodsMapper goodsMapper;

    @Autowired
    private OrderMapper orderMapper;

    public Order getOrder(int id){
        Order order = new Order();
        order.setId(id);
        List<Integer> list = connMapper.getConn(id);
        List<Goods> goodsList = new ArrayList<>();
        for (int goodsid: list ) {
            goodsList.add(goodsMapper.getGoods(goodsid));
        }
        order.setGoodsList(goodsList);
        order.setCreatedate(orderMapper.getOrder(id).getCreatedate());

        return order;
    }

}
