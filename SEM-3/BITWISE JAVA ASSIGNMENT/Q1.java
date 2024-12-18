public class Q1 {
    public static void main(String[] args) {
        int number = 29; // Example number
        System.out.println("Number of set bits in " + number + " is: " + countSetBits(number));
    }

    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            count += n & 1; // Increment count if the last bit is 1
            n >>= 1;       // Right shift the number by 1
        }
        return count;
    }
}