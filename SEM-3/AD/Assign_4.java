import java.util.*;

public class Assign_4{
    public static void reduceArray(int[] arr) {
        // Q1
        // Sort the array so we can easily pick the smallest element
        Arrays.sort(arr);
        
        int n = arr.length;
        int i = 0; // To track the index of the current smallest element
        int prevCount = n; // Variable to store the number of elements left

        while (i < n) {
            // Only print the number of remaining elements when they change (after removing duplicates)
            if (prevCount != (n - i)) {
                System.out.println(n - i);
                prevCount = n - i; // Update the number of elements left
            }
            
            int min = arr[i];  // Get the smallest element

            // Move i to the next distinct element
            while (i < n && arr[i] == min) {
                i++;
            }

            // Subtract the minimum value from the remaining elements
            for (int j = i; j < n; j++) {
                arr[j] -= min;
            }
        }
    }

    // Q2
    public static void canBeSortedByReversing(int[] arr) {
        int n = arr.length;
        int start = -1, end = -1;
        
        // Step 1: Find the first position where the order breaks
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                start = i;
                break;
            }
        }

        // If no such point is found, array is already sorted
        if (start == -1) {
            System.out.println("yes");
            return;
        }

        // Step 2: Find the last position where the order breaks
        for (int i = start; i < n - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                end = i;
                break;
            }
        }
        // If the last breaking point is not found, the array ends in a reversed subarray
        if (end == -1) {
            end = n - 1;
        }

        // Step 3: Reverse the found subarray
        reverseSubarray(arr, start, end);

        // Step 4: Check if the entire array is sorted after reversal
        if (isSorted(arr)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

    // Helper function to reverse a subarray between indices start and end
    public static void reverseSubarray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Helper function to check if the array is sorted
    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    // Q3
    public static void findUnion(int[] arr1, int[] arr2) {
        int[] unionArray = new int[arr1.length + arr2.length];
        int index = 0;

        // Add all elements of arr1 to unionArray if not already present
        for (int i = 0; i < arr1.length; i++) {
            if (!isPresent(unionArray, index, arr1[i])) {
                unionArray[index++] = arr1[i];
            }
        }

        // Add all elements of arr2 to unionArray if not already present
        for (int i = 0; i < arr2.length; i++) {
            if (!isPresent(unionArray, index, arr2[i])) {
                unionArray[index++] = arr2[i];
            }
        }

        // Print the union result
        System.out.print("Union: { ");
        for (int i = 0; i < index; i++) {
            System.out.print(unionArray[i] + " ");
        }
        System.out.println("}");
    }

    // Function to find the intersection of two arrays
    public static void findIntersection(int[] arr1, int[] arr2) {
        int[] intersectionArray = new int[Math.min(arr1.length, arr2.length)];
        int index = 0;

        // Check each element of arr1 to see if it is present in arr2
        for (int i = 0; i < arr1.length; i++) {
            if (isPresent(arr2, arr2.length, arr1[i]) && !isPresent(intersectionArray, index, arr1[i])) {
                intersectionArray[index++] = arr1[i];
            }
        }

        // Print the intersection result
        System.out.print("Intersection: { ");
        for (int i = 0; i < index; i++) {
            System.out.print(intersectionArray[i] + " ");
        }
        System.out.println("}");
    }

    // Helper function to check if an element is already present in the array
    public static boolean isPresent(int[] arr, int size, int element) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == element) {
                return true;
            }
        }
        return false;
    }

    // Q4
    public class BubbleSort {
        public static void bubbleSort(int[] arr) {
            boolean swapped;
            for (int i = 0; i < arr.length - 1; i++) {
                swapped = false;
                for (int j = 0; j < arr.length - 1 - i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        // Swap adjacent elements if they are in the wrong order
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        swapped = true;
                    }
                }
                // If no elements were swapped, the array is already sorted
                if (!swapped) {
                    break;
                }
            }
        }
    }

    public class SelectionSort {
        public static void selectionSort(int[] arr) {
            for (int i = 0; i < arr.length - 1; i++) {
                int minIndex = i;
                // Find the index of the minimum element in the unsorted part
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] < arr[minIndex]) {
                        minIndex = j;
                    }
                }
                // Swap the found minimum element with the first element
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }
    
    public class InsertionSort {
        public static void insertionSort(int[] arr) {
            for (int i = 1; i < arr.length; i++) {
                int key = arr[i];
                int j = i - 1;
                // Move elements of arr[0..i-1], that are greater than key, to one position ahead
                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j--;
                }
                arr[j + 1] = key;
            }
        }
    }
    
    public class HeapSort {
        public static void heapSort(int[] arr) {
            int n = arr.length;
            
            // Build a max heap
            for (int i = n / 2 - 1; i >= 0; i--) {
                heapify(arr, n, i);
            }
    
            // Extract elements from the heap one by one
            for (int i = n - 1; i > 0; i--) {
                // Move current root (largest) to the end
                int temp = arr[0];
                arr[0] = arr[i];
                arr[i] = temp;
    
                // Call max heapify on the reduced heap
                heapify(arr, i, 0);
            }
        }
    
        // Heapify a subtree rooted at node i which is an index in arr[]. n is size of heap
        public static void heapify(int[] arr, int n, int i) {
            int largest = i; // Initialize largest as root
            int left = 2 * i + 1; // Left child
            int right = 2 * i + 2; // Right child
    
            // If left child is larger than root
            if (left < n && arr[left] > arr[largest]) {
                largest = left;
            }
    
            // If right child is larger than largest so far
            if (right < n && arr[right] > arr[largest]) {
                largest = right;
            }
    
            // If largest is not root
            if (largest != i) {
                int swap = arr[i];
                arr[i] = arr[largest];
                arr[largest] = swap;
    
                // Recursively heapify the affected subtree
                heapify(arr, n, largest);
            }
        }
    }
    

    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in);
        System.out.print("1. Array Reduction \n2. Sorted or Not \n3. Union and Intersection \n4. Sorting using different algorithms\nEnter your choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                int[] arr = {5, 1, 1, 1, 2, 3, 4};
                reduceArray(arr);
                break;

            case 2:
                System.out.print("Enter the size of the array: ");
                int n = sc.nextInt();
                System.out.println("Enter the elements: ");
                int[] arr1 = new int[n];
                for(int i = 0; i < n; i++){
                    arr1[i] = sc.nextInt();
                }
                canBeSortedByReversing(arr1);
                break;

            case 3: 
                int[] arr2 = {1, 5, 3, 4, 7};
                int[] arr3 = {2, 3, 4, 9};
    
                findUnion(arr2, arr3);
                findIntersection(arr2, arr3);
                break;
            case 4:
                int[] arr4 = {64, 25, 12, 22, 11};
                int[] arr5 = arr4.clone();
                int[] arr6 = arr4.clone();
                int[] arr7 = arr4.clone();
    
                System.out.println("Original Array: " + Arrays.toString(arr4));
            
                // Bubble Sort
                BubbleSort.bubbleSort(arr4);
                System.out.println("Bubble Sort: " + Arrays.toString(arr4));
            
                // Selection Sort
                SelectionSort.selectionSort(arr5);
                System.out.println("Selection Sort: " + Arrays.toString(arr5));
    
                // Insertion Sort
                InsertionSort.insertionSort(arr6);
                System.out.println("Insertion Sort: " + Arrays.toString(arr6));
    
                // Heap Sort
                HeapSort.heapSort(arr7);
                System.out.println("Heap Sort: " + Arrays.toString(arr7));
                break;
                
            default:
                System.out.println("Bruhhh... what more are u expecting huh?? ");
                break;
        }
        sc.close();
    }
}