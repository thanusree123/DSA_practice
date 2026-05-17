import java.util.*;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val=val;
    }
}
class maxdepth {
    public static int maxDepth(TreeNode root) {
    if(root==null){
    return 0;
    }
    int left=maxDepth(root.left);
    int right=maxDepth(root.right);
    return 1+Math.max(left,right);
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int rootval=s.nextInt();
        TreeNode root=new TreeNode(rootval);
        root.left=new TreeNode(s.nextInt());
        root.right=new TreeNode(s.nextInt());
        root.left.left=new TreeNode(s.nextInt());
        root.left.right=new TreeNode(s.nextInt());
        root.right.right=new TreeNode(s.nextInt());
        root.right.left=new TreeNode(s.nextInt());
        int ans=maxDepth(root);
        System.out.print(ans);
    }
}