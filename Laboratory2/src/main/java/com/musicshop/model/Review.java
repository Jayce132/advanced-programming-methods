package com.musicshop.model;

import java.time.LocalDateTime;

public class Review {
    private int reviewID;
    private int productID;
    private int customerID;
    private int rating;
    private String comment;
    private LocalDateTime datePosted;

    public Review(int reviewID, int productID, int customerID, int rating, String comment, LocalDateTime datePosted) {
        this.reviewID = reviewID;
        this.productID = productID;
        this.customerID = customerID;
        this.rating = rating;
        this.comment = comment;
        this.datePosted = datePosted;
    }

    public int getReviewID() {
        return reviewID;
    }

    public void setReviewID(int reviewID) {
        this.reviewID = reviewID;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public LocalDateTime getDatePosted() {
        return datePosted;
    }

    public void setDatePosted(LocalDateTime datePosted) {
        this.datePosted = datePosted;
    }
}
