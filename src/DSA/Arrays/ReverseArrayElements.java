package DSA.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayElements {

    public static void swapElements(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void reverseElements(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            swapElements(arr, start, end);
            start++;
            end--;
        }
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
        System.out.println("Array after reversing the elements:");
        reverseElements(arr);
        System.out.println(Arrays.toString(arr));
    }
}
