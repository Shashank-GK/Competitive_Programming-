package LeetCode;

import java.util.Scanner;

public class SumOfEvenNumInArray {

    public static int sumOfEvenNUmb(int[] arr) {
        int sum = 0;
        if (arr.length == 0) {
            System.out.println("Array is empty");
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum = sum + arr[i];
            }
        }
        return sum;
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
        int sum = sumOfEvenNUmb(arr);
        System.out.println("Sum of even numbers in the array is: " + sum);
    }
}
