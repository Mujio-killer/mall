package com.mujio.orderserver.mapper;


import com.mujio.orderserver.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface OrderMapper {

    @Select("select * from orders where id = #{id}")
    Order getOrder(int id);
}
