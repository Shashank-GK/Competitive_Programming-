package Arrays.BinarySearch;

import java.util.Scanner;

//Considering the sorted array in ascending order
public class GetElementInArray {

    public static int getTargetElement(int[] arr, int target) {
        int mid = arr.length / 2;
        int indexOfTarget = 0;
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            for (int i = mid + 1; i < arr.length; i++) {
                if (arr[i] == target) {
                    indexOfTarget = i;
                }
            }
        } else {
            for (int i = mid - 1; i > 0; i--) {
                if (arr[i] == target) {
                    indexOfTarget = i;
                }
            }
        }
        return indexOfTarget;
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
        System.out.println("The index of the target element is: " + indexOfTarget);
        System.out.println("The target element " + arr[indexOfTarget] + " is at position " + (indexOfTarget + 1));
        sc.close();
    }
}
