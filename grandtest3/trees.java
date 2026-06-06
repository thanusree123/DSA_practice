public class trees{
static  class Node{
    int data;
    Node right;
    Node left;
    public Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }

}

    public static void main(String arg[]){
        Node root=new Node(10);
        root.left=new Node(5);
        root.right=new Node(8);
        root.left.left=new Node(4);
        System.out.println(root.data);
        System.out.println(root.left.data);
        System.out.println(root.right.data);
        System.out.println(root.left.left.data);


    }
}
