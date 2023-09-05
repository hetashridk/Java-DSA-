import java.util.ArrayList;
import java.util.Collections;

public class KrushalAlgo {

    public static class Edge implements Comparable<Edge>{
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt){
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }

        @Override
        public int compareTo(Edge e2){
            return this.wt - e2.wt;
        }
    }

    public static void createGraph(ArrayList<Edge> edges){
        edges.add(new Edge(0, 1, 10));
        edges.add(new Edge(0, 2, 15));
        edges.add(new Edge(0, 3, 30));
        edges.add(new Edge(1, 3, 40));
        edges.add(new Edge(2, 3, 40));
        // edges.add(new Edge(0, 1, 10));
    }

    static int n = 4; //vertex
    static int parent[] = new int[n];
    static int rank[] = new int[n];

    //intialization function
    public static void init(){
        for(int i = 0; i < n; i++){
            parent[i] = i;
        }
    }

    public static int find(int x){
        if(x == parent[x]){
            return x;
        }

        // return find(parent[x]);
            //or
        return parent[x] = find(parent[x]);
    }

    public static void union(int a, int b){
        int parentA = find(a);
        int parentB = find(b);

        if(rank[parentA] == rank[parentB]){
            parent[parentB] = parentA;
            rank[parentA]++;
        }
        else if(rank[parentA] < rank[parentB]){
            parent[parentA] = parentB;
        }
        else{
            parent[parentB] = parentA;
        }
    }

    public static int krushal(ArrayList<Edge> edges, int V){
        init();
        Collections.sort(edges);

        int mstcost = 0;
        int count = 0;

        for(int i = 0; count < V - 1; i++){
            Edge e = edges.get(i);

            int parentA = find(e.src);
            int parentB = find(e.dest);

            if(parentA != parentB){
                union(e.src, e.dest);
                mstcost += e.wt;
                count++;
            }
        }

        return mstcost;
    }
    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge> edges = new ArrayList<>();
        createGraph(edges);
        System.out.println(krushal(edges, V));
    }
}
