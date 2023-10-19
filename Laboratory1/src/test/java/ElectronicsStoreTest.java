import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ElectronicsStoreTest {

    @Test
    public void testCheapestKeyboardExpectedCase() {
        int[] keyboards = {40, 50, 60, 35, 45};
        int result = ElectronicsStore.cheapestKeyboard(keyboards);
        assertEquals(35, result);
    }

    @Test
    public void testCheapestKeyboardUnexpectedCase() {
        int[] keyboards = {};
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> ElectronicsStore.cheapestKeyboard(keyboards));
    }

    @Test
    public void testMostExpensiveItemExpectedCase() {
        int[] keyboards = {40, 50, 60};
        int[] USBs = {8, 12, 70};
        int result = ElectronicsStore.mostExpensiveItem(keyboards, USBs);
        assertEquals(70, result);
    }

    @Test
    public void testMostExpensiveItemUnexpectedCase() {
        int[] keyboards = {};
        int[] USBs = {};
        int result = ElectronicsStore.mostExpensiveItem(keyboards, USBs);
        assertEquals(0, result); // Both arrays are empty
    }

    @Test
    public void testMostExpensiveUSBExpectedCase() {
        int[] USBs = {8, 12, 20, 30};
        int result = ElectronicsStore.mostExpensiveUSB(USBs, 25);
        assertEquals(20, result);
    }

    @Test
    public void testMostExpensiveUSBUnexpectedCase() {
        int[] USBs = {};
        int result = ElectronicsStore.mostExpensiveUSB(USBs, 30);
        assertEquals(-1, result); // No USB found
    }

    @Test
    public void testCalculateBudgetSpendExpectedCase() {
        int[] keyboards = {40, 50, 60};
        int[] USBs = {8, 12, 5};
        int result = ElectronicsStore.calculateBudgetSpend(65, keyboards, USBs);
        assertEquals(65, result); // 50 for keyboard + 15 for USB
    }

    @Test
    public void testCalculateBudgetSpendUnexpectedCase() {
        int[] keyboards = {80, 90};
        int[] USBs = {20, 25};
        int result = ElectronicsStore.calculateBudgetSpend(50, keyboards, USBs);
        assertEquals(-1, result); // He can't buy both items with the given budget
    }
}
