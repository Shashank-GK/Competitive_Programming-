import java.util.Scanner;

public class FirstN_PalindromeNum {
    public static int reverseNUm(int num) {
        int pal = num;
        int rev = 0;
        do {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        } while (num != 0);
        return rev;
    }

    public static void palindromeSeries(int n) {
        for (int i = 1; i <= n; i++) {
            if (i == reverseNUm(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number series of palindrome numbers: ");
        int n = sc.nextInt();
        palindromeSeries(n);
    }
}
