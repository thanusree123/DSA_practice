 import java.util.*;
 public class levelordertraversal{
    static class Node{
        int data;
        Node right;
        Node left;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static List<List<Integer>>levelorder(Node root){
        List<List<Integer>> result=new ArrayList<>();
        if(root==null) return result;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int levelsize=q.size();
            List<Integer> currentrow=new ArrayList<>();
            for(int i=0;i<levelsize;i++){
                Node current=q.poll();
                currentrow.add(current.data);
                if(current.left!=null) q.add(current.left);
                if(current.right!=null) q.add(current.right);
            }
            result.add(currentrow);
        }
        return result;
    }
 
    public static void main(String args[]){
        Node root=new Node(10);
        root.left=new Node(5);
        root.right=new Node(15);
        root.left.left=new Node(2);
        root.left.right=new Node(7);
       List<List<Integer>> finalresult= levelorder(root);
       System.out.print(finalresult);

    }
 }