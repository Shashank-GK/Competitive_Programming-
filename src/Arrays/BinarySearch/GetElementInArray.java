package Arrays.BinarySearch;

import java.util.Scanner;

// Considering the sorted array in ascending order
public class GetElementInArray {

    public static int getTargetElement(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if the target is present at mid
            if (arr[mid] == target) {
                return mid;
            }

            // If target is greater, ignore the left half
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                // If target is smaller, ignore the right half
                right = mid - 1;
            }
        }

        // Target is not present in the array
        return -1;
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
        int target = sc.nextInt();
        int indexOfTarget = getTargetElement(arr, target);

        if (indexOfTarget != -1) {
            System.out.println("The index of the target element is: " + indexOfTarget);
            System.out.println("The target element " + arr[indexOfTarget] + " is at position " + (indexOfTarget + 1));
        } else {
            System.out.println("The target element is not present in the array.");
        }

        sc.close();
    }
}
