public class ArrayOperations {

    // 1. Find the maximum number
    public static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int number : arr) {
            if (number > max) {
                max = number;
            }
        }

        return max;
    }

    // 2. Find the minimum number
    public static int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;

        for (int number : arr) {
            if (number < min) {
                min = number;
            }
        }

        return min;
    }

    // 3. Find the maximum sum of n-1 numbers
    public static int findMaxSum(int[] arr) {
        int min = findMin(arr);

        int sum = 0;

        for (int number : arr) {
            if (number != min) {
                sum += number;
            }
        }

        return sum;
    }

    // 4. Find the minimum sum of n-1 numbers
    public static int findMinSum(int[] arr) {
        int max = findMax(arr);

        int sum = 0;

        for (int number : arr) {
            if (number != max) {
                sum += number;
            }
        }

        return sum;
    }
}
