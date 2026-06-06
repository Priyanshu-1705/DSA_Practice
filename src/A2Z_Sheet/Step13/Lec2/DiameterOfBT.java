package A2Z_Sheet.Step13.Lec2;
//Ps:543

import A2Z_Sheet.Step13.Lec1.TreeNode;
public class DiameterOfBT {
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        helper(root, max);
        return max;
    }

    int helper(TreeNode root, int max){
        if(root == null) return 0;
        int lh = helper(root.left, max);
        int rh = helper(root.right, max);
        max = Math.max(max, lh+rh);
        return Math.max(lh, rh) + 1;
    }
}
