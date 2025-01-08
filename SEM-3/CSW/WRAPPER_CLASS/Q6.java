import java.util.Scanner;
public class Q6 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a float: ");
String inputString = scanner.nextLine(); // Read input as a string
Float floatObject = Float.valueOf(inputString);
System.out.println("The Float object is: " + floatObject);
} }