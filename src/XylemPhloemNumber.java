import java.util.Scanner;

public class XylemPhloemNumber {

    public static boolean checkXylemPhloemNumber(int num) {
        int temp = num;
        int extremeNum = 0;
        int midNum = 0;
        do {
            int digit = num % 10;
            if (temp == digit || num < 9)
                extremeNum = extremeNum + digit;
            else
                midNum = midNum + digit;
            num = num / 10;
        } while (num != 0);
        return extremeNum == midNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check it is a Xylem number or not: ");
        int num = sc.nextInt();
        boolean result = checkXylemPhloemNumber(num);
        if (result)
            System.out.println(num + " is a xylem number ");
        else
            System.out.println(num + " is a phloem number");
    }
}
