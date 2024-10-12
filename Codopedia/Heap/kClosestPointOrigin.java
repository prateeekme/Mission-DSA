package Codopedia.Heap;

import java.util.*;

public class kClosestPointOrigin {

    public static void main(String[] args) {

        int[][] points = {{0, 2}, {2, 0}, {2, 2}};
        int k = 2;

        kClosestPointOrigin kClosestPointOrigin = new kClosestPointOrigin();
        kClosestPointOrigin.kClosest(points, k);
    }

    private void kClosest(int[][] points, int k) {

        //We need to apply pythagoras therom for this.
        // I am planning to store the value of the c^2 to an array and will take help of Heap.

        PriorityQueue<int []> priorityQueue = new PriorityQueue<>((a,b) -> b[0] - a[0]);

        for (int i = 0; i < points.length; i++) {
            int x = points[i][0];
            int y = points[i][1];

            priorityQueue.offer(new int[]{x * x + y * y, i});

            if (priorityQueue.size() > k) {
                priorityQueue.poll();
            }

        }
            int[][] result = new int[k][2]; // 2 represent column

            for (int j = 0; j < k ; j++) result[j] = points[priorityQueue.poll()[1]];
            System.out.println(result);

    }
}
