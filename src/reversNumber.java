import java.util.Scanner;

public class reversNumber {

    public static int reverseNumber(int num) {
        int sum = 0;
        int rem = 0;
        while (num != 0) {
            rem = num % 10;
            sum = sum * 10 + rem;
            num = num / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to reverse it: ");
        long num = sc.nextInt();
        System.out.println("The reverse of the number " + num + " is " + reverseNumber((int) num));
    }
}

