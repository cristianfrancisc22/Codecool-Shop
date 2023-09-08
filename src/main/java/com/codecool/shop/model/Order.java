package com.codecool.shop.model;

import lombok.Getter;
import java.util.Date;



@Getter
public class Order {
    private int id;
    private final Date date;
    private final int userId;
    private final String status;



    public Order(int id, int userId, Date date, String status) {
        this.id = id;
        this.date = date;
        this.userId = userId;
        this.status = status;
    }

    // maybe we don't need setter for id
    public void setId(int id) {
        this.id = id;
    }


}