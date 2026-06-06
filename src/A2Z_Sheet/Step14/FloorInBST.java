package A2Z_Sheet.Step14;

import A2Z_Sheet.Step13.Lec1.TreeNode;

public class FloorInBST {
    public int floorInBST(TreeNode root, int key) {
        int floor = -1;
        while (root != null) {
            if (root.val == key) {
                floor = root.val;
                return floor;
            }
            if (root.val > key) {
                root = root.left;
            } else {
                floor = root.val;
                root = root.right;
            }
        }
        return floor;
    }

    public int ceilInBST(TreeNode root, int x) {
        int ceil = -1;
        while (root != null) {
            if (root.val == x) {
                ceil = root.val;
                return ceil;
            }
            if (root.val < x) {
                root = root.right;
            } else {
                ceil = root.val;
                root = root.left;
            }
        }
        return ceil;
    }
}
