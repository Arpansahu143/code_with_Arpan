import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer n: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            double sum = 0.0;
            for (int i = 1; i <= n; i++) {
                sum += 1.0 / i; // Add the reciprocal of i to the sum
            }
            System.out.printf("The sum of the series up to %d is: %.6f%n", n, sum);
        }
        scanner.close();
    }
}