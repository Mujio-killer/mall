package com.mujio.goodsserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.mujio.*.mapper")
public class GoodsServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(GoodsServerApplication.class, args);
    }

}
