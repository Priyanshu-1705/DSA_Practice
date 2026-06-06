package A2Z_Sheet.Step13.Lec2;

import A2Z_Sheet.Step13.Lec1.TreeNode;

import java.util.*;

public class BoundaryTraversal {
    public List<Integer> boundary(TreeNode root) {
        List<Integer> res = new ArrayList<>();

        // Edge case: empty tree
        if (root == null) return res;

        // Step 1: Add root (only if it's not a leaf)
        if (!isLeaf(root)) {
            res.add(root.val);
        }

        // Step 2: Add left boundary (excluding leaf nodes)
        addLeftBoundary(root, res);

        // Step 3: Add all leaf nodes (left to right)
        addLeaves(root, res);

        // Step 4: Add right boundary (in reverse, excluding leaf nodes)
        addRightBoundary(root, res);

        return res;
    }

    // Function to check if a node is a leaf
    boolean isLeaf(TreeNode node) {
        return node.left == null && node.right == null;
    }

    // Step 2: Left Boundary
    void addLeftBoundary(TreeNode node, List<Integer> res) {
        node = node.left; // start from left child

        while (node != null) {
            // Add only if it's NOT a leaf
            if (!isLeaf(node)) {
                res.add(node.val);
            }

            // Move left if possible, otherwise go right
            if (node.left != null) {
                node = node.left;
            } else {
                node = node.right;
            }
        }
    }

    // Step 3: Leaf Nodes (DFS)
    void addLeaves(TreeNode node, List<Integer> res) {
        if (node == null) return;

        // If leaf node → add it
        if (isLeaf(node)) {
            res.add(node.val);
            return;
        }

        // Traverse left and right
        addLeaves(node.left, res);
        addLeaves(node.right, res);
    }

    // Step 4: Right Boundary (reverse order)
    void addRightBoundary(TreeNode node, List<Integer> res) {
        node = node.right; // start from right child
        List<Integer> temp = new ArrayList<>();

        while (node != null) {
            // Add only if it's NOT a leaf
            if (!isLeaf(node)) {
                temp.add(node.val);
            }

            // Move right if possible, otherwise go left
            if (node.right != null) {
                node = node.right;
            } else {
                node = node.left;
            }
        }

        // Add in reverse order
        for (int i = temp.size() - 1; i >= 0; i--) {
            res.add(temp.get(i));
        }
    }
}

