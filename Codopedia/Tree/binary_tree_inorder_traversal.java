package Codopedia.Tree;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class binary_tree_inorder_traversal {

    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();

        TreeNode curr = root;

        while(curr != null || !stack.isEmpty()){
            //Keep on traversing left nodes
            while(curr != null){
                stack.add(curr);
                curr = curr.left;
            }

            curr = stack.pop();
            list.add(curr.val);
            curr = curr.right;

        }
        return list;
    }

    public static void main(String[] args) {

        TreeNode node3 = new TreeNode(3);
        TreeNode node2 = new TreeNode(2, node3, null);
        TreeNode root = new TreeNode(1, null, node2);

        binary_tree_inorder_traversal inorderTraversalObj = new binary_tree_inorder_traversal();

        List<Integer> result = inorderTraversalObj.inorderTraversal(root);

        System.out.println(result);

    }

}
