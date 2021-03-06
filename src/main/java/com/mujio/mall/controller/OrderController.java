package com.mujio.mall.controller;


import com.mujio.mall.entity.Order;
import com.mujio.mall.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/order")
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/{id}")
    @ResponseBody
    public Order getOrder(@PathVariable("id") int id){
        return orderService.getOrder(id);
    }
}
