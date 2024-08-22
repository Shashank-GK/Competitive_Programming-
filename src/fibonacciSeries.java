package com;

import java.util.Scanner;

public class fibonacciSeries {
    public static void fibonacci_forLoop(int a, int b, int n) {
        for (int i = 0; i <= n; i++) {
            System.out.println(a);
            int fab = a + b;
            a = b;
            b = fab;
        }
    }

    public static void fibonacci_whileLoop(int a, int b, int n) {
        int count = 2;
        while (count <= n) {
            System.out.println("\n" + a);
            int fab = a + b;
            a = b;
            b = fab;
            count++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms you want in the series: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        fibonacci_forLoop(a, b, n);
        fibonacci_whileLoop(a, b, n);
    }
}
