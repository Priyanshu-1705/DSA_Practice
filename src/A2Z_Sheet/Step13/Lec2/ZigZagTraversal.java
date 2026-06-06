package A2Z_Sheet.Step13.Lec2;
//Ps:103

import A2Z_Sheet.Step13.Lec1.TreeNode;
import java.util.*;
public class ZigZagTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> bigList = new ArrayList<>();
        //Edge case
        if(root == null){
            return bigList;
        }
        int level = 1;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int queueSize = queue.size();
            List<Integer> smallList = new ArrayList<Integer>();
            for(int i = 1; i<= queueSize; i++){
                TreeNode node = queue.poll();
                smallList.add(node.val);
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
            }
            if(level % 2 == 0){
                Collections.reverse(smallList);
            }
            bigList.add(smallList);
            level++;
        }
        return bigList;
    }
}
