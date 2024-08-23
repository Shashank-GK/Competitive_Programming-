import java.util.Scanner;

public class DisariumNumber {

    public static int countDigits(int num) {
        int count = 0;
        do {
            count++;
            int digit = num % 10;
            num = num / 10;
        } while (num != 0);
        return count;
    }

    public static void checkDisariumNumber(int num, int count) {
        int sum = 0;
        int temp = num;
        while (num != 0) {
            int digit = num % 10;
            int power = 1;
            for (int i = 0; i < count; i++) {
                power = power * digit;
            }
            sum = sum + power;
            count--;
            num = num / 10;
        }
        if (sum == temp) {
            System.out.println(temp + "Disarium Number");
        } else {
            System.out.println(temp + "Not a Disarium Number");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a Disarium number or not");
        int num = sc.nextInt();
        int count = countDigits(num);
        checkDisariumNumber(num, count);
    }
}
