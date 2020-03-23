package com.mujio.goodsserver.mapper;


import com.mujio.goodsserver.entity.Goods;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface GoodsMapper {

    @Select("select * from goods where id = #{id}")
    Goods getGoods(int id);
}
