import java.util.Scanner;
public class Q6 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the dividend (x): ");
int x = scanner.nextInt();
System.out.print("Enter the divisor (y): ");
int y = scanner.nextInt();
int quotient = divide(x, y);
System.out.println("The result of " + x + " / " + y + " is: " + quotient);
scanner.close();
}
public static int divide(int x, int y) {
if (y == 0) {
throw new ArithmeticException("Division by zero is not allowed.");
}
boolean isNegative = (x < 0) ^ (y < 0); // XOR to determine if the result should be negative
x = Math.abs(x);
y = Math.abs(y);
int quotient = 0;
int temp = 0;
for (int i = 31; i >= 0; i--) {
if (temp + (y << i) <= x) {
temp += (y << i);
quotient |= (1 << i);
}
}
return isNegative ? -quotient : quotient;
}
}