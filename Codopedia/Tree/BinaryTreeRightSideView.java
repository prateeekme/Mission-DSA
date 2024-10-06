package Codopedia.Tree;

/*
Given the root of a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.

Example 1:
Input: root = [1,2,3,null,5,null,4]
Output: [1,3,4]

Example 2:
Input: root = [1,null,3]
Output: [1,3]

Example 3:
Input: root = []
Output: []

Constraints:
The number of nodes in the tree is in the range [0, 100].
-100 <= Node.val <= 100
 */

import java.util.*;

class TreeNodeRSV {
    int val;
    TreeNodeRSV left;
    TreeNodeRSV right;

    TreeNodeRSV() {
    }

    TreeNodeRSV(int val) {
        this.val = val;
    }

    TreeNodeRSV(int val, TreeNodeRSV left, TreeNodeRSV right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class BinaryTreeRightSideView {


    public static void main(String[] args) {
        TreeNodeRSV node5 = new TreeNodeRSV(5);
        TreeNodeRSV node4 = new TreeNodeRSV(4);
        TreeNodeRSV node2 = new TreeNodeRSV(2, null, node5); // 2 -> right child is 5
        TreeNodeRSV node3 = new TreeNodeRSV(3, null, node4); // 3 -> right child is 4
        TreeNodeRSV root = new TreeNodeRSV(1, node2, node3); // 1 -> left child is 2, right child is 3

        BinaryTreeRightSideView BinaryTreeRightSideView = new BinaryTreeRightSideView();
        List<List<Integer>> result = Collections.singletonList(BinaryTreeRightSideView.rightSideView(root));
        System.out.println(result);
    }

    public List<Integer> rightSideView(TreeNodeRSV root) {

        Queue<TreeNodeRSV> queue = new LinkedList<>();
        List<Integer> result = new ArrayList<>();

        if(root != null){
            queue.add(root);
        }

        while (!queue.isEmpty()){
            TreeNodeRSV right = null;
            int lenQueue = queue.size();

            for (int i=0; i < lenQueue; i++){

                TreeNodeRSV curr = queue.poll();
                right = curr;

                if(curr.left != null){
                    queue.add(curr.left);
                }
                if(curr.right != null){
                    queue.add(curr.right);
                }
            }
            result.add(right.val);
        }
        return result;
    }
}


