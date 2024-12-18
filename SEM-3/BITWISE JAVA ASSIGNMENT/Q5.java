public class Q5 {
    public static void main(String[] args) {
        int x = 5; // Example x value
        int y = 3; // Example y value

        System.out.println("x = " + x + ", y = " + y);
        int product = multiply(x, y);
        System.out.println("x * y = " + product);
    }

    // Simplified method to multiply two numbers without using '*'
    public static int multiply(int x, int y) {
        int result = 0;

        // Handle negative y by flipping signs
        boolean isNegative = y < 0;
        y = Math.abs(y);

        while (y > 0) {
            result += x; // Add x to the result y times
            y--;         // Decrement y
        }

        return isNegative ? -result : result;
    }
}
