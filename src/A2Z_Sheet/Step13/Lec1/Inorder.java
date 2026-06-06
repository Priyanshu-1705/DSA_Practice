package A2Z_Sheet.Step13.Lec1;
//Ps:94

import java.util.*;
public class Inorder {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        helper(root, result);
        return result;
    }

    //Inorder - Left Data Right
    void helper(TreeNode root, List<Integer> result){
        if(root == null){
            return;
        }
        helper(root.left, result);
        result.add(root.val);
        helper(root.right, result);
    }


    //Iterative approach
    public List<Integer> inorderTraversal1(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (root == null) return result;
        TreeNode curr = root;

        while (curr != null || !stack.isEmpty()) {
            // Step 1: Go to leftmost node
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            // Step 2: Process node
            curr = stack.pop();
            result.add(curr.val);
            // Step 3: Move to right subtree
            curr = curr.right;
        }
        return result;
    }
}
