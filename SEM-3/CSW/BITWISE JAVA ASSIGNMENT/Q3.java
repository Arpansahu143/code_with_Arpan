public class Q3 {
    public static void main(String[] args) {
        int number = 29; // Example number: 29 (Binary: 11101)
        int i = 1;       // Bit positions to swap (0-indexed from the right)
        int j = 3;
        
        System.out.println("Original number: " + number + " (Binary: " + Integer.toBinaryString(number) + ")");
        int result = swapBits(number, i, j);
        System.out.println("After swapping bits at positions " + i + " and " + j + ": " 
                            + result + " (Binary: " + Integer.toBinaryString(result) + ")");
    }

    public static int swapBits(int n, int i, int j) {
        // Extract the ith and jth bits
        int ithBit = (n >> i) & 1;
        int jthBit = (n >> j) & 1;

        // If the bits are the same, no need to swap
        if (ithBit == jthBit) {
            return n;
        }

        // Create a bit mask with 1s at ith and jth positions
        int bitMask = (1 << i) | (1 << j);

        // Toggle the ith and jth bits using XOR
        return n ^ bitMask;
    }
}
