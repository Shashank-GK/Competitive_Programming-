package DSA.Arrays.Sorting.BubbleSorting;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSorting {

    public static int[] bubbleSorting(int[] arr) {
        int n = arr.length;
        // run the steps n-1 times
        for (int i = 0; i < n; i++) {
            // for each step, max item will come at the last respective index
            for (int j = 0; j < n - 1; j++) {
                // swap if the item is greater than the next item
                int temp = 0;
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
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
        System.out.println("Array after sorting: " + Arrays.toString(bubbleSorting(arr)));
    }


}
