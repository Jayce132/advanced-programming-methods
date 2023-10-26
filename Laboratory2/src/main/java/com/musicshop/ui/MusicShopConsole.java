package com.musicshop.ui;

import com.musicshop.model.*;
import com.musicshop.repository.*;
import java.util.Scanner;
import java.util.Optional;

public class MusicShopConsole {

    private final ProductRepository productRepository;
    private final CartRepository cartRepository;
    private final CartDetailRepository cartDetailRepository;
    private Cart currentCart = null;

    public MusicShopConsole(ProductRepository productRepository, CartRepository cartRepository, CartDetailRepository cartDetailRepository) {
        this.productRepository = productRepository;
        this.cartRepository = cartRepository;
        this.cartDetailRepository = cartDetailRepository;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        boolean continueRunning = true;

        while (continueRunning) {
            System.out.println("Welcome to the Music Shop!");
            System.out.println("1. View Products");
            System.out.println("2. Add Product to Cart");
            System.out.println("3. View Cart");
            System.out.println("4. Checkout");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    viewProducts();
                    break;
                case 2:
                    System.out.print("Enter Product ID to add to cart: ");
                    Long productId = scanner.nextLong();
                    addToCart(productId);
                    break;
                case 3:
                    viewCart();
                    break;
                case 4:
                    checkout();
                    break;
                case 5:
                    continueRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        System.out.println("Thank you for shopping with us!");
    }

    private void viewProducts() {
        for (Product product : productRepository.findAll()) {
            System.out.println(product.getId() + ": " + product.getName() + " - " + product.getPrice());
        }
    }

    private void addToCart(Long productId) {
        Optional<Product> productOpt = productRepository.findById(productId);
        if (productOpt.isPresent()) {
            Product product = productOpt.get();

            if (currentCart == null) {
                currentCart = new Cart();
                cartRepository.save(currentCart);
            }

            CartDetail cartDetail = new CartDetail();
            cartDetail.setCartID(currentCart.getId());
            cartDetail.setProductID(product.getId());
            cartDetail.setQuantity(1);  // This can be enhanced to ask the user for quantity

            cartDetailRepository.save(cartDetail);
            System.out.println(product.getName() + " added to cart.");

        } else {
            System.out.println("Product not found.");
        }
    }

    private void viewCart() {
        if (currentCart == null) {
            System.out.println("Your cart is empty.");
            return;
        }
        for (CartDetail cartDetail : cartDetailRepository.findAll()) {
            if (cartDetail.getCartID() == currentCart.getId()) {
                Optional<Product> productOpt = productRepository.findById(cartDetail.getProductID());
                if (productOpt.isPresent()) {
                    Product product = productOpt.get();
                    System.out.println(product.getName() + " - " + product.getPrice() + " x " + cartDetail.getQuantity());
                }
            }
        }
    }

    private void checkout() {
        if (currentCart == null) {
            System.out.println("Your cart is empty. Nothing to checkout.");
            return;
        }
        System.out.println("Order placed successfully!");
        currentCart = null;  // Reset the cart after checkout
    }
}