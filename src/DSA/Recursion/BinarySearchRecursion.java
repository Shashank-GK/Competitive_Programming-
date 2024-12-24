package DSA.Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchRecursion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("The Sorted Array is: " + Arrays.toString(arr));
        System.out.println("Enter the Element to be searched: ");
        int target = sc.nextInt();
        System.out.println("The Element is at: " + searchElement(arr, target, 0, arr.length - 1));
    }

    public static int searchElement(int[] arr, int target, int start, int end) {
        int mid = start + (end - start) / 2;
        if (start > end) {
            return -1;
        }
        if (arr[mid] == target) {
            return mid;
        } else if (target < arr[mid]) {
            return searchElement(arr, target, start, mid - 1);
        } else {
            return searchElement(arr, target, mid + 1, end);
        }
    }
}
