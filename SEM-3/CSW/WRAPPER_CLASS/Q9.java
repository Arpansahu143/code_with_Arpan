import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        String intInput = scanner.nextLine();
        Integer intObject = Integer.valueOf(intInput);
        System.out.println("The Integer object is: " + intObject);
        System.out.print("Enter a float: ");
        String floatInput = scanner.nextLine();
        Float floatObject = Float.valueOf(floatInput);
        System.out.println("The Float object is: " + floatObject);
        System.out.print("Enter a double: ");
        String doubleInput = scanner.nextLine();
        Double doubleObject = Double.valueOf(doubleInput);
        System.out.println("The Double object is: " + doubleObject);
        System.out.print("Enter a boolean (true/false): ");
        String booleanInput = scanner.nextLine();
        Boolean booleanObject = Boolean.valueOf(booleanInput);
        System.out.println("The Boolean object is: " + booleanObject);
        scanner.close();
    }
}