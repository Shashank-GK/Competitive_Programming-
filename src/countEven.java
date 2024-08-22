import java.util.Scanner;

public class countEven {
    public static int count(int num) {
        int count = 0;
        do {
            count++;
            num = num / 10;
        } while (num != 0);
        return count;
    }

    public static int count_Even(int num) {
        int countEvenNum = 0;
        while (num != 0) {
            int digit = num % 10;
            if (digit % 2 == 0) {
                countEvenNum++;
            }
            num = num / 10;
        }
        return countEvenNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int count = count(num);
        System.out.println("The number of digits in the number is: " + count);
        System.out.println("The number of even digits in a given number is: " + count_Even(num));
    }
}
