package A2Z_Sheet.Step14;
//Ps:98
import A2Z_Sheet.Step13.Lec1.TreeNode;

public class ValidateBST {
    //Range approach
    public boolean isValidBST(TreeNode root) {
        return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean helper(TreeNode root, long min, long max) {
        if (root == null) return true;

        //  violates BST property
        if (root.val <= min || root.val >= max) return false;

        // left subtree → values must be < root.val
        // right subtree → values must be > root.val
        return helper(root.left, min, root.val) &&
                helper(root.right, root.val, max);
    }

    //Inorder approach
    public boolean isValidBST1(TreeNode root) {
        if (root.left == null && root.right == null){
            return true;
        }
        if (root.left != null && (root.val < root.left.val)){
            return false;
        }
        if (root.right != null && (root.val > root.right.val)){
            return false;
        }
        return isValidBST1(root.left) && isValidBST1(root.right);
    }
}
