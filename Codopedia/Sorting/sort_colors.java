package Codopedia.Sorting;

/*
    Given an array nums with n objects colored red, white, or blue,
    sort them in-place so that objects of the same color are adjacent,
    with the colors in the order red, white, and blue.

    We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

    You must solve this problem without using the library's sort function.

    Example 1:

    Input: nums = [2,0,2,1,1,0]
    Output: [0,0,1,1,2,2]

    Example 2:

    Input: nums = [2,0,1]
    Output: [0,1,2]

    Constraints:

    n == nums.length
    1 <= n <= 300
    nums[i] is either 0, 1, or 2.
*/

public class sort_colors {

    public void sortColors(int[] nums) {

        int len = nums.length;

        int[] count = new int[]{0,0,0};

        //Creating a bucket
        for(int n: nums){
            count[n]+=1;
        }

        int n=0;
        //Looping and merging
        for(int i=0; i<count.length; i++){
            for(int j=0; j<count[i]; j++){
                nums[n] = i;
                n+=1;
            }
        }

    }
}