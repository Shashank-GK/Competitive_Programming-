import java.util.Scanner;

public class FirstNEmirpNum {

    public static int reverseNumber(int num) {
        int reverseNum = 0;
        do {
            int digit = num % 10;
            reverseNum = reverseNum * 10 + digit;
            num = num / 10;
        } while (num != 0);
        return reverseNum;
    }

    public static boolean checkPrimeNUmber(int num) {
        if (num < 0) {
            return false;
        }
        if (num < 1) {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void printEmirpNUm(int n) {
        for (int i = 0; i <= 100; i++) {
            if (checkPrimeNUmber(i) && checkPrimeNUmber(reverseNumber(i)) && i != reverseNumber(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n to find the first n emirp numbers: ");
        int n = sc.nextInt();
        printEmirpNUm(n);
    }
}
