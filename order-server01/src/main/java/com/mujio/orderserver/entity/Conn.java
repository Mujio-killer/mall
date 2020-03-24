package com.mujio.orderserver.entity;

import java.util.List;

public class Conn {
    private int id;

    private int orderid;

    private List goodlist;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public List getGoodlist() {
        return goodlist;
    }

    public void setGoodlist(List goodlist) {
        this.goodlist = goodlist;
    }
}
