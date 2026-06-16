import java.util.*;
class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val=val;
    }
}
class slow_fastpointer{
    public static ListNode middlenode(ListNode head){
        ListNode slow=head;
         ListNode fast=head;
         while(fast!=null &&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
         }
         return slow;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        ListNode head=null;
        ListNode tail=null;
        for(int i=0;i<n;i++){
            int val=s.nextInt();
            ListNode newNode=new ListNode(val);
            if(head==null){
                head=newNode;
                tail=newNode;
            }else{
                tail.next=newNode;
                tail=newNode;
            }
        }
        ListNode middle= middlenode(head);
        System.out.print(middle.val);

    }
}