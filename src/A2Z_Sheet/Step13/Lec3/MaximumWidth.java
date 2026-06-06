package A2Z_Sheet.Step13.Lec3;
//Ps:662
import A2Z_Sheet.Step13.Lec1.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumWidth {
    // Pair class to store node and its index (position)
    class Pair {
        TreeNode node;
        int index;

        Pair(TreeNode node, int index) {
            this.node = node;
            this.index = index;
        }
    }

    public int widthOfBinaryTree(TreeNode root) {
        // Edge case: empty tree
        if (root == null) return 0;

        // Queue for BFS (level order traversal)
        Queue<Pair> queue = new LinkedList<>();

        // Start with root at index 0
        queue.offer(new Pair(root, 0));

        int maxWidth = 0;

        // BFS traversal
        while (!queue.isEmpty()) {

            int size = queue.size(); // number of nodes at current level

            // Get the minimum index at this level (to normalize)
            int minIndex = queue.peek().index;

            int first = 0, last = 0;

            // Traverse all nodes at current level
            for (int i = 0; i < size; i++) {

                Pair p = queue.poll();
                TreeNode node = p.node;

                // Normalize index to prevent overflow
                int currIndex = p.index - minIndex;

                // First node index at this level
                if (i == 0) first = currIndex;

                // Last node index at this level
                if (i == size - 1) last = currIndex;

                // Add left child with calculated index
                if (node.left != null) {
                    queue.offer(new Pair(node.left, 2 * currIndex));
                }

                // Add right child with calculated index
                if (node.right != null) {
                    queue.offer(new Pair(node.right, 2 * currIndex + 1));
                }
            }

            // Width of current level = last - first + 1
            int width = last - first + 1;

            // Update maximum width
            maxWidth = Math.max(maxWidth, width);
        }

        return maxWidth;
    }
}

