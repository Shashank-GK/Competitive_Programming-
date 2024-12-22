package DSA.Strings;

import java.util.Scanner;

public class PrettyPrinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the float number to get 2 digits after the decimal: ");
        float num = sc.nextFloat();
        System.out.printf("The 2 digits after the decimal: %.2f", num);
    }
}
