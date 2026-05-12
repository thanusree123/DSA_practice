import java.util.*;
class dfs{
    static void dfss(int node,boolean visited[],ArrayList<ArrayList<Integer>>graph){
        visited[node]=true;
        System.out.print(node+" ");
        for(int neighbour:graph.get(node)){
            if(!visited[neighbour]){
                dfss(neighbour,visited,graph);
            }
        }
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int e=s.nextInt();
        ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
       for(int i=0;i<n;i++){
        graph.add(new ArrayList<>());
       }
        for(int i=0;i<e;i++){
            int u=s.nextInt();
            int v=s.nextInt();
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        boolean visited[]=new boolean[n];
        System.out.print("dfs traversal");
        dfss(0,visited,graph);

    }
}