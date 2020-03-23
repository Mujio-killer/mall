package com.mujio.mall.mapper;


import com.mujio.mall.entity.Goods;
import com.mujio.mall.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Mapper
public interface OrderMapper {

    @Select("select * from orders where id = #{id}")
    Order getOrder(int id);
}
