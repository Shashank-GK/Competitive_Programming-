import java.util.Scanner;

public class N_HappyNumbers {
    // Happy number with in n.
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

    public static void printN_HappyNumbers(int n) {
        for (int i = 1; 0 < n; i++) {
            if (checkHappyNUmber(i)) {
                System.out.println(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n to print first n happy numbers: ");
        int n = sc.nextInt();
        printN_HappyNumbers(n);
    }
}
