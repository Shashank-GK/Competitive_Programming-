package Arrays.BinarySearch;

import java.util.Scanner;

public class SearchPositionOfElement {

    public static int searchIndexOfElement(int[] arr, int targetElement) {
        int start = 0;
        int end = arr.length - 1;

        // Determine the order of the array
        boolean isAscending = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + ((end - start) / 2); // Prevent overflow

            if (arr[mid] == targetElement) {
                return mid; // Target found
            }

            if (isAscending) { // For ascending order
                if (targetElement < arr[mid]) {
                    end = mid - 1; // Move left
                } else {
                    start = mid + 1; // Move right
                }
            } else { // For descending order
                if (targetElement < arr[mid]) {
                    start = mid + 1; // Move right
                } else {
                    end = mid - 1; // Move left
                }
            }
        }

        return -1; // Target not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array (ascending or descending order): ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element to be searched: ");
        int targetElement = sc.nextInt();

        int result = searchIndexOfElement(arr, targetElement);
        if (result != -1) {
            System.out.println("The Element " + targetElement + " is at position " + result + " in the array.");
        } else {
            System.out.println("The Element " + targetElement + " is not present in the array.");
        }
    }
}
