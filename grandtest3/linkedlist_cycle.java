import java.util.*;
class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val=val;
    }
}
class linkedlist_cycle{
    public static boolean cycle(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        ListNode head=null;
        ListNode tail=null;
        for(int i=0;i<n;i++){
            int val=s.nextInt();
            ListNode newNode =new ListNode(val);
            if(head==null){
                head=newNode;
                tail=newNode;
            }
            else{
                tail.next=newNode;
                tail=newNode;
            }
        }
        boolean  ans =cycle(head);
        System.out.print(ans);
    }

}