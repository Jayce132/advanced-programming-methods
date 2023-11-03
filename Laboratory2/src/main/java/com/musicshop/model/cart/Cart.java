package com.musicshop.model.cart;

import com.musicshop.model.BaseModel;

import java.time.LocalDateTime;

public class Cart extends BaseModel<Long> {
    private Long customerID;
    private LocalDateTime dateCreated;

    public Long getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Long customerID) {
        this.customerID = customerID;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }
}