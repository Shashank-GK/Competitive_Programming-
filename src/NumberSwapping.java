import java.util.Scanner;

public class NumberSwapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd number: ");
        int b = sc.nextInt();
        //a=10, b=20
        b = b + a; //20+10=30=b
        a = b - a; //30-10=20=a
        b = b - a; //30-20=10=a

        System.out.println("After Swapping: 1st number is " + a + " and 2nd number is " + b);
    }
}