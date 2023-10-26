package com.musicshop.model;

import java.time.LocalDateTime;

public class Cart extends BaseModel<Long> {
    private int customerID;
    private LocalDateTime dateCreated;

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }
}