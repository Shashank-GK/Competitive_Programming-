import java.util.Scanner;

public class primeNumber {
    public static boolean checkPrime(int a) {
        // Prime numbers are greater than 1
        if (a < 2) {
            return false;
        }
        // Check divisibility from 2 to a/2
        for (int i = 2; i <= a / 2; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find if it is a prime number or not: ");
        int a = sc.nextInt();
        if (checkPrime(a)) {
            System.out.println(a + " is a prime number");
        } else {
            System.out.println(a + " is not a prime number");
        }
        sc.close();
    }
}
