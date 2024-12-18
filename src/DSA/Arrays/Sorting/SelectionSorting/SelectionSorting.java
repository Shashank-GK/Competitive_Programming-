package DSA.Arrays.Sorting.SelectionSorting;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSorting {

    public static int[] selectionSorting(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int lastIndex = arr.length - 1 - i;
            int maxIndex = maxIndexOfArray(arr, 0, lastIndex);
            swapElement(arr, maxIndex, lastIndex);
        }
        return arr;
    }

    public static int maxIndexOfArray(int[] arr, int start, int last) {
        int max = start;
        for (int i = start; i <= last; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
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
        System.out.println("Array after sorting: " + Arrays.toString(selectionSorting(arr)));
    }
}
