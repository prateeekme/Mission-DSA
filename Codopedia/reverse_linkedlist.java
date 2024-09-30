package Codopedia;

/*
 * Reverse a Linked List - Solved
 *
 * Given the head of a singly linked list, reverse the list and return the new head (beginning) of the list.
 * The problem is to reverse the pointers of each node in the list, making the previous tail the new head.
 *
 * Example 1:
 * Input: head = [0,1,2,3]
 * Output: [3,2,1,0]
 *
 * Example 2:
 * Input: head = []
 * Output: []
 *
 * Constraints:
 * - 0 <= The length of the list <= 1000.
 * - -1000 <= Node.val <= 1000
 *
 */

class ListNode {
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

public class reverse_linkedlist {

    public ListNode reverseList(ListNode head) {

        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
