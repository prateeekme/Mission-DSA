package Codopedia;

/*
Quick Sort

Quick Sort is a divide-and-conquer sorting algorithm that works by partitioning an array into two smaller sub-arrays based on a pivot element. The elements less than the pivot go to the left sub-array and those greater go to the right sub-array. The algorithm then recursively sorts the sub-arrays.

Objective:
Given a list of key-value pairs, sort the list by key using Quick Sort. For each partitioning step:
- Use the right-most element as the pivot.
- Elements less than the pivot should be placed to the left of the pivot, and elements greater than or equal to the pivot should be placed to the right of the pivot.
- The correctness of your solution will be determined based on these requirements.

Input:
- pairs - a list of key-value pairs, where each key-value has an integer key and a string value. (0 <= pairs.length <= 100).

Example 1:
Input:
pairs = [(3, "cat"), (2, "dog"), (3, "bird")]

Output:
[(2, "dog"), (3, "bird"), (3, "cat")]

Note: As you can see, the solution is not necessarily stable. The two pairs with the key 3 have switched their relative positions.

Example 2:
Input:
pairs = [(5, "apple"), (9, "banana"), (9, "cherry"), (1, "date"), (9, "elderberry")]

Output:
[(1, "date"), (5, "apple"), (9, "elderberry"), (9, "cherry"), (9, "banana")]
*/

import java.util.List;

public class quickSort {
    class Pair {
        int key;
        String value;

        public Pair(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    class Solution {
        public List<Pair> quickSort(List<Pair> pairs) {
            quickSortH(pairs, 0, pairs.size() - 1);
            return pairs;
        }

        public void quickSortH(List<Pair> arr, int start, int end) {

            if ((end - start) + 1 <= 1) {
                return;
            }

            Pair pivot = arr.get(end);
            int left = start;

            for (int i = start; i < end; i++) {
                if (arr.get(i).key < pivot.key) {
                    Pair temp = arr.get(left);
                    arr.set(left, arr.get(i));
                    arr.set(i, temp);
                    left += 1;
                }
            }
            arr.set(end, arr.get(left));
            arr.set(left, pivot);

            quickSortH(arr, start, left - 1);
            quickSortH(arr, left + 1, end);
        }
    }
}
