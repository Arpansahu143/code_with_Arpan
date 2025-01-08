import java.util.Arrays;
import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print("Enter the value of K: ");
        int k = scanner.nextInt();
        if (k < 1 || k > size) {
            System.out.println("K should be between 1 and " + size);
        } else {
            Arrays.sort(array);
            int kthSmallest = array[k - 1];
            int kthLargest = array[size - k];
            System.out.println("The " + k + "th smallest number is: " +
                    kthSmallest);
            System.out.println("The " + k + "th largest number is: " +
                    kthLargest);
        }
        scanner.close();
    }
}