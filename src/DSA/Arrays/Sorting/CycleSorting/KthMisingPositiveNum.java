package DSA.Arrays.Sorting.CycleSorting;


//Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.
//Return the kth positive integer that is missing from this array.
//Example 1:
//Input: arr = [2,3,4,7,11], k = 5
//Output: 9
//Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.

public class KthMisingPositiveNum {

    public static void main(String[] args) {
        KthMisingPositiveNum sol = new KthMisingPositiveNum();
        int[] arr = {2, 3, 4, 7, 11};
        int k = 5;
        System.out.println(sol.findKthPositive(arr, k));  // Output: 9
    }

    public int findKthPositive(int[] arr, int k) {
        int missingCount = 0;
        int current = 1;  // Start with the first positive integer
        int i = 0;  // Pointer for the array

        // Iterate until we find the kth missing positive integer
        while (missingCount < k) {
            // If the current number is in the array, skip it
            if (i < arr.length && arr[i] == current) {
                i++;
            } else {
                // If the current number is missing, count it
                missingCount++;
            }

            if (missingCount == k) {
                return current;
            }
            current++;
        }

        // Just a safeguard, it should not reach here
        return -1;
    }
}


