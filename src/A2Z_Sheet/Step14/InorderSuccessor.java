package A2Z_Sheet.Step14;

import A2Z_Sheet.Step13.Lec1.TreeNode;

public class InorderSuccessor {
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        // initialize successor
        TreeNode successor = null;
        // traverse until root becomes null
        while (root != null) {
            // when p is greater or equal, move right
            if (p.val >= root.val) {
                root = root.right;
            }
            // otherwise update successor and move left
            else {
                successor = root;
                root = root.left;
            }
        }
        // return successor (may be null)
        return successor;
    }
}
