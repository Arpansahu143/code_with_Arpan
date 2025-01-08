import java.util.Scanner;
public class SimpleCalculator {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a calculation (e.g., 123+345): ");
String input = scanner.nextLine();
char operator = ' ';
int firstOperand = 0;
int secondOperand = 0;
for (int i = 0; i < input.length(); i++) {
char currentChar = input.charAt(i);
if (currentChar == '+' || currentChar == '-' || currentChar == '*' ||
currentChar == '/') {
operator = currentChar;
firstOperand = Integer.parseInt(input.substring(0, i));
secondOperand = Integer.parseInt(input.substring(i + 1));
break;
}
}
switch (operator) {
case '+':
System.out.println("Sum = " + (firstOperand + secondOperand));
break;
case '-':
System.out.println("Difference = " + (firstOperand -
secondOperand));
break;
case '*':
System.out.println("Product = " + (firstOperand *
secondOperand));
break;
case '/':
if (secondOperand != 0) {
System.out.println("Quotient = " + (firstOperand / (double)
secondOperand));
} else {
System.out.println("Error: Division by zero is not allowed.");
}
break;
default:
System.out.println("Error: Invalid operator.");
break;
}
scanner.close();
}
}