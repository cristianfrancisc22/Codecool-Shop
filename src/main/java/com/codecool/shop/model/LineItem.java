package com.codecool.shop.model;

import lombok.Getter;

import java.math.BigDecimal;

@Getter
public class LineItem {

    private int quantity;
    private final BigDecimal productPrice;
    private final String productName;
    private final String productDescription;
    private final String supplier;
    private final int productId;
    private final int orderId;


    public LineItem(int quantity, BigDecimal productPrice, String productName, String productDescription, int orderId, String supplier, int productId) {
        this.quantity = quantity;
        this.productPrice = productPrice;
        this.productName = productName;
        this.productDescription = productDescription;
        this.supplier = supplier;
        this.orderId = orderId;
        this.productId = productId;
    }


    public void setQuantity(int quantity) {
        this.quantity += quantity;
    }


}