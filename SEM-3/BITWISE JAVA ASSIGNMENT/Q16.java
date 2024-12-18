public class Q16 {
    public static void main(String[] args) {
        int start = 10; // Starting range
        int end = 20;   // Ending range
        
        System.out.println("Prime numbers between " + start + " and " + end + ":");
        for (int num = start; num <= end; num++) {
            if (isPrime(num)) {
                System.out.println(num); // Print the prime number
            }
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false; // Numbers less than or equal to 1 are not prime
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) return false; // Divisible by i, not prime
        }
        return true; // Prime number
    }
}
