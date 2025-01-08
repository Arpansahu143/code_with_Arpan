import java.util.Scanner;
public class Q8 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a boolean (true/false): ");
String inputString = scanner.nextLine(); // Read input as a string
Boolean booleanObject = Boolean.valueOf(inputString);
System.out.println("The Boolean object is: " + booleanObject);
} }