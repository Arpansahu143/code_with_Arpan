public class Q13 {
    public static void main(String[] args) {
        // Custom input number
        int number = 112233; // Replace with any number as needed

        int[] frequency = new int[10]; // Array to store the frequency of digits (0-9)
        int temp = Math.abs(number); // Handle negative numbers

        // Count the frequency of each digit
        while (temp > 0) {
            int digit = temp % 10; // Extract the last digit
            frequency[digit]++; // Increment the count for the digit
            temp /= 10; // Remove the last digit
        }

        // Print the frequency of each digit
        System.out.println("Digit frequencies in " + number + ":");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println(i + ": " + frequency[i]);
            }
        }
    }
}