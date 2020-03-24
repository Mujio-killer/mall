package com.mujio.orderserver.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ConnMapper {

    @Select("select goodsid from conn where orderid = #{id}")
    List<Integer> getConn(int id);
}
