public class Q2 {
    public static void main(String[] args) {
        int number = 29; // Example number
        System.out.println("Parity of " + number + " is: " + calculateParity(number));
    }

    public static int calculateParity(int n) {
        int parity = 0;
        while (n > 0) {
            parity ^= (n & 1); // Flip parity if the last bit is 1
            n >>= 1;           // Right shift the number by 1
        }
        return parity; // 0 for even number of 1s, 1 for odd number of 1s
    }
}
