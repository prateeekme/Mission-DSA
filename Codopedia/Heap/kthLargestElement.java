package Codopedia.Heap;

/*
Given an unsorted array of integers nums and an integer k, return the kth largest element in the array.
By kth largest element, we mean the kth largest element in the sorted order, not the kth distinct element.

Follow-up: Can you solve it without sorting?

Example 1:
Input: nums = [2,3,1,5,4], k = 2
Output: 4

Example 2:
Input: nums = [2,3,1,1,5,5,4], k = 3
Output: 4

Constraints:
1 <= k <= nums.length <= 10000
-1000 <= nums[i] <= 1000
 */

import java.util.Collections;
import java.util.PriorityQueue;

public class kthLargestElement {

    public static void main(String[] args) {

        int[] nums = {3,2,3,1,2,4,5,5,6};
        int k = 4;

        kthLargestElement kthLargestElement = new kthLargestElement();
        int result =  kthLargestElement.findKthLargest( nums, k);
        System.out.println(result);

    }

    private int findKthLargest(int[] nums, int k) {

        PriorityQueue priorityQueue = new PriorityQueue(Collections.reverseOrder());

        for (int num: nums){
            priorityQueue.offer(num);
            //System.out.println(priorityQueue);
        }

        //System.out.println(priorityQueue);
        for (int i = 0; i < k-1; i++){
            priorityQueue.poll();
        }

        //System.out.println(priorityQueue.peek());
        return (int) priorityQueue.peek();
    }

}
