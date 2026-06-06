package A2Z_Sheet.Step13.Lec2;
//Ps:101

import A2Z_Sheet.Step13.Lec1.TreeNode;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return helper(root.left , root.right);
    }

    private boolean helper(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null){
            return root1 == root2;
        }

        return (root1.val == root2.val) && helper(root1.left, root2.right) && helper(root1.right, root2.left);
    }

}
