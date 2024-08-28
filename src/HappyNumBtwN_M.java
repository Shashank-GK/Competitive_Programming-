import java.util.Scanner;

public class HappyNumBtwN_M {  // Print Happy number between range n and m
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

    public static void printN_HappyNumbers(int n, int m) {
        for (int i = n; i <= m; i++) {
            if (checkHappyNUmber(i)) {
                System.out.println(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value range m and n to print happy numbers: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        printN_HappyNumbers(n, m);
    }
}
