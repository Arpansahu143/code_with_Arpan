public class Q8 {
    public static int reverse(int number) {
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10; // Get the last digit
            reversed = reversed * 10 + digit; // Append the digit to the reversed number
            number /= 10; // Remove the last digit from the original number
        }

        return reversed;
    }

    public static void main(String[] args) {
        int number = 12345;

        int reversedNumber = reverse(number);
        System.out.println("The reverse of " + number + " is " + reversedNumber);
    }
}
