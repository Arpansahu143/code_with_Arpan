

import java.util.*;
public class Assign_1 {
    public static int sum(int[] arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int findMax(int[] arr, int n) {
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            return max;
        }
        return 0;
    }

    public static int findmin(int[] arr, int n) {
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            return min;
        }
        return 0;
    }

    public static void rotateArray(int[] arr, int k) {
        k = k % arr.length;
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - k);
        reverse(arr, 0, arr.length - 1);
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static int findMissingNumber(int[] arr, int n) {
        int expected_sum = n * (n + 1) / 2;
        int actual_sum = 0;
        for (int i = 0; i < arr.length; i++) {
            actual_sum += arr[i];
        }
        return actual_sum;
    }

    public static void rearrangeMaxMin(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        int left = 0;
        int right = n - 1;
        int index = 0;
        while (left <= right) {
            if (index % 2 == 0) {
                result[index] = arr[right];
                right--;
            } else {
                result[index] = arr[left];
                left++;
                index++;
            }
            for (int i = 0; i < n; i++) {
                System.out.println(result[i] + " ");
            }
        }

    }

    public static int factorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static int maxSubarraySum(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int maxCurrent = arr[0];
        int maxGlobal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxCurrent = Math.max(arr[i], maxCurrent + arr[i]);
            maxGlobal = Math.max(maxCurrent, maxGlobal);
        }

        return maxGlobal;
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] merged = new int[n1 + n2];
        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
            while (i < n1) {
                merged[k++] = arr1[i++];
            }
            while (j < n2) {
                merged[k++] = arr2[j++];
            }

        }
        return merged;
    }

    public static void redistribute_elements(int[] merged, int[] arr1, int[] arr2) {
        int mid = merged.length / 2;
        for (int i = 0; i < mid; i++) {
            arr1[i] = merged[i];
        }
        for (int i = mid; i < merged.length; i++) {
            arr2[i - mid] = merged[i];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Sum");
        System.out.println("2. Max and Min");
        System.out.println("3. Rotate");
        System.out.println("4.Missing Number");
        System.out.println("5. Rearrange");
        System.out.println("6. Factorial");
        System.out.println("7. Contagious Sum");
        System.out.println("8. Merge Array");
        System.out.println("Enter your choice");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                int[] arr = { 1, 2, 3, 4, 5 };
                int num = arr.length;
                int sum = sum(arr, num);
                System.out.println("Sum of " + num + " nos " + sum);
                break;

            case 2:
                int[] arr1 = { 10, 20, 30, 40, 50 };
                int num1 = arr1.length;
                System.out.println("Maximum :" + findMax(arr1, num1));
                System.out.println("Minimum : " + findmin(arr1, num1));
                break;

            case 3:
                int[] arr2 = { 10, 20, 30, 40, 50 };
                System.out.println("Original Array :");
                for (int i = 0; i < arr2.length; i++) {
                    System.out.println(arr2[i] + " ");
                }
                System.out.println();
                rotateArray(arr2, 2);

                int[] arr3 = { 10, 20, 30, 40, 50 };
                rotateArray(arr3, 3);
                System.out.println("Array after roatation by 3 :");
                for (int i = 0; i < arr3.length; i++) {
                    System.out.println(arr3[i] + " ");

                }
                System.out.println();

            case 4:
                int[] arr4 = { 1, 2, 4, 5, 6 };
                int[] arr5 = { 2, 3, 4, 5, 7 };
                System.out.println("missing no. for arr1 : " + findMissingNumber(
                        arr4, n));
                System.out.println("missing no. for arr2 : " + findMissingNumber(
                        arr5, n));

            case 5:
                int[] arr6 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
                System.out.println("Original Array :");
                for (int num2 : arr6) {
                    System.out.println(num2 + " ");
                }
                System.out.println();
                System.out.println("Array after rearrangement : ");
                rearrangeMaxMin(arr6);

            case 6:
                System.out.println("Enter a number :");
                int n3 = sc.nextInt();
                System.out.printf("factorial of %d is %s", n3, factorial(n));

            case 7:
                int[] arr7 = { -2, -3, -4, -1, -2, 1, 5, -3 };
                for (int i = 0; i < arr7.length; i++) {
                    System.out.println(arr7[i] + " ");

                }
                int maxSum = maxSubarraySum(arr7);
                System.out.println();
                System.out.println("Maximun contagious subarray sum is : " + maxSum);

            case 8:
                int[] arr8 = { 1, 5, 9, 10, 15, 20 };
                int arr9[] = { 2, 3, 8, 13 };
                System.out.println("Before Sorting : Array - 1 :");
                for (int i = 0; i < arr8.length; i++) {
                    System.out.println(arr8[i] + " ");

                }
                System.out.println();
                System.out.println("Array-2 :");
                for (int i = 0; i < arr9.length; i++) {
                    System.out.println(arr9[i] + " ");
                }
                int[] merged = mergeArrays(arr8, arr9);
                int[] newArr1 = new int[(merged.length + 1) / 2];
                int[] newArr2 = new int[(merged.length) / 2];

                redistribute_elements(merged, newArr1, newArr2);
                System.out.println("after sorting :");
                for (int i = 0; i < newArr1.length; i++) {
                    System.out.println(newArr1[i] + " ");

                }
                for (int i = 0; i < newArr2.length; i++) {
                    System.out.println(newArr2[i] + " ");
                }

            default:
                System.out.println("None");
                break;
        }
    }

}
