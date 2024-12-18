public class Q7 {
    public static int power(int x, int y) {
        int result = 1;

        // Loop y times to multiply x
        for (int i = 0; i < y; i++) {
            result *= x;
        }

        return result;
    }

    public static void main(String[] args) {
        int x = 2;
        int y = 5;

        int result = power(x, y);
        System.out.println(x + "^" + y + " = " + result);
    }
}
