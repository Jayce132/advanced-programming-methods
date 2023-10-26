package com.musicshop.model;

import java.time.LocalDateTime;

public class Order {
    private int orderID;
    private int customerID;
    private LocalDateTime orderDate;

    public Order(int orderID, int customerID, LocalDateTime orderDate) {
        this.orderID = orderID;
        this.customerID = customerID;
        this.orderDate = orderDate;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }
}
