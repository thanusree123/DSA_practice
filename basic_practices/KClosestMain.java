package basic_practices;
import java.util.*;
public class KClosestMain {
    public static int[][] kClosest(int[][] points, int k) {

        PriorityQueue<int[]> pq = new PriorityQueue<int[]>(
            (int[] a, int[] b) -> {
                int distanceA = a[0] * a[0] + a[1] * a[1];
                int distanceB = b[0] * b[0] + b[1] * b[1];

                return Integer.compare(distanceB, distanceA);
            }
        );

        // Add points and keep only the k closest
        for (int[] point : points) {
            pq.add(point);

            if (pq.size() > k) {
                pq.poll();
            }
        }

        // Store the remaining k points
        int[][] result = new int[k][2];

        for (int i = 0; i < k; i++) {
            result[i] = pq.poll();
        }

        return result;
    }

    public static void main(String[] args) {

        int[][] points = {
            {1, 3},
            {-2, 2},
            {5, 8},
            {0, 1}
        };

        int k = 2;

        int[][] result = kClosest(points, k);

        System.out.println("The " + k + " closest points are:");

        for (int[] point : result) {
            System.out.println(Arrays.toString(point));
        }
    }
    
}
