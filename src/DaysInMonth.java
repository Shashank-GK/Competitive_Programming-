import java.util.Scanner;

public class DaysInMonth {

    public static int daysInMonth(String month) {
        switch (month) {
            case "january":
            case "march":
            case "may":
            case "july":
            case "august":
            case "october":
            case "december":
                return 31;
            case "april":
            case "june":
            case "september":
            case "november":
                return 30;
            case "february":
                return 28;
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month to find the number of days in it: ");
        String month = sc.next();
        int days = daysInMonth(month);
        System.out.println("The number of days in the month " + month + " is " + days);
    }

}
