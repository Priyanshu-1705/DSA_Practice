package A2Z_Sheet.Step14;

import A2Z_Sheet.Step13.Lec1.TreeNode;

public class InsertInBST {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null){
            TreeNode node = new TreeNode(val);
            return node;
        }
        if(root.val > val){
            root.left = insertIntoBST(root.left, val);
        }
        else{
            root.right = insertIntoBST(root.right, val);
        }
        return root;
    }
}
