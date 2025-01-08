public class Q8 {
    public static int reverse(int number) {
        int reversed = 0;
        int sign = number < 0 ? -1 : 1;
        number = Math.abs(number);

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        return reversed * sign;
    }

    public static void main(String[] args) {
        int input1 = 123;
        int input2 = -245;

        System.out.println("Reversed " + input1 + " is: " + reverse(input1)); // Outputs: 321
        System.out.println("Reversed " + input2 + " is: " + reverse(input2)); // Outputs: -542
    }
}
