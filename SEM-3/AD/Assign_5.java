import java.util.Arrays;
import java.util.Scanner;

public class Assign_5 {

    // Linear Search - Iterative
    public static int linearSearch(int[] arr, int item) {
        int comparisons = 0; // Counter for comparisons
        for (int i = 0; i < arr.length; i++) {
            comparisons++;
            if (arr[i] == item) {
                System.out.println("Comparisons made: " + comparisons);
                return i; // Return index if found
            }
        }
        System.out.println("Comparisons made: " + comparisons);
        return -1; // Return -1 if not found
    }

    // Linear Search - Recursive
    public static int linearSearchRecursive(int[] arr, int item, int index, int[] comparisons) {
        if (index >= arr.length) {
            System.out.println("Comparisons made: " + comparisons[0]);
            return -1; // Base case: item not found
        }
        comparisons[0]++; // Increment comparison count
        if (arr[index] == item) {
            System.out.println("Comparisons made: " + comparisons[0]);
            return index; // Return index if found
        }
        return linearSearchRecursive(arr, item, index + 1, comparisons); // Recursive call
    }

    // Binary Search - Iterative
    public static int binarySearch(int[] arr, int item) {
        int left = 0;
        int right = arr.length - 1;
        int comparisons = 0; // Counter for comparisons

        while (left <= right) {
            int mid = left + (right - left) / 2;
            comparisons++;
            if (arr[mid] == item) {
                System.out.println("Comparisons made: " + comparisons);
                return mid; // Return index if found
            }
            if (arr[mid] < item) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }
        System.out.println("Comparisons made: " + comparisons);
        return -1; // Return -1 if not found
    }

    // Binary Search - Recursive
    public static int binarySearchRecursive(int[] arr, int left, int right, int item, int[] comparisons) {
        if (left > right) {
            System.out.println("Comparisons made: " + comparisons[0]);
            return -1; // Base case: item not found
        }
        int mid = left + (right - left) / 2;
        comparisons[0]++; // Increment comparison count

        if (arr[mid] == item) {
            System.out.println("Comparisons made: " + comparisons[0]);
            return mid; // Return index if found
        }
        if (arr[mid] < item) {
            return binarySearchRecursive(arr, mid + 1, right, item, comparisons); // Search in the right half
        } else {
            return binarySearchRecursive(arr, left, mid - 1, item, comparisons); // S earch in the left half
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of elements
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // Input elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Input item to search
        System.out.print("Enter the item to search: ");
        int item = scanner.nextInt();

        // Choose search method
        System.out.print("Choose search method: (1) Linear (2) Binary: ");
        int choice = scanner.nextInt();

        int result = -1;
        switch (choice) {
            case 1: // Linear Search
                System.out.print("Choose Linear Search method: (1) Iterative (2) Recursive: ");
                int linearChoice = scanner.nextInt();
                if (linearChoice == 1) {
                    result = linearSearch(arr, item);
                } else {
                    int[] comparisons = { 0 }; // Array to hold comparison count
                    result = linearSearchRecursive(arr, item, 0, comparisons);
                }
                break;

            case 2: // Binary Search
                Arrays.sort(arr); // Sort the array before binary search
                System.out.println("Sorted array: " + Arrays.toString(arr));
                int[] comparisons = { 0 }; // Array to hold comparison count
                result = binarySearch(arr, item);
                break;

            default:
                System.out.println("Invalid choice.");
                break;
        }

        // Output the result of the search
        if (result != -1) {
            System.out.println("Item found at index: " + result);
        } else {
            System.out.println("Item not found.");
        }

        scanner.close();
    }
}