import java.util.Scanner;

public class ArmstrongNumber {

    public static int countDigits(int num) {
        int count = 0;
        do {
            num = num / 10;
            count++;
        } while (num != 0);
        return count;
    }

    public static int power(int num, int count) {
        int power = 1;
        for (int i = 1; i <= count; i++) {
            power = power * num;
        }
        return power;
    }

    public static boolean checkAmstrongNum(int num) {
        int sum = 0;
        int count = countDigits(num);
        for (int i = 1; i <= count; i++) {
            int digit = num % 10;
            sum = sum + power(digit, count);
            num = num / 10;
        }
        return sum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check if it is an Armstrong number: ");
        int num = sc.nextInt();
        if (checkAmstrongNum(num)) {
            System.out.println(num + " is a armstrong number. ");
        } else {
            System.out.println(num + " is not a armstrong number. ");
        }
    }
}
