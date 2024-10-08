package Codopedia.Sorting;

/*
Insertion Sort
Solved

Implement Insertion Sort and return intermediate states.

Insertion Sort is a simple sorting algorithm that builds the sorted list one element at a time,
from left to right. It works by repeatedly taking an element from the unsorted portion
and inserting it into its correct position in the sorted portion of the list.

Objective:

Given a list of key-value pairs, sort the list by key using Insertion Sort.
Return a list of lists showing the state of the array after each insertion.
If two key-value pairs have the same key, maintain their relative order in the sorted list.

Input:

pairs - a list of key-value pairs, where each key-value has an integer key and a string value.
(0 <= pairs.length <= 100).

Example 1:

Input:
pairs = [(5, "apple"), (2, "banana"), (9, "cherry")]

Output:
[[(5, "apple"), (2, "banana"), (9, "cherry")],
 [(2, "banana"), (5, "apple"), (9, "cherry")],
 [(2, "banana"), (5, "apple"), (9, "cherry")]]

Example 2:

Input:
pairs = [(3, "cat"), (3, "bird"), (2, "dog")]

Output:
[[(3, "cat"), (3, "bird"), (2, "dog")],
 [(3, "cat"), (3, "bird"), (2, "dog")],
 [(2, "dog"), (3, "cat"), (3, "bird")]]

In this example, you can observe that the pairs with key=3 ("cat" and "bird") maintain their relative order,
illustrating the stability of the Insertion Sort algorithm.
*/

import java.util.ArrayList;
import java.util.List;

public class insertionSort {
    class Pair {
        int key;
        String value;

        Pair(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    public List<List<Pair>> insertionSort(List<Pair> pairs) {

        int size = pairs.size();
        List<List<Pair>> res = new ArrayList<>(); //Resultant ArrayList

        //Iteration for the insertion sort
        for (int i = 0; i < size; i++) {

            int j = i - 1;

            while (j >= 0 && pairs.get(j).key > pairs.get(j + 1).key) {
                //Swapping the values
                Pair temp = pairs.get(j);
                pairs.set(j, pairs.get(j + 1));
                pairs.set(j + 1, temp);
                j--;
            }

            List<Pair> cloneList = new ArrayList<>(pairs); //List of Array
            res.add(cloneList);

        }
        return res;
    }
}

