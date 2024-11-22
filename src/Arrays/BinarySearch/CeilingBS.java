package Arrays.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class CeilingBS {
    // Function to find the ceiling of the target
    public static int ceiling(int[] arr, int target) {
        // Ensure the array is sorted
        Arrays.sort(arr);

        int start = 0;
        int end = arr.length - 1;

        // Edge case: if target is greater than the largest element
        if (target > arr[end]) {
            return -1;
        }

        // Binary search to find the ceiling
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return arr[mid]; // If target matches, it's the ceiling
            } else if (target < arr[mid]) {
                end = mid - 1; // Search the left half
            } else {
                start = mid + 1; // Search the right half
            }
        }

        // After the loop, start points to the ceiling
        return arr[start];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input target
        System.out.println("Enter the element to find the ceiling of: ");
        int target = sc.nextInt();

        // Find ceiling
        int result = ceiling(arr, target);

        // Print result
        if (result != -1) {
            System.out.println("The ceiling of " + target + " is " + result);
        } else {
            System.out.println("The ceiling of " + target + " is not present in the array.");
        }

        sc.close();
    }
}
