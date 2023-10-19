import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BigNumberOperationsTest {

    @Test
    public void testSumExpectedCase() {
        // Adding two arrays with regular values
        int[] num1 = {1, 2, 3};
        int[] num2 = {4, 5, 6};
        int[] result = BigNumberOperations.sum(num1, num2);
        assertArrayEquals(new int[]{5, 7, 9}, result);
    }

    @Test
    public void testSumUnexpectedCase() {
        // Adding two empty arrays
        int[] num1 = {};
        int[] num2 = {};
        int[] result = BigNumberOperations.sum(num1, num2);
        assertArrayEquals(new int[]{}, result);
    }

    @Test
    public void testDifferenceExpectedCase() {
        // Subtracting a smaller array from a larger array
        int[] num1 = {5, 7, 9};
        int[] num2 = {4, 5, 6};
        int[] result = BigNumberOperations.difference(num1, num2);
        assertArrayEquals(new int[]{1, 2, 3}, result);
    }

    @Test
    public void testDifferenceUnexpectedCase() {
        // Subtracting two empty arrays
        int[] num1 = {};
        int[] num2 = {};
        int[] result = BigNumberOperations.difference(num1, num2);
        assertArrayEquals(new int[]{}, result);
    }

    @Test
    public void testMultiplyExpectedCase() {
        // Multiplying an array with a non-zero digit
        int[] num = {1, 2, 3};
        int multiplier = 3;
        int[] result = BigNumberOperations.multiply(num, multiplier);
        assertArrayEquals(new int[]{3, 6, 9}, result);
    }

    @Test
    public void testMultiplyUnexpectedCase() {
        // Multiplying an empty array
        int[] num = {};
        int multiplier = 3;
        int[] result = BigNumberOperations.multiply(num, multiplier);
        assertArrayEquals(new int[]{}, result);
    }

    @Test
    public void testMultiplyByZeroCase() {
        // Multiplying an array with zero
        int[] num = {1, 2, 3};
        int multiplier = 0;
        int[] result = BigNumberOperations.multiply(num, multiplier);
        assertArrayEquals(new int[]{0}, result);
    }

    @Test
    public void testDivideExpectedCase() {
        // Dividing an array by a non-zero digit
        int[] num = {3, 6, 9};
        int divisor = 3;
        int[] result = BigNumberOperations.divide(num, divisor);
        assertArrayEquals(new int[]{1, 2, 3}, result);
    }

    @Test
    public void testDivideUnexpectedCase() {
        // Dividing an empty array
        int[] num = {};
        int divisor = 3;
        int[] result = BigNumberOperations.divide(num, divisor);
        assertArrayEquals(new int[]{}, result);
    }

    @Test
    public void testDivideByZeroCase() {
        // Testing division by zero
        int[] num = {1, 2, 3};
        int divisor = 0;
        assertThrows(ArithmeticException.class, () -> BigNumberOperations.divide(num, divisor));
    }
}
