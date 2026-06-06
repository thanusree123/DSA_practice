import java.util.*;
class Node{
    int data;
    Node right;
    Node left;
    public Node(int data){
        this.data=data;
        this.right=null;
        this.left=null;
    }
}
class Binarytree{
    Node root;
    Binarytree(){
        this.root=null;
    }
    public void bfs(){
        if(root==null) return ;
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node current =q.poll();
            System.out.print(current.data+" ");
            if(current.left!=null) q.add(current.left);
            if(current.right!=null)q.add(current.right);
        }
    }
}
class treesBfs{
    public static void main(String args[]){
        Binarytree tree=new Binarytree();
        tree.root=new Node(10);
        tree.root.left=new Node(5);
        tree.root.right=new Node(15);
        tree.root.left.left=new Node(2);
        tree.root.left.right=new Node(7);
        tree.bfs();
        System.out.println();

    }
}