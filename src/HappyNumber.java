import java.util.Scanner;

public class HappyNumber {

    public static boolean checkHappyNUmber(int num) {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a happy number or not: ");
        int num = sc.nextInt();
        boolean happyNUmber = checkHappyNUmber(num);
        if (happyNUmber) {
            System.out.println(num + " is a happy number");
        } else {
            System.out.println(num + " is not a happy number");
        }
    }
}
