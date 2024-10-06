package Codopedia.Tree;

/*
You are given the root of a binary search tree (BST) and an integer val.
Find the node in the BST that the node's value equals val and return the subtree rooted with that node. If such a node does not exist, return null.

Example 1:
Input: root = [4,2,7,1,3], val = 2
Output: [2,1,3]

Example 2:
Input: root = [4,2,7,1,3], val = 5
Output: []

Constraints:
The number of nodes in the tree is in the range [1, 5000].
1 <= Node.val <= 107
root is a binary search tree.
1 <= val <= 107
 */

// Class for a binary tree node
class TreeNodeSearch {
    int val;
    TreeNodeSearch left;
    TreeNodeSearch right;

    TreeNodeSearch() {
    }

    TreeNodeSearch(int val) {
        this.val = val;
    }

    TreeNodeSearch(int val, TreeNodeSearch left, TreeNodeSearch right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class search_in_bst {
    public TreeNodeSearch searchBST(TreeNodeSearch root, int val) {
        if (root == null || root.val == val) {
            return root;
        }

        if (val < root.val) {
            return searchBST(root.left, val);
        } else {
            return searchBST(root.right, val);
        }
    }

    // Main method to test searchBST
    public static void main(String[] args) {
        // Constructing a binary search tree (BST)
        TreeNodeSearch node4 = new TreeNodeSearch(4);
        TreeNodeSearch node2 = new TreeNodeSearch(2);
        TreeNodeSearch node7 = new TreeNodeSearch(7);
        TreeNodeSearch node1 = new TreeNodeSearch(1);
        TreeNodeSearch node3 = new TreeNodeSearch(3);


        node2.left = node1;
        node2.right = node3;
        node4.left = node2;
        node4.right = node7;

        // Create an instance of the Solution class
        search_in_bst search_in_bst = new search_in_bst();

        // Test searchBST
        int searchValue = 12;
        TreeNodeSearch result = search_in_bst.searchBST(node4, searchValue);

        if (result != null) {
            System.out.println("Found node with value: " + result.val);
        } else {
            System.out.println("Node with value " + searchValue + " not found.");
        }
    }
}
