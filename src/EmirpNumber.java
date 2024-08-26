import java.util.Scanner;

public class EmirpNumber {

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

    public static void checkEmirpNumber(int num) {
        int reverse = reverseNumber(num);
        if (checkPrimeNUmber(num) && checkPrimeNUmber(reverse) && num != reverse) {
            System.out.println(num + " is an emirp number");
        } else {
            System.out.println(num + " is not an emirp number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is an emirp number or not: ");
        int num = sc.nextInt();
        checkEmirpNumber(num);
        System.out.println("Reverse of " + num + " is " + reverseNumber(num));


    }
}
