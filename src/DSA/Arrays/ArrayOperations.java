package DSA.Arrays;

import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i <= arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i <= arr.length; i++) {
            System.out.println("Array elements are: " + arr[i]);
        }
    }
}
