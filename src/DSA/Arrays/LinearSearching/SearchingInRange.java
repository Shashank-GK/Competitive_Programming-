package DSA.Arrays.LinearSearching;

import java.util.Scanner;

public class SearchingInRange {

    static void searchInRange(int[] arr, int start, int end, int target) {

        if (arr.length == 0) {
            System.out.println("Array is empty");
            return;
        }
        for (int i = start; i <= end; i++) {
            if (arr[i] == target) {
                System.out.println("Element found at index: " + i);
                return;
            }
        }
        System.out.println("Element not found");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the 1st range of the array: ");
        int start = sc.nextInt();
        System.out.println("Enter the 2nd range of the array: ");
        int end = sc.nextInt();
        System.out.println("Enter the element to be searched: ");
        int target = sc.nextInt();
        searchInRange(arr, start, end, target);
    }
}
