package Arrays.BinarySearch;

import java.util.Scanner;

public class SearchPositionOfElement {

    public static int searchIndexOfElement(int[] arr, int targetElement) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + ((end - start) / 2); // mid=start+end/2; don't use this because it may cause overflow if start and end are large integers.
            if (targetElement < arr[mid]) {
                end = mid - 1;
            } else if (targetElement > arr[mid]) {
                start = mid + 1;
            } else if (targetElement == arr[mid]) {
                return mid;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in ascending order of the array: ");
        for (int i = 0; i <= n - 1; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched: ");
        int targetElement = sc.nextInt();
        System.out.println("The Element " + targetElement + " is at " + searchIndexOfElement(arr, targetElement) + " position in the array.");
    }
}
