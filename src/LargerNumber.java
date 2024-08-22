import java.util.Scanner;

public class LargerNumber {
    public static void largerOf3(int a, int b, int c) {
        int max = a; // Assume `a` is the largest initially
        if (b > max) {
            max = b; // Update `max` if `b` is greater than `max`
        }
        if (c > max) {
            max = c; // Update `max` if `c` is greater than `max`
        }
        System.out.println("The largest number is: " + max);
    }

    public static void secondLargest(int a, int b, int c) {
        int secondLargest = a;

        // Check if `b` is the second largest
        if ((b >= a && b <= c) || (b <= a && b >= c)) {
            secondLargest = b;
        }
        // Check if `c` is the second largest
        if ((c >= a && c <= b) || (c <= a && c >= b)) {
            secondLargest = c;
        }
        System.out.println("The second largest number is: " + secondLargest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        largerOf3(a, b, c);
        secondLargest(a, b, c);
    }
}
