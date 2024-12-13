package DSA.Arrays;

import java.util.Scanner;

public class MaxIn2D_Array {

    public static int getMaxIn2D(int[][] arr) {
        if (arr.length == 0) {
            System.out.println("Array is empty");
            return -1;
        }
        int maxVal = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > maxVal) {
                    maxVal = arr[i][j];
                }
            }
        }
        return maxVal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = sc.nextInt();

        int[][] arr = new int[rows][columns];

        System.out.println("Enter the elements of the 2D array:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int maxVal = getMaxIn2D(arr);
        System.out.println("Max value in the 2D array is: " + maxVal);
    }
}