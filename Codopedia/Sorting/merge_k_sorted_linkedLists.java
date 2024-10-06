package Codopedia.Sorting;

/*
    You are given an array of k linked-lists, each linked-list is sorted in ascending order.

    Merge all the linked-lists into one sorted linked-list and return it.

    Example 1:

    Input: lists = [[1,4,5],[1,3,4],[2,6]]
    Output: [1,1,2,3,4,4,5,6]
    Explanation: The linked-lists are:
    [
      1->4->5,
      1->3->4,
      2->6
    ]
    merging them into one sorted list:
    1->1->2->3->4->4->5->6

    Example 2:

    Input: lists = []
    Output: []

    Example 3:

    Input: lists = [[]]
    Output: []

    Constraints:

    k == lists.length
    0 <= k <= 10^4
    0 <= lists[i].length <= 500
    -10^4 <= lists[i][j] <= 10^4
    lists[i] is sorted in ascending order.
    The sum of lists[i].length will not exceed 10^4.
*/

public class merge_k_sorted_linkedLists {

    //Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {
        }
        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


    public ListNode mergeKLists(ListNode[] lists) {
        //Corner Case
        if (lists == null || lists.length == 0) {
            return null;
        }
        return mergeSortHelper(lists, 0, lists.length - 1);
    }

    private ListNode mergeSortHelper(ListNode[] lists, int start, int end) {
        //If there is only linkedlist in the list present
        if (start == end) {
            return lists[start];
        }

        //If we have only two list, merge them
        if (start + 1 == end) {
            return merge(lists[start], lists[end]);
        }

        int mid = start + (end - start) / 2;
        ListNode left = mergeSortHelper(lists, start, mid);
        ListNode right = mergeSortHelper(lists, mid + 1, end);
        return merge(left, right);
    }

    private ListNode merge(ListNode first, ListNode second) {

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while (first != null && second != null) {
            if (first.val < second.val) {
                curr.next = first;
                first = first.next;
            } else {
                curr.next = second;
                second = second.next;
            }

            curr = curr.next;
        }

        if (first != null) {
            curr.next = first;
        } else {
            curr.next = second;
        }
        return dummy.next;
    }
}