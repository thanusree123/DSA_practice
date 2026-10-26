import java.util.*;
public class leastinterval {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];

        for (char task : tasks) {
            freq[task - 'A']++;
        }

        PriorityQueue<Integer> pq =
            new PriorityQueue<>(Collections.reverseOrder());

        for (int count : freq) {
            if (count > 0) {
                pq.offer(count);
            }
        }

        int cycle = n + 1;
        int time = 0;

        while (!pq.isEmpty()) {
            List<Integer> temp = new ArrayList<>();

            for (int i = 0; i < cycle; i++) {
                if (!pq.isEmpty()) {
                    int count = pq.poll() - 1;

                    if (count > 0) {
                        temp.add(count);
                    }
                }

                time++;

                if (pq.isEmpty() && temp.isEmpty()) {
                    break;
                }
            }

            for (int count : temp) {
                pq.offer(count);
            }
        }

        return time;
    }
    
}
