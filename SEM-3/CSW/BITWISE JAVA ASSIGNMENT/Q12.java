import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first integer number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter the second integer number: ");
        int secondNumber = scanner.nextInt();
        int combinedNumber = createCombinedNumber(firstNumber, secondNumber);
        System.out.println("The combined number is: " + combinedNumber);
        scanner.close();
    }

    public static int createCombinedNumber(int first, int second) {
        int firstTwoDigits = Math.abs(first) / (int) Math.pow(10, (int) Math.log10(Math.abs(first)) - 1);
        int lastTwoDigits = Math.abs(second) % 100;
        return firstTwoDigits * 100 + lastTwoDigits;
    }
}