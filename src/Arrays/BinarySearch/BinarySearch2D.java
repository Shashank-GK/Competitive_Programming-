package Arrays.BinarySearch;

import java.util.Scanner;

public class BinarySearch2D {

    static boolean searchTarget(int[][] arr, int row, int col, int target) {
        int targetRow = 0;
        int targetCol = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] == target) {
                    System.out.println("Target found at row: " + i + 1 + ", col: " + j + 1);
                    return true;
                }
            }
        }
        System.out.println("Target not found");
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int row = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int col = sc.nextInt();
        System.out.println("Enter the array elements: where row: " + row + " and col: " + col);
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the element to find: ");
        int target = sc.nextInt();
        if (!searchTarget(arr, row, col, target)) {
            System.out.println("The element does not exist in the array.");
        }
    }
}
