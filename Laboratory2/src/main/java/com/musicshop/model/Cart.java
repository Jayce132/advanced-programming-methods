package com.musicshop.model;

import java.time.LocalDateTime;

public class Cart {
    private int cartID;
    private int customerID;
    private LocalDateTime dateCreated;

    public Cart(int cartID, int customerID, LocalDateTime dateCreated) {
        this.cartID = cartID;
        this.customerID = customerID;
        this.dateCreated = dateCreated;
    }

    public int getCartID() {
        return cartID;
    }

    public void setCartID(int cartID) {
        this.cartID = cartID;
    }

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