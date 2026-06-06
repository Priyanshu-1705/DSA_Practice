package A2Z_Sheet.Step13.Lec1;
import java.util.*;

class Pair {
    TreeNode node;
    int state;
    Pair(TreeNode node, int state) {
        this.node = node;
        this.state = state;
    }
}

class PreInPost {
    public void allTraversals(TreeNode root) {
        List<Integer> pre = new ArrayList<>();
        List<Integer> in = new ArrayList<>();
        List<Integer> post = new ArrayList<>();
        if (root == null) return;
        Stack<Pair> stack = new Stack<>();
        stack.push(new Pair(root, 1));
        while (!stack.isEmpty()) {
            Pair p = stack.pop();
            // Preorder
            if (p.state == 1) {
                pre.add(p.node.val);
                p.state++;
                stack.push(p);
                if (p.node.left != null) {
                    stack.push(new Pair(p.node.left, 1));
                }
            }
            // Inorder
            else if (p.state == 2) {
                in.add(p.node.val);
                p.state++;
                stack.push(p);

                if (p.node.right != null) {
                    stack.push(new Pair(p.node.right, 1));
                }
            }
            // Postorder
            else {
                post.add(p.node.val);
            }
        }
        System.out.println("Preorder: " + pre);
        System.out.println("Inorder: " + in);
        System.out.println("Postorder: " + post);
    }
}
