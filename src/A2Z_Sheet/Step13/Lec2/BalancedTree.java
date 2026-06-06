package A2Z_Sheet.Step13.Lec2;
//Ps:110
import A2Z_Sheet.Step13.Lec1.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class BalancedTree {
    //Optimal approach
    public boolean isBalanced(TreeNode root) {
        // Check if the tree's height difference between subtrees is less than 2
        // If not, return false; otherwise, return true
        return dfsHeight(root) != -1;
    }

    // Recursive function to calculate the height of the tree
    public int dfsHeight(TreeNode root) {
        // Base case: if the current node is NULL, return 0 (height of an empty tree)
        if (root == null) return 0;
        // Recursively calculate the height of the left subtree
        int leftHeight = dfsHeight(root.left);
        // If the left subtree is unbalanced, propagate the unbalance status
        if (leftHeight == -1)
            return -1;
        // Recursively calculate the height of the right subtree
        int rightHeight = dfsHeight(root.right);
        // If the right subtree is unbalanced, propagate the unbalance status
        if (rightHeight == -1)
            return -1;
        // Check if the difference in height between left and right subtrees is greater than 1
        // If it's greater, the tree is unbalanced, return -1 to propagate the unbalance status
        if (Math.abs(leftHeight - rightHeight) > 1)
            return -1;
        // Return the maximum height of left and right subtrees plus 1 (for the current node)
        return Math.max(leftHeight, rightHeight) + 1;
    }






    //Brute force
    public boolean isBalanced1(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        if(root == null) return true;
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            int diff = height(node.left) - height(node.right);
            if(diff > 1 || diff < -1){
                return false;
            }
            if(node.left != null){
                stack.push(node.left);
            }
            if(node.right != null){
                stack.push(node.right);
            }
        }
        return true;
    }

    private static int height(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        int level = 0;
        if(root == null) return level;
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            for (int i = 1; i <= size; i++) {
                TreeNode node = queue.poll();
                if (node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
            }
            level++;
        }
        return level;
    }
}
