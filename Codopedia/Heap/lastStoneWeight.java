package Codopedia.Heap;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;


public class lastStoneWeight {

    int destory = 0;

    int firstL;
    int secondL;


    public static void main(String[] args) {

        lastStoneWeight lastStoneWeight = new lastStoneWeight();
        int[] stone = {2,7,4,1,8,1};
        int result = lastStoneWeight.lastWeight(stone);
        System.out.println(result);

    }

    private int lastWeight(int[] input) {

        PriorityQueue <Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        for (int nums: input){
            priorityQueue.add(nums);
            //System.out.println(nums);

        }
        System.out.println(" ");
        while (priorityQueue.size() > 1){
            firstL = priorityQueue.poll();
            secondL = priorityQueue.poll();


            if (firstL != secondL){
                int temp = firstL - secondL;
                priorityQueue.offer(temp);
            }
        }
        return priorityQueue.isEmpty() ? 0 : priorityQueue.peek();

    }

}
