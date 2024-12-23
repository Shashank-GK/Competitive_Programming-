package DSA.Strings.PatternPrinting;

import java.util.Scanner;

public class Pattern1 {
    /*
     -> If n = 5
     -> Pattern will be:
     *
     **
     ***
     ****
     *****
     *****
     ****
     ***
     **
     *
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows you want to print: ");
        int n = sc.nextInt();

        // Upper part of the pattern
        for (int row = 1; row <= n; row++) {
            // For every row, run a column
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower part of the pattern
        for (int row = n; row >= 1; row--) {
            // For every row, run a column
            for (int col = 1; col < row; col++) { // Fix: Condition adjusted for proper star count
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
