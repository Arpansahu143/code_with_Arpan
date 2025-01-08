import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a double: ");
        String inputString = scanner.nextLine(); // Read input as a string
        double doubleValue = Double.parseDouble(inputString); // Using parseDouble method

        System.out.println("The double value is: " + doubleValue);
        scanner.close();
    }
}