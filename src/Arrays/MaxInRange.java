package Arrays;

import java.util.Scanner;

public class MaxInRange {

    public static int maxElementInRange(int[] arr, int start, int end) {
        int maxValue = arr[start];
        for (int i = start; i < end; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Starting range: ");
        int start = sc.nextInt();
        System.out.println("Enter the end range: ");
        int end = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println("\nMaximum element in the given range is: " + maxElementInRange(arr, start, end));
    }
}
