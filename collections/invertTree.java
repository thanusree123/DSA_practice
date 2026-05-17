import java.util.*;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) {
        this.val = val;
    }
}
public class invertTree {
    public static TreeNode invert(TreeNode root) {
        if(root == null) {
            return null;
        }
        // main logic
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invert(root.left);
        invert(root.right);
        return root;
    }
    public static void display(TreeNode root) {
        if(root == null) {
            return;
        }
        display(root.left);
        System.out.print(root.val + " ");
        display(root.right);
    }
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int rootval = s.nextInt();
        TreeNode root = new TreeNode(rootval);
        root.left = new TreeNode(s.nextInt());
        root.right = new TreeNode(s.nextInt());
        root.left.left = new TreeNode(s.nextInt());
        root.left.right = new TreeNode(s.nextInt());
        root.right.left = new TreeNode(s.nextInt());
        root.right.right = new TreeNode(s.nextInt());
        invert(root);
        display(root);
    }
}