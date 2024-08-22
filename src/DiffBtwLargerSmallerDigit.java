import java.util.Scanner;

public class DiffBtwLargerSmallerDigit {

    public static void diffOfLargerSmallerDigit(int num) {
        int large = 0;
        int smaller = 0;
        while ( num != 0 ) {
            int rem = num % 10;
            if ( rem > large ) {
                large = rem;
            }
            if ( rem < large ) {
                smaller = rem;
            }
            num = num / 10;
        }
        System.out.println("The larger digit is " + large + " and smaller digit is " + smaller);
        System.out.println("The difference between the larger and smaller digit is " + (large - smaller));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        diffOfLargerSmallerDigit(num);
    }
}