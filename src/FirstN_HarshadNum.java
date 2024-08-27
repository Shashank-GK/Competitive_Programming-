import java.util.Scanner;

public class FirstN_HarshadNum {
    public static int sumOfDigits(int num /* i,e.  int i  */) {
        int sum = 0;
        do {
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        } while (num != 0);
        return sum;
    }

    public static void getHarshad(int n) {
        for (int i = 1; i <= n; i++) {
            int sum = sumOfDigits(i);
            if (i % sum == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n to print first n Harsh numbers: ");
        int n = sc.nextInt();
        getHarshad(n);
    }
}
