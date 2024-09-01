package Arrays.LinearSearching;

import java.util.Scanner;

public class CountOfEvenInElement {

    public static int countDigitsInElements(int num) {
        int count = 0;
        do {
            count++;
            num = num / 10;
        } while (num != 0);

        return count;
    }

    public static void countEvenInElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int countOfDigitsInElement = countDigitsInElements(num);
            if (countOfDigitsInElement % 2 == 0) {
                System.out.println(arr[i] + " contains  " + countOfDigitsInElement + " (Even number of digits) ");
            } else {
                System.out.println(arr[i] + " contains  " + countOfDigitsInElement + " (Odd number of digits) ");
            }
        }
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
        countEvenInElements(arr);
    }
}
