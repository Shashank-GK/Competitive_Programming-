import java.util.Scanner;

public class factOfEachDigit {

    public static int countOfDigits(int num) {
        int rem = 0;
        int count = 0;
        while (num != 0) {
            count++;
            num = num / 10;
        }
        return count;
    }

    public static void factorsOfEachDigit(int num) {
        int rem = 0;
        int j = 0;
        while (num != 0) {
            rem = num % 10;
            System.out.println("The Factorial of each digit of the number " + rem + " are: ");
            for (j = 1; j <= rem; j++) {
                if (rem % j == 0) {
                    System.out.println(j);
                }
            }
            num /= 10;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find the factorial and also factorial of each digit: ");
        int num = sc.nextInt();
        int count = countOfDigits(num);
        System.out.println("\nThe total digits count of the number " + num + " is " + count);
        factorsOfEachDigit(num);
    }
}