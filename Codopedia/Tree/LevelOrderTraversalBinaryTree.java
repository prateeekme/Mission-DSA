package Codopedia.Tree;

import java.util.*;

/*
Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).

Example 1:
Input: root = [3,9,20,null,null,15,7]
Output: [[3],[9,20],[15,7]]

Example 2:
Input: root = [1]
Output: [[1]]

Example 3:
Input: root = []
Output: []

Constraints:
The number of nodes in the tree is in the range [0, 2000].
-1000 <= Node.val <= 1000
 */
class TreeNodeLOT {
    int val;
    TreeNodeLOT left;
    TreeNodeLOT right;

    TreeNodeLOT() {
    }

    TreeNodeLOT(int val) {
        this.val = val;
    }

    TreeNodeLOT(int val, TreeNodeLOT left, TreeNodeLOT right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class LevelOrderTraversalBinaryTree {

    public List<List<Integer>> levelOrder(TreeNodeLOT root) {
        Queue<TreeNodeLOT> queue = new LinkedList<>();

        List<List<Integer>> listGroup = new ArrayList<>();

        if (root != null){
            queue.add(root);
        }

        while (!queue.isEmpty()){
            List<Integer> arr = new ArrayList<>();

            int queueLen = queue.size();
            for (int i=0; i < queueLen; i++){
                TreeNodeLOT curr = queue.poll(); //remove the first element and return it
                arr.add(curr.val);

                if (curr.left != null){
                    queue.add(curr.left);
                }
                if (curr.right != null){
                    queue.add(curr.right);
                }

            }
            listGroup.add(arr);
        }
        return listGroup;
    }

    public static void main(String[] args) {
        TreeNodeLOT node15 = new TreeNodeLOT(15);
        TreeNodeLOT node7 = new TreeNodeLOT(7);
        TreeNodeLOT node9 = new TreeNodeLOT(9);
        TreeNodeLOT node20 = new TreeNodeLOT(20, node15, node7);
        TreeNodeLOT root = new TreeNodeLOT(3, node9, node20);


        LevelOrderTraversalBinaryTree levelOrderTraversalBinaryTree = new LevelOrderTraversalBinaryTree();
        List<List<Integer>> result = levelOrderTraversalBinaryTree.levelOrder(root);
        System.out.println(result);
    }

}
