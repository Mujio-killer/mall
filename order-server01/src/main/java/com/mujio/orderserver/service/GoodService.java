package com.mujio.orderserver.service;


import com.mujio.orderserver.entity.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class GoodService {

    //利用RestTemplate请求接口
    @Autowired
    private RestTemplate restTemplate;

//    @Autowired
//    private DiscoveryClient discoveryClient;

    public Goods getGoods(int id) {
        String serverName = "goods-server";
        String url = "http://" + serverName + "/goods/" + id;
        return restTemplate.getForObject(url,Goods.class);
    }

  /*  public Goods getGoods(int id) {
        String service = "goods-server";
        List<ServiceInstance> instances = discoveryClient.getInstances(service);
        if (instances.isEmpty()) {
            return null;
        }
        //instances.get(0)使用获取到的第一个服务
        String url = "http://" + instances.get(0).getHost() + ":" + instances.get(0).getPort() + "/goods/" + id;
        return restTemplate.getForObject(url, Goods.class);
    }*/

/*    public Goods getGoods(int id){
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

    }*/
}
