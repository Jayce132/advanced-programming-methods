package com.musicshop.discount;

import com.musicshop.model.product.Product;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PercentageDiscountStrategy implements DiscountStrategy {
    private final BigDecimal percent;

    public PercentageDiscountStrategy(double percent) {
        this.percent = BigDecimal.valueOf(percent).divide(BigDecimal.valueOf(100));
    }

    @Override
    public BigDecimal applyDiscount(Product product) {
        BigDecimal price = product.getPrice();

        // Separate the whole number and fractional parts
        BigDecimal wholePart = price.setScale(0, RoundingMode.DOWN);
        BigDecimal fractionalPart = price.remainder(BigDecimal.ONE);

        // Apply discount only to the whole part
        BigDecimal discountedWholePart = wholePart.multiply(BigDecimal.ONE.subtract(percent));

        // Combine the discounted whole part with the original fractional part
        return discountedWholePart.add(fractionalPart).setScale(2, RoundingMode.HALF_UP);
    }
}


