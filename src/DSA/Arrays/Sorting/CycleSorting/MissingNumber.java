package DSA.Arrays.Sorting.CycleSorting;

//Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
//
//Example 1:
//
//Input: nums = [3,0,1]
//Output: 2
//Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3].
// 2 is the missing number in the range since it does not appear in nums.

public class MissingNumber {

    public static void main(String[] args) {
        MissingNumber mn = new MissingNumber();
        int[] nums = {3, 0, 1};  // Example input
        System.out.println(mn.missingNumber(nums));  // Output: 2
    }

    public int missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i];
            if (correct < nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j) {
                return j;
            }
        }
        return nums.length;
    }

    public void swap(int[] nums, int first, int last) {
        int temp = nums[first];
        nums[first] = nums[last];
        nums[last] = temp;
    }
}
