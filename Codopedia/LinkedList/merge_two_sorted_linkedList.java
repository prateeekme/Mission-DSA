package Codopedia.LinkedList;

/*
 * Merge Two Sorted Linked Lists - Solved
 *
 * You are given the heads of two sorted linked lists, list1 and list2.
 * The task is to merge the two lists into one sorted linked list and return the head of the new sorted list.
 * The nodes of the new list should consist of the nodes from list1 and list2, preserving the sorted order.
 *
 * Example 1:
 * Input: list1 = [1,2,4], list2 = [1,3,5]
 * Output: [1,1,2,3,4,5]
 *
 * Example 2:
 * Input: list1 = [], list2 = [1,2]
 * Output: [1,2]
 *
 * Example 3:
 * Input: list1 = [], list2 = []
 * Output: []
 *
 * Constraints:
 * - 0 <= The length of each list <= 100.
 * - -100 <= Node.val <= 100.
 *
 */


class ListNode1 {
int val;
ListNode1 next;
ListNode1() {}
ListNode1(int val) { this.val = val; }
 ListNode1(int val, ListNode1 next) { this.val = val; this.next = next; }
}

public class merge_two_sorted_linkedList {

    public ListNode1 mergeTwoLists(ListNode1 list1, ListNode1 list2) {

        //Corner Cases:
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        //Create a Dummy Node;
        ListNode1 dummy = new ListNode1(0);
        ListNode1 node = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                node.next = list1;
                list1 = list1.next;
            } else {
                node.next = list2;
                list2 = list2.next;
            }
            node = node.next;
        }

        //if one goes empty and other one is not empty
        if (list1 != null) {
            node.next = list1;
        } else {
            node.next = list2;
        }
        return dummy.next;
    }
}
