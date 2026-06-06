package A2Z_Sheet.Step13.Lec2;
//Ps:104
import A2Z_Sheet.Step13.Lec1.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumDepth {
    //Using bfs
    public int maxDepth(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        int level = 0;
        if(root == null) return level;
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            for (int i = 1; i <= size; i++) {
                TreeNode node = queue.poll();
                if (node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
            }
            level++;
        }
        return level;
    }

    //Using dfs recursion
    public int maxDepth1(TreeNode root) {
        if (root == null) return 0;

        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
