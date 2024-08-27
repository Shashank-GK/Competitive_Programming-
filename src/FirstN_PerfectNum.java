import java.util.Scanner;

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
