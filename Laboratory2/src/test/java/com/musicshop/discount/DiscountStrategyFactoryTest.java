package com.musicshop.discount;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DiscountStrategyFactoryTest {

    @Test
    public void testStrategyCreation() {
        DiscountStrategy percentageStrategy = DiscountStrategyFactory.createDiscountStrategy(DiscountType.PERCENTAGE, 10);
        DiscountStrategy fixedStrategy = DiscountStrategyFactory.createDiscountStrategy(DiscountType.FIXED, 50);

        Assertions.assertTrue(percentageStrategy instanceof PercentageDiscountStrategy, "Should be a PercentageDiscountStrategy");
        Assertions.assertTrue(fixedStrategy instanceof FixedAmountDiscountStrategy, "Should be a FixedAmountDiscountStrategy");
    }
}

