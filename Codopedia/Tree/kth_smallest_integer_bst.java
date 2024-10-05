package Codopedia.Tree;

import java.util.Collections;
import java.util.List;
import java.util.Stack;

class TreeNodek {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNodek() {}

    TreeNodek(int val) {
        this.val = val;
    }

    TreeNodek(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class kth_smallest_integer_bst {

    public int kthSmallest(TreeNode root, int k) {

        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        int count = 0;

        while(curr != null || !stack.isEmpty()){

            while (curr != null){
                stack.push(curr);
                curr = curr.left;
            }
            count++;
            curr = stack.pop();

            if(count == k){
                return curr.val;
            }
            curr = curr.right;
        }
        return -1;
    }

    public static void main(String[] args) {
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3, node2, null);
        TreeNode node5 = new TreeNode(5);
        TreeNode root = new TreeNode(4, node3, node5);
        int key = 4;

        kth_smallest_integer_bst kthSmallestIntegerBst = new kth_smallest_integer_bst();
        List<Integer> result = Collections.singletonList(kthSmallestIntegerBst.kthSmallest(root, key));

        System.out.println(result);
    }
}
