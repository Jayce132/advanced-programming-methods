import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayOperationsTest {

    @Test
    public void testFindMaxExpectedCase() {
        int[] arr = {4, 8, 3, 10, 17};
        int result = ArrayOperations.findMax(arr);
        assertEquals(17, result);
    }

    @Test
    public void testFindMaxUnexpectedCase() {
        // There can be no maximum on an empty array
        int[] arr = {};
        assertThrows(IllegalArgumentException.class, () -> ArrayOperations.findMax(arr));
    }

    @Test
    public void testFindMinExpectedCase() {
        int[] arr = {4, 8, 3, 10, 17};
        int result = ArrayOperations.findMin(arr);
        assertEquals(3, result);
    }

    @Test
    public void testFindMinUnexpectedCase() {
        // There can be no minimum on an empty array
        int[] arr = {};
        assertThrows(IllegalArgumentException.class, () -> ArrayOperations.findMin(arr));
    }

    @Test
    public void testFindMaxSumExpectedCase() {
        int[] arr = {4, 8, 3, 10, 17};
        int result = ArrayOperations.findMaxSum(arr);
        assertEquals(39, result);
    }

    @Test
    public void testFindMaxSumUnexpectedCase() {
        // Unexpected empty single element array or empty array
        // Sum stays at 0
        int[] arr = {4};
        int result = ArrayOperations.findMaxSum(arr);
        assertEquals(0, result);

        arr = new int[]{};
        result = ArrayOperations.findMaxSum(arr);
        assertEquals(0, result);
    }

    @Test
    public void testFindMinSumExpectedCase() {
        int[] arr = {4, 8, 3, 10, 17};
        int result = ArrayOperations.findMinSum(arr);
        assertEquals(25, result);
    }

    @Test
    public void testFindMinSumUnexpectedCase() {
        // Unexpected empty single element array or empty array
        // Sum stays at 0
        int[] arr = {4};
        int result = ArrayOperations.findMinSum(arr);
        assertEquals(0, result);

        arr = new int[]{};
        result = ArrayOperations.findMinSum(arr);
        assertEquals(0, result);
    }
}
