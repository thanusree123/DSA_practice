import java.util.*;
public class last_stone {
    public static void main(String args[]){
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        int arr[]={2, 7, 4, 1, 8, 1};
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }
        while(pq.size()>1){
            int y=pq.poll();
            int x=pq.poll();
            if(y!=x){
                pq.add(y-x);
            }
        }
        if(pq.isEmpty()){
            System.out.print(0);
        }
        else{
            System.out.print(pq.poll());
        }
    }
    
}
