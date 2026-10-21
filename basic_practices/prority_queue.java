package basic_practices;
import java.util.*;
public class prority_queue {
    public static void main(String args[]){
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(40);
        pq.add(10);
        pq.add(30);
        pq.add(20);
        pq.add(10);

        System.out.println(pq.peek());

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
    
}
