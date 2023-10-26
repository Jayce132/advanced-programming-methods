package com.musicshop.model;

import java.time.LocalDateTime;

public class Order extends BaseModel<Long> {
    private int customerID;
    private LocalDateTime orderDate;

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
