package Codopedia.Backtracking;

/*
Given an integer array nums of unique elements, return all possible
subsets (the power set).

The solution set must not contain duplicate subsets. Return the solution in any order.

Example 1:
Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]

Example 2:
Input: nums = [0]
Output: [[],[0]]
 */

import java.util.ArrayList;
import java.util.List;

public class subsets {

    public List<List<Integer>> subsets(int[] nums) {

        //Iterative Approach:
//        List<List<Integer>> result = new ArrayList<>();
//        result.add(new ArrayList());
//
//        for (int num: nums){
//            int len = result.size(); // will need to fetch the size as it is dynamic in nature and keep on changing
//            for (int i = 0; i < len; i++){
//
//                List<Integer> temp = new ArrayList<>(result.get(i));
//                temp.add(num);
//                result.add(temp);
//            }
//        }
//        return result;

        //BackTracking Approach: - Recussive Way

        List<List<Integer>> result = new ArrayList<>();
        backTrackMethod(0, nums, new ArrayList<>(), result);//nums, start index, temp[], result
        return result;

    }
    private void backTrackMethod(int index, int[] nums, List<Integer> temp , List<List<Integer>> result) {
        result.add(new ArrayList<>(temp));
        for (int i = index; i < nums.length; i++){
            temp.add(nums[i]);
            backTrackMethod(i+1, nums, temp, result);
            temp.remove(temp.size() - 1);
        }
    }

    public static void main(String[] args) {

        int[] input = {1, 2, 3};
        subsets subsets = new subsets();
        List<List<Integer>> result =  subsets.subsets(input);
        System.out.println(result);
    }

}
