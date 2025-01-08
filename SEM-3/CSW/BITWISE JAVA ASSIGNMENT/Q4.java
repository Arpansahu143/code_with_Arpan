import java.util.Scanner;
public class Q4 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a 64-bit integer: ");
long number = scanner.nextLong();
long reversedNumber = reverseBits(number);
System.out.println("Original number: " + number);
System.out.println("Reversed number: " + reversedNumber);
scanner.close();
}
public static long reverseBits(long n) {
long reversed = 0;
for (int i = 0; i < 64; i++) {
long lastBit = (n >> i) & 1;
reversed |= (lastBit << (63 - i));
}
return reversed;
}
}