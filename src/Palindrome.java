import java.util.Scanner;

public class Palindrome {

    public static boolean checkPalindrome(int num) {
        int pal = num;
        int rev = 0;
        do {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        } while (num != 0);
        return rev == pal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check it is palindrome number: ");
        int num = sc.nextInt();
        if (checkPalindrome(num)) {
            System.out.println(num + " is a palindrome number.");
        } else {
            System.out.println(num + " is not a palindrome number.");
        }
    }
}
