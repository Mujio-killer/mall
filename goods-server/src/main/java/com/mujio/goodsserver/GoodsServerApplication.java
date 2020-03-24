package com.mujio.goodsserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;


@SpringBootApplication
@MapperScan("com.mujio.*.mapper")
public class GoodsServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(GoodsServerApplication.class, args);
    }

}
