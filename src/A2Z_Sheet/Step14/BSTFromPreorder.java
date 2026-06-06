package A2Z_Sheet.Step14;
//Ps:1008
import A2Z_Sheet.Step13.Lec1.TreeNode;

public class BSTFromPreorder {
    int ind = 0;
    public TreeNode bstFromPreorder(int[] preorder) {
     return helper(preorder, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    TreeNode helper(int[] preoder, long min, long max){
        if(ind >= preoder.length || preoder[ind] < min || preoder[ind] > max ){
            return null;
        }
        TreeNode root = new TreeNode(preoder[ind]);
        ind++;
        root.left = helper(preoder, min, root.val);
        root.right = helper(preoder, root.val, max);
        return root;
    }
}
