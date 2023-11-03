package com.musicshop;

import com.musicshop.model.cart.Cart;
import com.musicshop.model.product.Product;
import com.musicshop.repository.cart.CartDetailRepository;
import com.musicshop.repository.cart.CartRepository;
import com.musicshop.repository.product.ProductRepository;
import com.musicshop.ui.MusicShopConsole;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class MusicShopApplication {

    public static void main(String[] args) {
        ProductRepository productRepository = new ProductRepository();
        CartRepository cartRepository = new CartRepository();
        CartDetailRepository cartDetailRepository = new CartDetailRepository();

        // Creating and adding products
        Product product1 = new Product();
        product1.setName("Martin LX1E");
        product1.setDescription("Portable and sounds great");
        product1.setPrice(new BigDecimal("550.99"));
        product1.setQuantityAvailable(10);
        product1.setCategoryID(2L);
        productRepository.save(product1);

        Product product2 = new Product();
        product2.setName("Fender Player Stratocaster");
        product2.setDescription("Classic sound and look");
        product2.setPrice(new BigDecimal("649.99"));
        product2.setQuantityAvailable(8);
        product2.setCategoryID(3L);
        productRepository.save(product2);

        // Creating and adding carts
        Cart cart1 = new Cart();
        cart1.setCustomerID(2L);
        cart1.setDateCreated(LocalDateTime.parse("2023-10-15T00:00:00"));
        cartRepository.save(cart1);

//        // Creating and adding cart details
//        CartDetail cartDetail1 = new CartDetail();
//        cartDetail1.setCartID(cart1.getId()); // Assuming ID is assigned upon saving
//        cartDetail1.setProductID(product2.getId()); // Assuming ID is assigned upon saving
//        cartDetail1.setQuantity(1);
//        cartDetailRepository.save(cartDetail1);

        MusicShopConsole console = new MusicShopConsole(productRepository, cartRepository, cartDetailRepository);
        console.start();
    }
}
