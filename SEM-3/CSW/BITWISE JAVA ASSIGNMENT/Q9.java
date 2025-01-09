public class Q9 {
    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10; // Get the last digit
            reversed = reversed * 10 + digit; // Append the digit to the reversed number
            number /= 10; // Remove the last digit from the original number
        }

        return originalNumber == reversed;
    }

    public static void main(String[] args) {
        int number = -121;

        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }
}
