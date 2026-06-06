import java.util.*;
class Node{
    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;

    }
}
class Binarytree{
    Node root;
    public Binarytree(){
        this.root=null;
    }
public void dfs(){
    if(root==null) return;
Stack<Node> stack=new Stack<>();
stack.push(root);
while(!stack.isEmpty()){
    Node current =stack.pop();
    System.out.print(current.data+" ");
    if(current.right!=null) stack.push(current.right);
    if(current.left!=null) stack.push(current.left);
}
}
}
class treesDfs{
public static void main(String args[]){
    Binarytree tree=new Binarytree();
    tree.root=new Node(10);
    tree.root.left=new Node(5);
    tree.root.right=new Node(15);
    tree.root.left.left=new Node(2);
    tree.root.left.right=new Node(7);
    System.out.print("dfs ");
    tree.dfs();System.out.println();
    
}
}