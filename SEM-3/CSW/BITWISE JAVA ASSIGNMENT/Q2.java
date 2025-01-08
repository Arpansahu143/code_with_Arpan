public class Q2 {
    public static void main(String[] args) {
        int number = 29; // Example number
        int count = 0;

        while (number > 0) { // Loop until all bits are processed
            int x = number & 1; // Get the last bit
            number >>= 1;       // Right shift the number
            if (x == 1) {
                count++; // Increment count if the bit is 1
            }
        }

        // Check if the count of 1s is even or odd
        if (count % 2 == 0) {
            System.out.println("0"); // Even parity
        } else {
            System.out.println("1"); // Odd parity
        }
    }
}
