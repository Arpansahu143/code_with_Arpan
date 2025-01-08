public class Q6 {
    public static int divide(int x, int y) {
        if (y == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }

        // Handle sign of the quotient
        boolean isNegative = (x < 0) ^ (y < 0);

        // Convert both numbers to positive
        x = Math.abs(x);
        y = Math.abs(y);

        int quotient = 0;

        // Subtract y from x repeatedly while keeping count
        while (x >= y) {
            int temp = y, multiple = 1;

            // Double the divisor and multiplier for efficiency
            while (x >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }

            x -= temp;
            quotient += multiple;
        }

        // Apply sign to the result
        return isNegative ? -quotient : quotient;
    }

    public static void main(String[] args) {
        int x = 43;
        int y = -8;

        try {
            int result = divide(x, y);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
