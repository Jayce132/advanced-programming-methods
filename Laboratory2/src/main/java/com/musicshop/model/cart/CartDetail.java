package com.musicshop.model.cart;

import com.musicshop.model.BaseModel;

public class CartDetail extends BaseModel<Long> {
    private Long cartID;
    private Long productID;
    private int quantity;

    public Long getCartID() {
        return cartID;
    }

    public void setCartID(Long cartID) {
        this.cartID = cartID;
    }

    public Long getProductID() {
        return productID;
    }

    public void setProductID(Long productID) {
        this.productID = productID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}