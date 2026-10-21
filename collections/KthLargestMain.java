
import java.util.*;

class KthLargest {
    private PriorityQueue<Integer> pq;
    private int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        pq = new PriorityQueue<>();

        for (int num : nums) {
            pq.add(num);

            if (pq.size() > k) {
                pq.poll();
            }
        }
    }

    public int add(int val) {
        pq.add(val);

        if (pq.size() > k) {
            pq.poll();
        }

        return pq.peek();
    }
}

public class KthLargestMain {
    public static void main(String[] args) {
        KthLargest kth = new KthLargest(3, new int[]{4, 5, 8, 2});

        System.out.println(kth.add(3));
        System.out.println(kth.add(10));
        System.out.println(kth.add(9));
        System.out.println(kth.add(4));
    }
}
