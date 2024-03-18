

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();

        int sum1 = 1, sum2 = 1;

        for (int i = 2; i <= n1/2; i++) {
            if (n1 % i == 0) sum1 += i;
        }

        for (int j = 2; j <= n2/2; j++) {
            if (n2 % j == 0) sum2 += j;
        }

        if (n1 == sum2 && n2 == sum1)
            System.out.println(n1 + " and " + n2 + " are amicable numbers.");
        else
            System.out.println(n1 + " and " + n2 + " are not amicable numbers.");

        sc.close();
    }
}