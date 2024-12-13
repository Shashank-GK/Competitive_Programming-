package DSA.Arrays.LinearSearching;

import java.util.Objects;
import java.util.Scanner;

public class SearchStringInArray {

    static void searchStringElements(String[] arr, String target) {
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (Objects.equals(arr[i], target)) {
                System.out.println("The string is found at index: " + i);
                found = true;
                break; // Exit the loop once the target is found
            }
        }
        if (!found) {
            System.out.println("The string is not found in the array.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int size = sc.nextInt();
        sc.nextLine(); // Consume the newline character left by nextInt()
        System.out.println("Enter the string elements of the array: ");
        String[] arr = new String[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLine();
        }
        System.out.println("Enter the string to search in the array: ");
        String target = sc.nextLine();
        searchStringElements(arr, target);
    }
}
