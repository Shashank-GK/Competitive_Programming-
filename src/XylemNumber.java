import java.util.Scanner;

public class XylemNumber {

    public static void checkXyltmNumber(int num) {
        int count = 0;
        int smallerNum = 0;
        int largerNum = 0;
        int sum = 0;
        do {
            int digit = num % 10;
            count++;
            if (digit <= smallerNum) {
                smallerNum = digit;
            } else if (digit >= largerNum) {
                digit = largerNum;
            }
            sum = sum + digit;
            num = num / 10;
        } while (num != 0);

        int sumOfFirstLast = smallerNum + largerNum;
        int sumOfMidDigit = sum - sumOfFirstLast;
        int meanOfMidDigit = sumOfMidDigit / (count - 2);
        if (sumOfFirstLast == meanOfMidDigit) {
            System.out.println("It is a Xylem number");
        } else {
            System.out.println("It is not a Xylem number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check it is a Xylem number or not: ");
        int num = sc.nextInt();
        checkXyltmNumber(num);
    }
}
