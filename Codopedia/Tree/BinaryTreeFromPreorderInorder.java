package Codopedia.Tree;

/*
You are given two integer arrays preorder and inorder.

preorder is the preorder traversal of a binary tree
inorder is the inorder traversal of the same tree
Both arrays are of the same size and consist of unique values.
Rebuild the binary tree from the preorder and inorder traversals and return its root.

Example 1:
Input: preorder = [1,2,3,4], inorder = [2,1,3,4]
Output: [1,2,3,null,null,null,4]

Example 2:
Input: preorder = [1], inorder = [1]
Output: [1]

Constraints:
1 <= inorder.length <= 1000.
inorder.length == preorder.length
-1000 <= preorder[i], inorder[i] <= 1000
 */

import java.util.HashMap;
import java.util.Map;

class TreeNodePI {
    int val;
    TreeNodePI left;
    TreeNodePI right;

    TreeNodePI() {
    }

    TreeNodePI(int val) {
        this.val = val;
    }

    TreeNodePI(int val, TreeNodePI left, TreeNodePI right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class BinaryTreeFromPreorderInorder {

    public TreeNodePI buildTree(int[] preorder, int[] inorder) {

        Map<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < inorder.length; i++) {
            hashMap.put(inorder[i], i);
        }

        TreeNodePI root = buildTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1, hashMap);
        return root;
    }

    public TreeNodePI buildTree(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd, Map<Integer, Integer> hashMap) {

        if (preStart > preEnd || inStart > inEnd) {
            return null;
        }

        //Pre Order first element as root
        TreeNodePI root = new TreeNodePI(preorder[preStart]);

        int inRoot = hashMap.get(root.val);
        int NumOnLeft = inRoot - inStart;

        root.left = buildTree(preorder, preStart + 1, preStart + NumOnLeft,
                inorder, inStart, inRoot - 1, hashMap);

        root.right = buildTree(preorder, preStart + NumOnLeft + 1, preEnd,
                inorder, inRoot + 1, inEnd, hashMap);

        return root;
    }

    public static void main(String[] args) {
        int[] preorder = {1, 2, 3, 4};
        int[] inorder = {2, 1, 3, 4};

        BinaryTreeFromPreorderInorder BinaryTreeFromPreorderInorder = new BinaryTreeFromPreorderInorder();

        TreeNodePI result = BinaryTreeFromPreorderInorder.buildTree(preorder, inorder);
        System.out.println(result.val);
        System.out.println(result.left != null ? result.left.val : "null");
    }
}
