package DSA.Recursion;

import java.util.Scanner;

public class Fibonacci {

    public static int fibonacciSeries(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacciSeries(n - 1) + fibonacciSeries(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Fibonacci series terms to be printed:");
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            System.out.println(fibonacciSeries(i) + " ");
        }
        System.out.println("***************************");
    }
}
