public class Q12 {
    public static void main(String[] args) {
        // Custom input numbers
        int num1 = 1234; // Replace with the first number as needed
        int num2 = 56789; // Replace with the second number as needed

        // Extract the last two digits of the second number
        int lastTwoDigits = num2 % 100;

        // Create the third number
        int thirdNumber = Integer.parseInt(num1 + String.valueOf(lastTwoDigits));

        System.out.println("The third number created is: " + thirdNumber);
    }
}

