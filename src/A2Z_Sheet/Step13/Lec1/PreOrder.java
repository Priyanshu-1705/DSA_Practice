package A2Z_Sheet.Step13.Lec1;
import java.util.*;
//Ps: 144
public class PreOrder {
    //Iterative approach
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            result.add(node.val);
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
        return result;
    }

    public List<Integer> preorderTraversal1(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        helper(root, result);
        return result;
    }
    //Recursive approach
    void helper(TreeNode root, List<Integer> result) {
        if (root == null)
            return;
        result.add(root.val);
        helper(root.left, result);
        helper(root.right, result);
    }
}
