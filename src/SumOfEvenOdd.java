import java.util.Scanner;

public class SumOfEvenOdd {

    public static void sumOfEvenOddDigit(int num) {
        int eSum = 0;
        int oSum = 0;
        while ( num != 0 ) {
            int rem = num % 10;
            if ( rem % 2 == 0 ) {
                eSum = eSum + rem;
            } else {
                oSum = oSum + rem;
            }
            num = num / 10;
        }
        System.out.println("Sum of Even digits is " + eSum + " and Sum of Odd digits is " + oSum);
        System.out.println("The different between the sum of even and odd digits is " + (eSum - oSum));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        sumOfEvenOddDigit(num);
    }
}
