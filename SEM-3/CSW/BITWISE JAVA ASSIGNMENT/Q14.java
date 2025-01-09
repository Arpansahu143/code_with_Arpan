public class Q14 {
    public static void main(String[] args) {
        int number = 29; // Example number to check

        // Check if the number is prime
        boolean isPrime = isPrimeUsingBitwise(number);

        // Output the result
        System.out.println("Is " + number + " a prime number? " + isPrime);
    }

    public static boolean isPrimeUsingBitwise(int number) {
        // 0 and 1 are not prime
        if (number <= 1) {
            return false;
        }

        // Check divisibility for all numbers from 2 to sqrt(number)
        for (int i = 2; (i * i) <= number; i++) {
            // Correct divisibility check using modulus simulation
            if ((number % i) == 0) { // Replace with proper divisibility check
                return false; // Number is divisible, so it's not prime
            }
        }

        return true; // If no divisors found, the number is prime
    }
}
