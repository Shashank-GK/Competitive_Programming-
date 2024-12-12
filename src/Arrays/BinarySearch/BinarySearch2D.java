package Arrays.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns: ");
        int i = sc.nextInt();
        int j = sc.nextInt();
        int[][] matrix = new int[i][j];
        System.out.println("Enter the elements of the matrix in sorted way: ");
        for (int k = 0; k < i; k++) {
            for (int l = 0; l < j; l++) {
                matrix[k][l] = sc.nextInt();
            }
        }
        System.out.println("Enter the target element: ");
        int targetElement = sc.nextInt();

        System.out.println(Arrays.toString(searchElement(matrix, targetElement)));
    }

    public static int[] searchElement(int[][] matrix, int target) {
        int row = 0;
        int column = matrix.length - 1;

        while (row < matrix.length && column >= 0) {
            if (matrix[row][column] == target) {
                return new int[]{row, column};
            }
            if (matrix[row][column] > target) {
                column--;
            } else {
                row++;
            }
        }
        return new int[]{-1, -1};
    }
}