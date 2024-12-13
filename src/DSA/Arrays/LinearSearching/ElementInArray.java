package DSA.Arrays.LinearSearching;

import java.util.Scanner;

public class ElementInArray {

    public static void findElements(int[] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                System.out.println("Element found at index: " + i + " that is " + (i + 1) + "th position");
                return;
            }
        }
        System.out.println("Element not found in the array.");
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
        System.out.println("Enter the element to be searched: ");
        int element = sc.nextInt();
        System.out.println(arr);
        findElements(arr, element);
    }
}
