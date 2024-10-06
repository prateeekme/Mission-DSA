package Codopedia.Sorting;

/*
Merge Sort
Solved

Implement Merge Sort.

Merge Sort is a divide-and-conquer algorithm for sorting an array or list of elements.
It works by recursively dividing the unsorted list into n sub-lists, each containing one element.
Then, it repeatedly merges sub-lists to produce new sorted sub-lists until there is only one sub-list remaining.

Objective:

Given a list of key-value pairs, sort the list by key using Merge Sort.
If two key-value pairs have the same key, maintain their relative order in the sorted list.

Input:

pairs - a list of key-value pairs, where each key-value has an integer key and a string value.
(0 <= pairs.length <= 100).

Example 1:

Input:
pairs = [(5, "apple"), (2, "banana"), (9, "cherry"), (1, "date"), (9, "elderberry")]

Output:
[(1, "date"), (2, "banana"), (5, "apple"), (9, "cherry"), (9, "elderberry")]

Note: As you can see, the solution is always stable.
The two pairs with the key 9 maintained their relative positions.

Example 2:

Input:
pairs = [(3, "cat"), (2, "dog"), (3, "bird")]

Output:
[(2, "dog"), (3, "cat"), (3, "bird")]
*/

import java.util.ArrayList;
import java.util.List;

public class mergeSort {

    //Definition for a pair.
    class Pair {
        public int key;
        public String value;

        public Pair(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    class Solution {
        public List<Pair> mergeSort(List<Pair> pairs) {
            return sortL(pairs, 0, pairs.size() - 1);
        }

        public List<Pair> sortL(List<Pair> arr, int start, int end) {
            if ((end - start) + 1 <= 1) {
                return arr; // if we got an single element
            }
            int mid = (start + end) / 2;

            sortL(arr, start, mid); //RHS
            sortL(arr, mid + 1, end); //LHS

            merge(arr, start, mid, end); //Merge all

            return arr;
        }

        public void merge(List<Pair> arr, int start, int mid, int end) {

            List<Pair> mL = new ArrayList<>(arr.subList(start, mid + 1));
            List<Pair> mR = new ArrayList<>(arr.subList(mid + 1, end + 1));

            int i = 0;
            int j = 0;
            int k = start;

            while (i < mL.size() && j < mR.size()) {
                if (mL.get(i).key <= mR.get(j).key) {
                    arr.set(k, mL.get(i));
                    i += 1;
                } else {
                    arr.set(k, mR.get(j));
                    j += 1;
                }
                k += 1;
            }

            while (i < mL.size()) {
                arr.set(k, mL.get(i));
                i += 1;
                k += 1;
            }
            while (j < mR.size()) {
                arr.set(k, mR.get(j));
                j += 1;
                k += 1;
            }
        }
    }
}
