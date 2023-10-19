public class BigNumberOperations {

    // 1. Calculate the sum. Numbers have the same number of digits.
    public static int[] sum(int[] num1, int[] num2) {
        if (num1.length == 0 || num2.length == 0) {
            return new int[]{};
        }

        int len = num1.length;
        int[] result = new int[len];
        int carry = 0;

        for (int i = len - 1; i >= 0; i--) {
            int tempSum = num1[i] + num2[i] + carry;
            result[i] = tempSum % 10;
            carry = tempSum / 10;
        }

        if (carry > 0) {
            int[] newResult = new int[len + 1];
            for (int i = 1; i < newResult.length; i++) {
                newResult[i] = result[i - 1];
            }
            newResult[0] = carry;
            return newResult;
        }
        return result;
    }

    // 2. Calculate the difference. Numbers have the same number of digits.
    public static int[] difference(int[] num1, int[] num2) {
        if (num1.length == 0 || num2.length == 0) {
            return new int[]{};
        }

        int len = num1.length;
        int[] result = new int[len];
        int borrow = 0;

        for (int i = len - 1; i >= 0; i--) {
            int temp = num1[i] - num2[i] - borrow;

            if (temp < 0) {
                temp += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }

            result[i] = temp;
        }

        return result;
    }

    // 3. Calculate the multiplication. The first number is a large number, the second number is only one digit.
    public static int[] multiply(int[] num, int multiplier) {
        if (num.length == 0) {
            return new int[]{};
        }

        if (multiplier == 0) {
            return new int[]{0};
        }

        int len = num.length;
        int[] result = new int[len];
        int carry = 0;

        for (int i = len - 1; i >= 0; i--) {
            int product = num[i] * multiplier + carry;
            result[i] = product % 10;
            carry = product / 10;
        }

        if (carry > 0) {
            int[] newResult = new int[len + 1];
            for (int i = 1; i < newResult.length; i++) {
                newResult[i] = result[i - 1];
            }
            newResult[0] = carry;
            return newResult;
        }
        return result;
    }

    // 4. Calculate the integer division. The first number is a large number, the second number is only one digit.
    public static int[] divide(int[] num, int divisor) {
        if (num.length == 0) {
            return new int[]{};
        }

        if (divisor == 0) {
            throw new ArithmeticException("Division by zero: Divisor can't be zero.");
        }

        int len = num.length;
        int[] result = new int[len];
        int remainder = 0;

        for (int i = 0; i < len; i++) {
            int dividend = remainder * 10 + num[i];
            result[i] = dividend / divisor;
            remainder = dividend % divisor;
        }

        return result;
    }
}
