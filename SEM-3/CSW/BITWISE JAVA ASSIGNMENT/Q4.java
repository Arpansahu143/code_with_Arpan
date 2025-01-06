public class Q4 {
    public static void main(String[] args) {
        long input = 0xAAAAAAAAAAAAAAAAL; // Example input: Alternating 1s and 0s (1010...10)
        System.out.println("Input: " + input + " (Binary: " + toBinaryString(input) + ")");
        long reversed = reverseBits(input);
        System.out.println("Reversed: " + reversed + " (Binary: " + toBinaryString(reversed) + ")");
    }

    public static long reverseBits(long n) {
        long result = 0;
        for (int i = 0; i < 64; i++) {
            // Extract the least significant bit
            long bit = n & 1;

            // Shift the bit to its reversed position and add to result
            result |= (bit << (63 - i));

            // Shift the input number right by 1 to process the next bit
            n >>= 1;
        }
        return result;
    }

    // Helper function to display binary representation of 64-bit number
    public static String toBinaryString(long n) {
        StringBuilder binary = new StringBuilder(Long.toBinaryString(n));
        while (binary.length() < 64) {
            binary.insert(0, "0"); // Pad with leading zeros to make it 64-bit
        }
        return binary.toString();
    }
}