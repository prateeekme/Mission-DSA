/**
 * The removeDuplicates class removes duplicate elements from an array of integers and prints the
 * resulting array.
 */

// https://leetcode.com/problems/remove-duplicates-from-sorted-array/

package Arrays;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void removeDup(int[] nums) {

        int len = nums.length;
        int j = 0;

        for (int i = 1; i < len; i++) {
            if (nums[j] != nums[i]) {
                j++;
                nums[j] = nums[i];
            }
        }
        System.out.println(Arrays.toString(Arrays.copyOfRange(nums, 0, j + 1)));
    }

    public static void main(String[] args) {
        int nums[] = { 1, 1, 2 };
        removeDup(nums);
    }
}
