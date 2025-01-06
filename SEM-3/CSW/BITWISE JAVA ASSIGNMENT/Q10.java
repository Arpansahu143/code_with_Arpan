import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first float number: ");
        float num1 = scanner.nextFloat();

        System.out.print("Enter the second float number: ");
        float num2 = scanner.nextFloat();

        System.out.print("Enter the threshold value: ");
        float threshold = scanner.nextFloat();

        float difference = Math.abs(num1 - num2);

        if (difference < threshold) {
            System.out.println("The difference (" + difference + ") is less than the threshold (" + threshold + ").");
        } else {
            System.out.println("The difference (" + difference + ") is not less than the threshold (" + threshold + ").");
        }

        scanner.close();
    }
}
