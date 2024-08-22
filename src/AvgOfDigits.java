import java.util.Scanner;

public class AvgOfDigits {

    public static int avgOdDigits(int num) {
        int avg = 0;
        int sum = 0;
        int count = 0;
        while ( num != 0 ) {
            count++;
            int rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        avg = sum / count;
        return avg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int avg = avgOdDigits(num);
        System.out.println("Average of digits of the number is: " + avg);
    }
}
