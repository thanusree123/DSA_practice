import java.util.*;

class bfs {

    static void bfss(int start,
                    boolean visited[],
                    ArrayList<ArrayList<Integer>> graph) {

        Queue<Integer> q = new LinkedList<>();

        q.add(start);

        visited[start] = true;

        while (!q.isEmpty()) {

            int node = q.poll();

            System.out.print(node + " ");

            for (int neighbor : graph.get(node)) {

                if (!visited[neighbor]) {

                    visited[neighbor] = true;

                    q.add(neighbor);
                }
            }
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        System.out.print("Enter number of edges: ");
        int e = sc.nextInt();

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        System.out.println("Enter edges:");

        for (int i = 0; i < e; i++) {

            int u = sc.nextInt();
            int v = sc.nextInt();

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        boolean visited[] = new boolean[n];

        System.out.print("BFS Traversal: ");

        bfss(0, visited, graph);
    }
}