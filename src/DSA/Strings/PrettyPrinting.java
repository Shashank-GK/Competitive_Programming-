package DSA.Strings;

import java.util.Scanner;

public class PrettyPrinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Example: Floating-point formatting
        System.out.println("Enter a float number to get 2 digits after the decimal: ");
        float num = sc.nextFloat();
        System.out.printf("The number with 2 digits after the decimal: %.2f%n", num);

        // Example: Printing value of PI
        System.out.printf("Value of PI to 3 decimal places: %.3f%n", Math.PI);

        // Example: String formatting
        String name = "Shashank";
        String description = "cool";
        System.out.printf("Hello, my name is %s and I am %s.%n", name, description);

        sc.close();
    }
}
