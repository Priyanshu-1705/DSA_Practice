package A2Z_Sheet.Step13.Lec2;

import A2Z_Sheet.Step13.Lec1.TreeNode;
import java.util.*;


public class BottomView {
    class Pair1 {
        TreeNode node;
        int hd;

        Pair1(TreeNode node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    public ArrayList<Integer> bottomView(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) return result;

        TreeMap<Integer, Integer> map = new TreeMap<>();
        Queue<Pair1> queue = new LinkedList<>();

        queue.offer(new Pair1(root, 0));

        while (!queue.isEmpty()) {
            Pair1 p = queue.poll();
            TreeNode node = p.node;
            int hd = p.hd;

            // 🔥 overwrite → keeps bottom-most node
            map.put(hd, node.val);

            if (node.left != null) {
                queue.offer(new Pair1(node.left, hd - 1));
            }
            if (node.right != null) {
                queue.offer(new Pair1(node.right, hd + 1));
            }
        }

        result.addAll(map.values());
        return result;
    }
}

