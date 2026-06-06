package A2Z_Sheet.Step14;
//Ps:700
import A2Z_Sheet.Step13.Lec1.TreeNode;

public class SearchInBST {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null || root.val == val) return root;
        if (val < root.val){
            return searchBST(root.left, val);
        }else {
            return searchBST(root.right, val);
        }
    }
}
