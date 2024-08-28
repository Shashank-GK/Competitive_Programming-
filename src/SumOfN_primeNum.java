import java.util.Scanner;

public class SumOfN_primeNum {
    public static boolean checkPrime(int num) {
        // Prime numbers are greater than 1
        if (num < 2) {
            return false;
        }
        // Check divisibility from 2 to a/2
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int sumOfN_PrimeNum(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (checkPrime(i)) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range to find the sum of prime numbers: ");
        int n = sc.nextInt();
        int sumOfPrimeNum = sumOfN_PrimeNum(n);
        System.out.println("The sum of first " + n + " prime numbers is: " + sumOfPrimeNum);
    }
}
