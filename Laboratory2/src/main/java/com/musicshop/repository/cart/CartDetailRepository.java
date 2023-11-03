package com.musicshop.repository.cart;

import com.musicshop.model.cart.CartDetail;
import com.musicshop.repository.InMemoryBaseRepository;

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
