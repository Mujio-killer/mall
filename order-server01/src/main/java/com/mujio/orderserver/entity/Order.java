package com.mujio.orderserver.entity;

import java.util.Date;
import java.util.List;

public class Order {
    private int id;

    private List<Goods> goodsList;

    private Date createdate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Goods> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(List<Goods> goodsList) {
        this.goodsList = goodsList;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }


    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", goodsList=" + goodsList +
                ", createdate=" + createdate +
                '}';
    }
}
