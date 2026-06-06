import java.util.*;
public class maxdepth{
 static class Node{
    int data;
    Node right;
    Node left;
    public Node(int data){
        this.data=data;
        this.right=null;
        this.left=null;
    }
}
public static int maxdepth(Node root){
    if(root==null) return 0;
Queue<Node>q =new LinkedList<>();
q.add(root);
int depth=0;
while(!q.isEmpty()){
    int levelsize=q.size();
    for(int i=0;i<levelsize;i++){
        Node current=q.poll();
        if(current.left!=null){
            q.add(current.left);
        }
        if(current.right!=null){
            q.add(current.right);
        }
    }
        depth++;
}
return depth;
}

    public static void main(String args[]){
        Node root=new Node(10);
        root.left=new Node(5);
        root.right=new Node(15);
        root.left.left=new Node(2);
        root.left.right=new Node(7);
        int depth=maxdepth(root);
        System.out.print(depth);
    

    }
}