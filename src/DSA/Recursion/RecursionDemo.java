package DSA.Recursion;

import java.util.Scanner;

public class RecursionDemo {

    public static void print(int num) {
        if (num > 10) {
            return;  // Base condition to stop recursion
        }
        System.out.println(num);
        print(num + 1);  // Recursive call with incremented value
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        print(num);
    }
}
