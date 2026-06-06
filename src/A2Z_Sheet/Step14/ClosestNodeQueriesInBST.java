package A2Z_Sheet.Step14;
//Ps:2476

import A2Z_Sheet.Step13.Lec1.TreeNode;

import java.util.*;

public class ClosestNodeQueriesInBST {
    public List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {
        List<Integer> inorder = new ArrayList<>();

        // Step 1: Convert BST to sorted list
        inorderTraversal(root, inorder);

        List<List<Integer>> result = new ArrayList<>();

        // Step 2: Process each query
        for (int q : queries) {
            int floor = getFloor(inorder, q);
            int ceil = getCeil(inorder, q);

            result.add(Arrays.asList(floor, ceil));
        }

        return result;
    }

    // Inorder traversal → sorted list
    private void inorderTraversal(TreeNode root, List<Integer> list) {
        if (root == null) return;

        inorderTraversal(root.left, list);
        list.add(root.val);
        inorderTraversal(root.right, list);
    }

    // Binary search for floor (largest <= q)
    private int getFloor(List<Integer> list, int q) {
        int left = 0, right = list.size() - 1;
        int ans = -1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (list.get(mid) <= q) {
                ans = list.get(mid);
                left = mid + 1; // try bigger
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }

    // Binary search for ceil (smallest >= q)
    private int getCeil(List<Integer> list, int q) {
        int left = 0, right = list.size() - 1;
        int ans = -1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (list.get(mid) >= q) {
                ans = list.get(mid);
                right = mid - 1; // try smaller
            } else {
                left = mid + 1;
            }
        }

        return ans;
    }
}

