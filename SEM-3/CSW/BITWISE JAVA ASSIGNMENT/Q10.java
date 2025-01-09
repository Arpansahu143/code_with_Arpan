import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first float number: ");
        float num1 = scanner.nextFloat();
        System.out.print("Enter the second float number: ");
        float num2 = scanner.nextFloat();
        float epsilon = 0.0001f; // You can adjust this value as needed, but it should be less than 1

        boolean isDifferenceLessThanEpsilon = isDifferenceLessThanEpsilon(num1, num2,
                epsilon);
        if (isDifferenceLessThanEpsilon) {
            System.out.println("The difference between " + num1 + " and " + num2 + " is less than " + epsilon + ".");
        } else {
            System.out
                    .println("The difference between " + num1 + " and " + num2 + " is not less than " + epsilon + ".");
        }
        scanner.close();
    }

    public static boolean isDifferenceLessThanEpsilon(float a, float b, float epsilon) {
        return Math.abs(a - b) < epsilon;
    }
}