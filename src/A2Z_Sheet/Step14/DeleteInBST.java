package A2Z_Sheet.Step14;
//Ps:450

import A2Z_Sheet.Step13.Lec1.TreeNode;

public class DeleteInBST {
    /*
    Case 1: Node is a leaf
    Case 2: Node with a single child
    Case 3: Node with two child
     */
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;

        if (key < root.val) {
            root.left = deleteNode(root.left, key);   // update left
        } else if (key > root.val) {
            root.right = deleteNode(root.right, key); // update right
        } else {
            // Case 1: no child
            if (root.left == null && root.right == null) {
                return null;
            }

            // Case 2: one child
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;

            // Case 3: two children
            TreeNode successor = findMin(root.right); // smallest in right subtree
            root.val = successor.val;
            root.right = deleteNode(root.right, successor.val);
        }

        return root;
    }

    // Find minimum node (leftmost)
    private TreeNode findMin(TreeNode node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }
}
