import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        char choice;

        do {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            // Update largest and smallest values
            if (number > largest) {
                largest = number;
            }
            if (number < smallest) {
                smallest = number;
            }

            // Prompt user to continue or stop
            System.out.print("Do you want to enter another number? (y/n): ");
            choice = scanner.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        // Display the results
        System.out.println("Largest number entered: " + largest);
        System.out.println("Smallest number entered: " + smallest);
    }
}
