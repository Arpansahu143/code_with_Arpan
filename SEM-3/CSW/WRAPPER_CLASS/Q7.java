import java.util.Scanner;
public class Q7 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a double: ");
String inputString = scanner.nextLine(); // Read input as a string
Double doubleObject = Double.valueOf(inputString); // Using valueOf method

System.out.println("The Double object is: " + doubleObject);
}
}