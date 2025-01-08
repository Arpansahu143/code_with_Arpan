import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        String inputString = scanner.nextLine(); // Read input as a string
        int intValue = Integer.parseInt(inputString); // Using parseInt method
        System.out.println("The integer value is: " + intValue);
        scanner.close();
    }
}