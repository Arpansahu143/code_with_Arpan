import java.util.Scanner;
public class Q8 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter an integer: ");
int number = scanner.nextInt();
int reversedNumber = reverse(number);
System.out.println("The reverse of " + number + " is: " + reversedNumber);
scanner.close();
}
public static int reverse(int num) {
int reversed = 0;
int sign = (num < 0) ? -1 : 1;
num = Math.abs(num);
while (num != 0) {
int digit = num % 10;
reversed = reversed * 10 + digit;
num /= 10; }
return reversed * sign;
}
}