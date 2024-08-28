import java.util.Scanner;
// To print count of happy number from 1 to n

public class CountOfN_HappyNUm {
    public static boolean checkHappyNUmber(int num) { // (int i)
        while (num > 9) {
            int sum = 0;
            do {
                int digit = num % 10;
                sum = sum + digit * digit;
                num = num / 10;
            } while (num != 0);
            num = sum;
        }
        return num == 1 || num == 7;
    }

    public static int countHappyNumbers(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (checkHappyNUmber(i)) {
                // System.out.println(i + " ");
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n to print count of first n happy numbers: ");
        int n = sc.nextInt();
        int count = countHappyNumbers(n);
        System.out.println("Count of first " + n + " happy numbers is: " + count);
    }
}
