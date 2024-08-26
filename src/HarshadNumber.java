import java.util.Scanner;

public class HarshadNumber {

    public static int sumOfDigits(int num) {
        int sum = 0;
        do {
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        } while (num != 0);
        return sum;
    }

    public static boolean isHarshad(int num) {
        int sum = sumOfDigits(num);
        return num % sum == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a Harshad number: ");
        int num = sc.nextInt();
        if (isHarshad(num)) {
            System.out.println(num + " is a Harshad number.");
        } else {
            System.out.println(num + " is not a Harshad number.");
        }
    }
}
