
import java.util.*;

public class Assign_2 {

    public static int findSum(int[] array, int n) {
        if (n <= 0) {
            return 0;
        }
        return findSum(array, n - 1) + array[n - 1];
    }

    public static int findMax(int[] array, int n) {
        if (n == 1) {
            return array[0];
        }
        return Math.max(array[n - 1], findMax(array, n - 1));
    }

    public static int findMin(int[] array, int n) {
        if (n == 1) {
            return array[0];
        }
        return Math.min(array[n - 1], findMin(array, n - 1));
    }

    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * power(x, n - 1);
    }

    public static int findSmallestMissing(int[] array, int low, int high) {
        if (low > high) {
            return high + 1;

        }

        if (low != array[low]) {
            return low;
        }
        int mid = low + (high - low) / 2;
        if (array[mid] == mid) {
            return findSmallestMissing(array, mid + 1, high);
        } else {
            return findSmallestMissing(array, low, mid);
        }
    }

    public static void DecimaltoHex(int n) {
        if (n == 0) {
            System.out.println(0);
        }
        DecimaltoHex(n / 16);
        int rem = n % 16;
        if (rem < 10) {
            System.out.println(rem);
        } else {
            System.out.println((char) ('A' + (rem - 10)));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Sum of n numbers");
        System.out.println("2. Max and Min");
        System.out.println("3. Factorial");
        System.out.println("4. Fibonacci");
        System.out.println("5. GCD");
        System.out.println("6. Power");
        System.out.println("7. Missing positive number");
        System.out.println("8. Decimal to Hexadecimal");
        System.out.println("Enter a number :");

        int n = sc.nextInt();
        switch (n) {
            case 1:
                int[] array = { 1, 2, 3, 4, 5 };
                int sum = findSum(array, array.length);
                System.out.println("Sum of the array is :" + sum);
                break;

            case 2:
                int array2[] = { 3, 5, 1, 8, 2, 7, 4 };
                int max = findMax(array2, array2.length);
                int min = findMin(array2, array2.length);
                System.out.println("The max element is :" + max);
                System.out.println("The min element is :" + min);
                break;

            case 3:
                int num = 5;
                int result = factorial(num);
                System.out.println("the factorial of " + num + " is : " + result);
                break;

            case 4:
                int numf = 7;
                int res = fibonacci(numf);
                System.out.println("the " + n + "th Fibonacci number is :" + res);
                break;

            case 5:
                int num1 = 56;
                int num2 = 98;
                int res2 = gcd(num1, num2);
                System.out.println("The GCD of " + num1 + " and " + num2 + " is " + res2);
                break;

            case 6:
                int base = 2, exponent = 5;
                int res3 = power(base, exponent);
                System.out.println(base + " raised to the power of " + exponent + " is " + res3);
                break;

            case 7:
                int[] arr7 = { 1, 2, 3, 4, 6, 7 };
                int MissingNumber = findSmallestMissing(arr7, 0, arr7.length - 1);
                System.out.println("The smallest Missing Number is : " + MissingNumber);
                break;

            case 8:
                int decimalNumber = 2545;
                if (decimalNumber == 0) {
                    System.out.println("0");

                } else {
                    System.out.println("Hexadecimal representation of " + decimalNumber + " is :");
                    DecimaltoHex(decimalNumber);
                }

                break;

            default:
                System.out.println("End");
        }
    }
}
