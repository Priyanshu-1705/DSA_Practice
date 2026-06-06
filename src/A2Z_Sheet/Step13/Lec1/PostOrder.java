package A2Z_Sheet.Step13.Lec1;
//Ps:145

import java.util.*;
public class PostOrder {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        helper(root, result);
        return result;
    }

    //PostOrder - Left Right Data
    void helper(TreeNode root, List<Integer> result){
        if(root == null){
            return;
        }
        helper(root.left, result);
        helper(root.right, result);
        result.add(root.val);
    }
}
