package DSA.Arrays.Sorting.InsertionSorting;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSorting {

    public static void insertionSorting(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swapElement(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    public static void swapElement(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array before sorting: " + Arrays.toString(arr));
        insertionSorting(arr);
        System.out.println("Array after sorting: " + Arrays.toString(arr));
    }
}
