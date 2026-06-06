package A2Z_Sheet.Step14;
//Ps:230
import A2Z_Sheet.Step13.Lec1.TreeNode;

public class KthSmallestInBST {

    //Brute force - make a list by performing inorder traversal then return (k - 1) element from list
    //also can done with stack

    //Optimal
    int count = 0;
    int result = -1;

    public int kthSmallest(TreeNode root, int k) {
        inorder(root, k);
        return result;
    }

    private void inorder(TreeNode root, int k) {
        if (root == null || count >= k) return;
        inorder(root.left, k);
        count++;
        if (count == k) {
            result = root.val;
            return;
        }
        inorder(root.right, k);
    }

}
