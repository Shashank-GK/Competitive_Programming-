package DSA.Arrays;

import java.util.Scanner;

public class SwapInRange {

    public static void swapElements(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the starting range of the array to swap: ");
        int start = sc.nextInt();
        System.out.println("Enter the ending range of the array to swap: ");
        int end = sc.nextInt();

        // Validate the range
        if (start < 0 || end >= n || start > end) {
            System.out.println("Invalid range. Please enter a valid range.");
        } else {
            for (int i = start; i < end; i++) {
                swapElements(arr, i, end);
                end--;
            }
            System.out.println("Array after swapping elements in the specified range:");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
