package A2Z_Sheet.Step13.Lec3;

import A2Z_Sheet.Step13.Lec1.TreeNode;

import java.util.*;
public class PathToNode {
    public List<Integer> pathToNode(TreeNode root, TreeNode target) {
        List<Integer> res = new ArrayList<>();
        helper(root, target, res);
        Collections.reverse(res);
        return res;
    }

    boolean helper(TreeNode root, TreeNode target, List<Integer> res) {
        if (root == null) return false;
        // If current node is target
        if (root == target) {
            res.add(root.val);
            return true;
        }
        // Check in left or right subtree
        if (helper(root.left, target, res) || helper(root.right, target, res)) {
            res.add(root.val); // add while backtracking
            return true;
        }
        return false;
    }
}
