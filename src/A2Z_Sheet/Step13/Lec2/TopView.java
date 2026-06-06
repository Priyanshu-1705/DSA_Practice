package A2Z_Sheet.Step13.Lec2;

import A2Z_Sheet.Step13.Lec1.TreeNode;
import java.util.*;

class Pair {
    TreeNode node;
    int hd;

    Pair(TreeNode node, int hd) {
        this.node = node;
        this.hd = hd;
    }
}
public class TopView {
    public ArrayList<Integer> topView(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) return result;

        TreeMap<Integer, Integer> map = new TreeMap<>(); //Stores hd and first node value
        Queue<Pair> queue = new LinkedList<>();

        queue.offer(new Pair(root, 0));

        while (!queue.isEmpty()) {
            Pair p = queue.poll();
            TreeNode node = p.node;
            int hd = p.hd;

            // Only first occurrence (topmost)
            if (!map.containsKey(hd)) {
                map.put(hd, node.val);
            }

            if (node.left != null) {
                queue.offer(new Pair(node.left, hd - 1));
            }
            if (node.right != null) {
                queue.offer(new Pair(node.right, hd + 1));
            }
        }

        for (int val : map.values()) {
            result.add(val);
        }

        return result;
    }
}
