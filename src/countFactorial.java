import java.util.Scanner;

public class countFactorial {

    public static int factorialCount(int num) {
        int count = 0;
        int i;
        System.out.println("Factorial of number " + num + " are: ");
        for (i = 1; i < num; i++) {
            if (num % i == 0) {
                count++;
                System.out.println(i);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find the factorial: ");
        int num = sc.nextInt();
        int countOfFact = factorialCount(num);
        System.out.println("\nThe total digits count of factorial of the number " + num + " is " + countOfFact);
    }
}
