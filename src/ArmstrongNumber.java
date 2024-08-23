import java.util.Scanner;

public class ArmstrongNumber {

    public static int checkAmstrongNum(int num) {
        int sum = 0;
        do {
            int rem = num % 10;
            int cube = rem * rem * rem;
            sum = sum + cube;
            num = num / 10;
        } while (num != 0);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check if it is an Armstrong number: ");
        int num = sc.nextInt();
        int armstrongNum = checkAmstrongNum(num);
        if (armstrongNum == num) {
            System.out.println(num + " is a armstrong number. ");
        } else {
            System.out.println(num + " is not a armstrong number. ");
        }
    }
}
