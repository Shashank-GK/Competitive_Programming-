package DSA.Arrays.Sorting.CycleSorting;

import java.util.Arrays;
import java.util.Scanner;

public class CyclicSoring {

    public static void cyclicSorting(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swapElement(arr, i, correct);
            } else {
                i++;
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
        cyclicSorting(arr);
        System.out.println("Array after sorting: " + Arrays.toString(arr));
    }
}
