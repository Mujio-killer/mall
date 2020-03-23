package com.mujio.orderserver.service;


import com.mujio.orderserver.entity.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GoodService {

    //利用RestTemplate请求接口
    @Autowired
    private RestTemplate restTemplate;

    public Goods getGoods(int id){
        String url = "http://localhost:8000/goods/" + id;
        Goods goods = new Goods();
        goods.setId(0);
        goods.setName("未能获取到商品信息");
        goods.setPrice("");
        Goods g;
        try {
            g = restTemplate.getForObject(url, Goods.class);
        } finally {
                g = goods;
            return g;
        }

    }
}
