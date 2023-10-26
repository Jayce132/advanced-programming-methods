package com.musicshop.repository;

import com.musicshop.model.CartDetail;

import java.util.Optional;

public class CartDetailRepository extends InMemoryBaseRepository<CartDetail> {
    public Optional<CartDetail> findByCartIdAndProductId(Long cartId, Long productId) {
        for (CartDetail cartDetail : findAll()) {
            if (cartDetail.getCartID().equals(cartId) && cartDetail.getProductID().equals(productId)) {
                return Optional.of(cartDetail);
            }
        }
        return Optional.empty();
    }

    // Implement specific methods for CartDetail
}
