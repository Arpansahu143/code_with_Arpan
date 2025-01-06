

import java.util.*;

public class Assign_3 {
    public static int BubbleSort(int[] arr, int n) {
        int comparisons = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                comparisons++;
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return comparisons;

    }

    public static void printArray1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int bubblesort_Recursive(int[] arr, int n, int comparisons) {
        if (n == 1) {
            return comparisons;
        }
        for (int i = 0; i < n - 1; i++) {
            comparisons++;
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i + 1];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        return bubblesort_Recursive(arr, n - 1, comparisons);
    }

    public static void printArray2(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");

        }
        System.out.println();
    }

    public static int selectionSort(int[] arr, int n, int comparisons) {
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                comparisons++;
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return comparisons;

    }

    public static void printArray3(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");

        }
        System.out.println();
    }

    public static int selectionSortRecursive(int[] arr, int n, int comparisons) {
        if (n == 1) {
            return comparisons;
        }
        int minIndex = 0;
        for (int i = 1; i < n; i++) {
            comparisons++;
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        int temp = arr[0];
        arr[0] = arr[minIndex];
        arr[minIndex] = temp;
        return selectionSort(arr, n - 1, comparisons);
    }

    public static void PrintArray4(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static int insertionSort(int[] arr, int n, int comparisons) {
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                comparisons++;
                arr[j + 1] = arr[j];
                j--;
            }
            comparisons++;
            arr[j + 1] = key;
        }
        return comparisons;
    }

    public static void printArray5(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static int insertionSortRecursive(int[] arr, int n, int comparisons) {
        if (n == 1) {
            return comparisons;
        }
        comparisons = insertionSort(arr, n - 1, comparisons);
        int key = arr[n - 1];
        int j = n - 2;
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j--;
        }
        comparisons++;
        arr[j + 1] = key;
        return comparisons;
    }

    public static void PrintArray6(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");

        }
        System.out.println();
    }

    public static void bubbleSort_Ques(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] == 4 && arr[j + 1] == 2) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                } else if (arr[j] == 4 && arr[j + 1] == 3) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                } else if (arr[j] == 3 && arr[j + 1] == 2) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printArray7(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");

        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Bubble Sort");
        System.out.println("2. Bubble Sort Recursive");
        System.out.println("3. Selection Sort");
        System.out.println("4. Selection Sort Recursive");
        System.out.println("5. Insertion Sort");
        System.out.println("6. Insertion Sort Recursive");
        System.out.println("7. Sort 2,3,4");
        System.out.println("Enter your choice :");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
                int n1 = arr.length;
                System.out.println("Sorted array");
                printArray1(arr);
                System.out.println("No. of comparisons : " + BubbleSort(arr, n1));

                // Rate of growth
                int[] sizes = { 10, 50, 100, 200 };
                for (int size = 0; size < sizes.length; size++) {
                    int[] arr1 = new int[size];
                    for (int i = 0; i < size; i++) {
                        arr[i] = (int) (Math.random() * 100);
                    }
                    System.out.println("Size : " + size + "no. of comparisons " + BubbleSort(arr1, size));
                }
                break;

            case 2:
                int[] arr2 = { 10, 20, 30 };
                int n2 = arr2.length;
                System.out.println("Sorted Array :");
                printArray2(arr2);
                System.out.println("No. of comaprisons " + bubblesort_Recursive(arr2, n2, 0));

                // Rate of growth
                int[] sizes2 = { 10, 50, 500, 1000 };
                for (int size = 0; size < sizes2.length; size++) {
                    int[] arr2_ = new int[size];
                    for (int i = 0; i < size; i++) {
                        arr2_[i] = (int) (Math.random() * 100);
                    }
                    System.out.println("Size : " + size + "no. of comparisons " + bubblesort_Recursive(arr2_, size, 0));
                }
                break;

            case 3:
                int[] arr3 = { 10, 20, 30, 40 };
                int n3 = arr3.length;
                System.out.println("Sorted Array :");
                printArray3(arr3);
                System.out.println("No. of comparisons " + selectionSort(arr3, n3, 0));

                // Rate of growth
                int[] sizes_3 = { 10, 50, 100, 200 };
                for (int size = 0; size < sizes_3.length; size++) {
                    int[] arr3_1 = new int[size];
                    for (int i = 0; i < size; i++) {
                        arr3_1[i] = (int) (Math.random() * 100);
                    }
                    System.out.println("Size : " + size + "no. of comparisons " + selectionSort(arr3_1, size, 0));
                }
                break;

            case 4:
                int[] arr4 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
                int n4 = arr4.length;
                System.out.println("Sorted Array :");
                PrintArray4(arr4);
                System.out.println("No. of comparisons " + selectionSort(arr4, n4, 0));

                // Rate of growth
                int[] sizes_4 = { 10, 50, 100, 200 };
                for (int size = 0; size < sizes_4.length; size++) {
                    int[] arr4_1 = new int[size];
                    for (int i = 0; i < size; i++) {
                        arr4_1[i] = (int) (Math.random() * 100);
                    }
                    System.out.println("Size : " + size + "no. of comparisons " + selectionSort(arr4_1, size, 0));
                }
                break;

            case 5:
                int[] arr5 = { 14, 34, 25, 12, 22, 11, 90 };
                int n5 = arr5.length;
                System.out.println("Sorted Array :");
                printArray5(arr5);
                System.out.println("No. of comaprisons " + insertionSort(arr5, n5, 0));

                // Rate of growth
                int[] sizes_5 = { 10, 50, 100, 200 };
                for (int size = 0; size < sizes_5.length; size++) {
                    int[] arr5_1 = new int[size];
                    for (int i = 0; i < size; i++) {
                        arr5_1[i] = (int) (Math.random() * 100);
                    }
                    System.out.println("Size : " + size + "no. of comparisons " + selectionSort(arr5_1, size, 0));
                }
                break;

            case 6:
                int[] arr6 = { 85, 21, 98, 13, 67, 41, 25, 90, 59, 32 };
                int n6 = arr6.length;
                System.out.println("Sorted Array :");
                PrintArray6(arr6);
                System.out.println("No. of comaprisons " + insertionSort(arr6, n6, 0));

                // Rate of growth
                int[] sizes_6 = { 10, 50, 100, 200 };
                for (int size = 0; size < sizes_6.length; size++) {
                    int[] arr6_1 = new int[size];
                    for (int i = 0; i < size; i++) {
                        arr6_1[i] = (int) (Math.random() * 100);
                    }
                    System.out.println("Size : " + size + "no. of comparisons " + selectionSort(arr6_1, size, 0));
                }
                break;

            case 7:
                int[] arr7 = {4,2,3,2,4,3,2,4,3,2 };
                int n7 = arr7.length;
                System.out.println("Sorted Array :");
                printArray7(arr7);
                System.out.println("No. of comaprisons " + insertionSort(arr7, n7, 0));

                // Rate of growth
                int[] sizes_7 = { 10, 50, 100, 200 };
                for (int size = 0; size < sizes_7.length; size++) {
                    int[] arr7_1 = new int[size];
                    for (int i = 0; i < size; i++) {
                        arr7_1[i] = (int) (Math.random() * 100);
                    }
                    System.out.println("Size : " + size + "no. of comparisons " + selectionSort(arr7_1, size, 0));
                }
                break;

            default :
                System.out.println("Invalid Choice");
        }
    }
}
