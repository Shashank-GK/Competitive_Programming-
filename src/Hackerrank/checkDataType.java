package Hackerrank;

import java.util.Scanner;

public class checkDataType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of test cases: ");
        int t = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < t; i++) {
            System.out.print("Enter data: ");
            String input = sc.nextLine();
            checkDataTypes(input);
        }
    }

    public static void checkDataTypes(String input) {
        try {
            long n = Long.parseLong(input);
            System.out.println(input + " can be fitted in:");
            if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) {
                System.out.println("* byte");
            }
            if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) {
                System.out.println("* short");
            }
            if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
                System.out.println("* int");
            }
            if (n >= Long.MIN_VALUE && n <= Long.MAX_VALUE) {
                System.out.println("* long");
            }
        } catch (NumberFormatException e1) {
            try {
                double d = Double.parseDouble(input);
                System.out.println(input + " can be fitted in:");
                System.out.println("* double");
                if (d >= Float.MIN_VALUE && d <= Float.MAX_VALUE) {
                    System.out.println("* float");
                }
            } catch (NumberFormatException e2) {
                if (input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false")) {
                    System.out.println(input + " can be fitted in:");
                    System.out.println("* boolean");
                } else if (input.length() == 1) {
                    System.out.println(input + " can be fitted in:");
                    System.out.println("* char");
                } else {
                    System.out.println(input + " can't be fitted anywhere.");
                }
            }
        }
    }
}
