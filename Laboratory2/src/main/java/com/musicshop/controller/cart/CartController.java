package com.musicshop.controller.cart;

import com.musicshop.model.cart.Cart;
import com.musicshop.model.cart.CartDetail;
import com.musicshop.repository.cart.CartDetailRepository;
import com.musicshop.repository.cart.CartRepository;

import java.util.List;
import java.util.Optional;

public class CartController {

    private final CartRepository cartRepository;
    private final CartDetailRepository cartDetailRepository;

    public CartController(CartRepository cartRepository, CartDetailRepository cartDetailRepository) {
        this.cartRepository = cartRepository;
        this.cartDetailRepository = cartDetailRepository;
    }

    public Cart createNewCart() {
        Cart cart = new Cart();
        return cartRepository.save(cart);
    }

    public void addProductToCart(Cart cart, Long productId, int quantity) {
        CartDetail cartDetail = new CartDetail();
        cartDetail.setCartID(cart.getId());
        cartDetail.setProductID(productId);
        cartDetail.setQuantity(quantity);
        cartDetailRepository.save(cartDetail);
    }

    public Optional<CartDetail> getCartDetailByCartIdAndProductId(Long cartId, Long productId) {
        return cartDetailRepository.findByCartIdAndProductId(cartId, productId);
    }

    public List<CartDetail> listAllCartDetails() {
        return cartDetailRepository.findAll();
    }

    public void updateCartDetailQuantity(Long cartDetailId, int newQuantity) {
        Optional<CartDetail> cartDetailOpt = cartDetailRepository.findById(cartDetailId);
        if (cartDetailOpt.isPresent()) {
            CartDetail cartDetail = cartDetailOpt.get();
            cartDetail.setQuantity(newQuantity);
            cartDetailRepository.save(cartDetail);
        }
    }

    public void deleteCartDetail(Long cartDetailId) {
        cartDetailRepository.deleteById(cartDetailId);
    }
}
