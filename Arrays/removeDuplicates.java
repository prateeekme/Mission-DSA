package Arrays;

import java.util.Arrays;

public class removeDuplicates {

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
