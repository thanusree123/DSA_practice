package basic_practices;
import java.util.*;
public class merge_k_sorted_list {
    public static class listnode{
        int val;
        listnode next ;
        listnode(int val){
            this.val=val;
        }

    }
    public static void main(String args[]){
        listnode a=new listnode(1);
        a.next=new listnode(4);
        a.next.next=new listnode(5);
        listnode b=new listnode(1);
        b.next=new listnode(3);
        b.next.next=new listnode(4);
        listnode c=new listnode(2);
        c.next=new listnode(6);
        listnode[] lists={a,b,c};
        PriorityQueue<listnode>pq=new PriorityQueue<>((x,y)->Integer.compare(x.val,y.val));
        for(listnode node:lists){
            if(node!=null){
                pq.add(node);
            }

        }
        listnode dummy=new listnode(0);
        listnode current=dummy;
        while(!pq.isEmpty()){
            listnode smallest=pq.poll();
            current.next=smallest;
            current=current.next;
            if(smallest.next!=null){
                pq.add(smallest.next);
            }
        }
        current.next=null;
        listnode result=dummy.next;
        while(result!=null){
            System.out.print(result.val);
            if(result.next!=null){
                System.out.print("->");
            }
            result=result.next;
        }
        System.out.println();
    }
    
}
