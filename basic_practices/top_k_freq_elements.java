
package basic_practices;
import java.util.*;
public class top_k_freq_elements {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int k = s.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1: Count frequencies
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Create Max PriorityQueue
        PriorityQueue<Map.Entry<Integer, Integer>> pq =
            new PriorityQueue<>(
                (a, b) -> Integer.compare(b.getValue(), a.getValue())
            );

        // Step 3: Add HashMap entries to PriorityQueue
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            pq.add(entry);
        }

        // Step 4: Extract the top k frequent elements
        while (k > 0 && !pq.isEmpty()) {
            Map.Entry<Integer, Integer> entry = pq.poll();

            System.out.print(entry.getKey()+" ");

            k--;
        }

        s.close();
    }
}
