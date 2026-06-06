package A2Z_Sheet.Step14;
//Ps:235
import A2Z_Sheet.Step13.Lec1.TreeNode;

public class LCAInBST {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while (root != null) {
            // both nodes are smaller → go left
            if (p.val < root.val && q.val < root.val) {
                root = root.left;
            }
            // both nodes are greater → go right
            else if (p.val > root.val && q.val > root.val) {
                root = root.right;
            }
            // split point → this is LCA
            else {
                return root;
            }
        }
        return null;
    }
}
