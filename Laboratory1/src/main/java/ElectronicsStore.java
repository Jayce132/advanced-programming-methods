public class ElectronicsStore {

    // 1. Method that returns the cheapest keyboard
    public static int cheapestKeyboard(int[] keyboards) {
        int minPrice = keyboards[0];

        for (int price : keyboards) {
            if (price < minPrice) minPrice = price;
        }

        return minPrice;
    }

    // 2. Method that returns the most expensive item
    public static int mostExpensiveItem(int[] keyboards, int[] USBs) {
        int maxPrice = 0;

        for (int price : keyboards) {
            if (price > maxPrice) maxPrice = price;
        }

        for (int price : USBs) {
            if (price > maxPrice) maxPrice = price;
        }

        return maxPrice;
    }

    // 3. Method that returns the most expensive USB drive that Markus can buy
    public static int mostExpensiveUSB(int[] USBs, int budget) {
        int maxAffordable = -1;  // Default value if none found

        for (int price : USBs) {
            if (price <= budget && price > maxAffordable) maxAffordable = price;
        }

        return maxAffordable;
    }

    // 4. Determine money Markus will spend
    public static int calculateBudgetSpend(int budget, int[] keyboards, int[] USBs) {
        int maxSpend = -1;

        for (int keyboardPrice : keyboards) {
            for (int usbPrice : USBs) {
                int total = keyboardPrice + usbPrice;
                if (total <= budget && total > maxSpend) maxSpend = total;
            }
        }

        return maxSpend;
    }
}
