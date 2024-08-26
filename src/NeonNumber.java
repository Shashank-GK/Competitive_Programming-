import java.util.Scanner;

public class NeonNumber {

    public static int getSquare(int num) {
        return num * num;
    }

    public static boolean checkNeonNum(int num) {
        int squareNum = getSquare(num);
        int sum = 0;
        do {
            int digit = squareNum % 10;
            sum = sum + digit;
            squareNum = squareNum / 10;
        } while (squareNum != 0);
        return sum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check it is neon number or not");
        int num = sc.nextInt();
        if (checkNeonNum(num)) {
            System.out.println(num + " is a neon number");
        } else {
            System.out.println(num + " is not a neon number");
        }
    }
}
