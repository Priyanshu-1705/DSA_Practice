package A2Z_Sheet.Step13.Lec1;


import java.util.*;
public class PostOrderUsingTwoStack {
    //TwoStack
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();
        s1.push(root);
        while (!s1.isEmpty()) {
            TreeNode curr = s1.pop();
            s2.push(curr);

            if (curr.left != null) s1.push(curr.left);
            if (curr.right != null) s1.push(curr.right);
        }
        while (!s2.isEmpty()) {
            result.add(s2.pop().val);
        }
        return result;
    }

    //OneStack
    public List<Integer> postorderTraversal1(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        TreeNode curr = root;
        TreeNode lastVisited = null;

        while (curr != null || !stack.isEmpty()) {
            if (curr != null) {
                stack.push(curr);
                curr = curr.left;
            } else {
                TreeNode peekNode = stack.peek();
                // If right exists and not visited yet
                if (peekNode.right != null && lastVisited != peekNode.right) {
                    curr = peekNode.right;
                } else {
                    result.add(peekNode.val);
                    lastVisited = stack.pop();
                }
            }
        }
        return result;
    }
}
