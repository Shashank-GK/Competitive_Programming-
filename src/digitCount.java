import java.util.Scanner;

public class digitCount {

    public static int countOfDigits(int num, long digit) {
        int rem = 0;
        int count = 0;
        while ( num != 0 ) {
            rem = num % 10;
            if ( rem == digit ) {
                count++;
            }
            num = num / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        System.out.println("Enter the digit to count its occurrence from above number");
        long digit = sc.nextInt();
        System.out.println("The count of digit " + digit + " in the number " + num + " is " + countOfDigits(num, digit));
    }
}
