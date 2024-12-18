public class Q11 {
    public static void main(String[] args) {
        // Custom input method using a hardcoded number
        int number = 123456; // Replace with any number as needed

        int count = 0;
        int temp = Math.abs(number); // Handle negative numbers

        while (temp > 0) {
            int digit = temp % 10; // Extract the last digit
            if (digit % 2 == 0) {
                count++; // Increment count if the digit is even
            }
            temp /= 10; // Remove the last digit
        }

        System.out.println("The number of even digits in " + number + " is: " + count);
    }
}
