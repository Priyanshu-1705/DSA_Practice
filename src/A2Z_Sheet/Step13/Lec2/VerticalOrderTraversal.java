package A2Z_Sheet.Step13.Lec2;
//Ps:987

import A2Z_Sheet.Step13.Lec1.TreeNode;
import java.util.*;
public class VerticalOrderTraversal {
    public List<List<Integer>> verticalTraversal(TreeNode root) {

        // TreeMap is used to store nodes column-wise (sorted by horizontal distance)
        TreeMap<Integer, List<int[]>> map = new TreeMap<>();

        // Final result list
        List<List<Integer>> result = new ArrayList<>();

        // Start DFS traversal
        // hd = horizontal distance (column index)
        // level = depth of node (row index)
        helper(root, 0, 0, map);

        // Traverse each column in sorted order of hd
        for (int key : map.keySet()) {

            // Get all nodes in this vertical column
            List<int[]> list = map.get(key);

            // Sort nodes:
            // 1. First by level (top to bottom)
            // 2. If same level, then by node value (ascending)
            Collections.sort(list, (a, b) -> {
                if (a[0] == b[0])
                    return a[1] - b[1]; // compare values
                return a[0] - b[0];     // compare levels
            });

            // Extract only node values after sorting
            List<Integer> col = new ArrayList<>();
            for (int[] arr : list) {
                col.add(arr[1]); // arr[1] = node value
            }

            // Add this column to final result
            result.add(col);
        }

        return result;
    }

    // Helper function for DFS traversal
    private void helper(TreeNode root, int hd, int level,
                        TreeMap<Integer, List<int[]>> map) {

        // Base case
        if (root == null)
            return;

        // If this column (hd) is not present, create a new list
        map.putIfAbsent(hd, new ArrayList<>());

        // Store current node as {level, value}
        map.get(hd).add(new int[] { level, root.val });

        // Traverse left:
        // hd - 1 (move left column), level + 1 (go deeper)
        helper(root.left, hd - 1, level + 1, map);

        // Traverse right:
        // hd + 1 (move right column), level + 1 (go deeper)
        helper(root.right, hd + 1, level + 1, map);
    }
}
