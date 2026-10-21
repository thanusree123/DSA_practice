import java.util.*;
public class kth_element_in_a_array {
    public static void main(String args[]){
        int nums[]={3,2,1,5,6,4};
        int k=2;
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
        }
        while(k>0){
            int element=pq.poll();
            k--;
            if(k==0){
                System.out.print(element);
            }
        }

    }
}
