package com.mujio.orderserver.service;


import com.mujio.orderserver.controller.GoodsFeignClient;
import com.mujio.orderserver.entity.Goods;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GoodService {

    // 引入feign
    @Autowired
    private GoodsFeignClient goodsFeignClient;

    //启用负载均衡后，有restTemplate自己去选择访问那个服务
    @HystrixCommand(fallbackMethod = "getGoodsServiceOffline")
    public Goods getGoods(int id){
        return goodsFeignClient.getGoods(id);
    }

    public Goods getGoodsServiceOffline(int id){
        Goods goods = new Goods();
        goods.setId(0);
        goods.setName("未能获取到商品信息");
        goods.setPrice("");
        return goods;
    }



/*
    @Autowired
    private RestTemplate restTemplate;

    //启用负载均衡后，restTemplate自动选择访问哪个服务
    @HystrixCommand(fallbackMethod = "getGoodsServiceOffline")
    public Goods getGoods(int id){
        String serverName = "goods-server";
        String url = "http://" + serverName + "/goods/" + id;
        return restTemplate.getForObject(url,Goods.class);
    }
    //请求失败后，调用fallbackMethod指定的方法
    public Goods getGoodsServiceOffline(int id){
        Goods goods = new Goods();
        goods.setId(0);
        goods.setName("未能获取到商品信息");
        goods.setPrice("");
        return goods;
    }

*/



/*
//    @Autowired
//    private DiscoveryClient discoveryClient;

    public Goods getGoods(int id) {
        String serverName = "goods-server";
        String url = "http://" + serverName + "/goods/" + id;
        System.out.println(url);
        return restTemplate.getForObject(url,Goods.class);
    }
*/

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
