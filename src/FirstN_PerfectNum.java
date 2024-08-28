import java.util.Scanner;

/*
Certainly! Let’s talk about perfect numbers. A perfect number is a positive integer that equals the
sum of its proper divisors (excluding the number itself).
For example, the smallest perfect number is 6, which can be expressed as:
                                              => 6=1+2+3
Here, the divisors of 6 are 1, 2, and 3, and their sum indeed equals 6.
 */
public class FirstN_PerfectNum {
    public static int getSumOfPerfectNUm(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public static void firstN_PerfectNum(int n) {
        for (int i = 1; i <= n; i++) {
            int sum = getSumOfPerfectNUm(i);
            if (i == sum)
                System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of series of perfect number you want to print: ");
        int n = sc.nextInt();
        firstN_PerfectNum(n);
    }
}
