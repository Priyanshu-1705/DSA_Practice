package A2Z_Sheet.Step13.Lec1;
//Ps:102
import java.util.*;
public class LevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> bigList = new ArrayList<>();
        //Edge case
        if(root == null){
            return bigList;
        }
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
            bigList.add(smallList);
        }
        return bigList;
    }
}
