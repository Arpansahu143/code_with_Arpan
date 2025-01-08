import java.util.Scanner;
public class Q7 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the base (x): ");
double x = scanner.nextDouble();
System.out.print("Enter the exponent (y): ");
int y = scanner.nextInt();
double result = power(x, y);
System.out.println(x + " raised to the power of " + y + " is: " + result);
scanner.close();
}
public static double power(double x, int y) {
if (y == 0) {
return 1; // x^0 is 1
}
if (y < 0) {
x = 1 / x;
y = -y; }
double result = 1;
while (y > 0) {
if ((y & 1) == 1) {
result *= x;
}
x *= x;
y >>= 1;
}
return result;
}
}
