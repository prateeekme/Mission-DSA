package Codopedia.Array;

import java.util.ArrayList;
import java.util.List;

/*
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

Example 1:
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]

Example 2:
Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation:
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
 */

public class rotateArray {

    public List<Integer> rotate(int[] nums, int k) {

        int index = nums.length - k;
        List <Integer> list = new ArrayList<>();

        for (int i = index; i < index + k; i++){
            list.add(nums[i]);
        }
        for (int i = 0; i < nums.length - k; i++){
            list.add(nums[i]);
        }

        return list;
    }

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,7};
        int target = 3;

        rotateArray rotateArray = new rotateArray();
        List<Integer> result = rotateArray.rotate(nums, target);
        System.out.println(result);

    }
}
