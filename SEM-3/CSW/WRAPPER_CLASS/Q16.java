import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer largest = null;
        Integer smallest = null;
        while (true) {
            System.out.print("Enter a number (or type 'exit' to finish): ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            try {
                int number = Integer.parseInt(input);
                if (largest == null || number > largest) {
                    largest = number;
                }
                if (smallest == null || number < smallest) {
                    smallest = number;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
        if (largest != null && smallest != null) {
            System.out.println("Largest number entered: " + largest);
            System.out.println("Smallest number entered: " + smallest);
        } else {
            System.out.println("No numbers were entered.");
        }
        scanner.close();
    }
}