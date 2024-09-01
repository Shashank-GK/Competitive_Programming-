package Hackerrank;

// https://leetcode.com/problems/richest-customer-wealth/description/
public class RichestCustomerWealth {
    public static int maximumWealth(int[][] accounts) {
        int maxVal = 0;
        for (int person = 0; person < accounts.length; person++) {
            int accountSum = 0;  // Reset accountSum for each customer
            for (int account = 0; account < accounts[person].length; account++) {
                accountSum += accounts[person][account];
            }
            if (maxVal < accountSum) {
                maxVal = accountSum;
            }
        }
        return maxVal;  // Return the maximum wealth found
    }

    public static void main(String[] args) {
        int[][] accounts = {
                {1, 2, 3},
                {3, 2, 1}
        };
        System.out.println(maximumWealth(accounts));  // Output: 6
    }
}
