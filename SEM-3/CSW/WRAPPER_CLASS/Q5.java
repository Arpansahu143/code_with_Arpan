import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to enter an integer as a string
        System.out.print("Enter an integer: ");
        String inputString = scanner.nextLine(); // Read input as a string
        // Convert the string to an Integer object
        Integer integerObject = Integer.valueOf(inputString); // Using valueOf method

        // Display the result
        System.out.println("The Integer object is: " + integerObject);
        // Close the scanner
        scanner.close();
    }
}