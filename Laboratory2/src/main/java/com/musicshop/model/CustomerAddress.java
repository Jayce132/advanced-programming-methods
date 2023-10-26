package com.musicshop.model;

public class CustomerAddress {
    private int customerID;
    private int addressID;

    public CustomerAddress(int customerID, int addressID) {
        this.customerID = customerID;
        this.addressID = addressID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getAddressID() {
        return addressID;
    }

    public void setAddressID(int addressID) {
        this.addressID = addressID;
    }
}