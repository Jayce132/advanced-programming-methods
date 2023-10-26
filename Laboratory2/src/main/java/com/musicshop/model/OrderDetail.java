package com.musicshop.model;

import java.math.BigDecimal;

public class OrderDetail {
    private int orderID;
    private int productID;
    private int quantity;
    private BigDecimal priceEach;

    public OrderDetail(int orderID, int productID, int quantity, BigDecimal priceEach) {
        this.orderID = orderID;
        this.productID = productID;
        this.quantity = quantity;
        this.priceEach = priceEach;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPriceEach() {
        return priceEach;
    }

    public void setPriceEach(BigDecimal priceEach) {
        this.priceEach = priceEach;
    }
}
