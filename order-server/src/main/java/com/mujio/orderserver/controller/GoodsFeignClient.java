package com.mujio.orderserver.controller;

import com.mujio.orderserver.entity.Goods;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "goods-server")
public interface GoodsFeignClient {

    @RequestMapping(value = "/goods/{id}")
    public Goods getGoods(@PathVariable("id") int id);
}
