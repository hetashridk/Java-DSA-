import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CheapestFlights {

    public static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt){
            this.src = src;
            this. dest = dest;
            this.wt = wt;
        }
    }

    public static void createGraph(int flights[][], ArrayList<Edge> graph[]){
        for(int i = 0;i < graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        for(int i = 0; i <  flights.length; i++){
            int src = flights[i][0];
            int dest = flights[i][1];
            int wt = flights[i][2];

            Edge e = new Edge(src, dest, wt);
            graph[src].add(e);
        }
    }

    public static class Info{
        int vertex;
        int cost;
        int stops;

        public Info(int vertex, int cost, int stops){
            this.vertex = vertex;
            this.cost = cost;
            this.stops = stops;
        }
    }
    public static int cheapestFlights(int V, int src, int dest, int k, int flights[][]){
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(flights, graph);

        int dist[] = new int[V];
        for(int i = 0; i < V; i++){
            if(i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }

        Queue<Info> q = new LinkedList<>();
        q.add(new Info(0, 0, 0));

        while(!q.isEmpty()){
            Info curr = q.remove();

            if(curr.stops > k){
                break;
            }

            for(int i = 0; i < graph[curr.vertex].size(); i++){
                Edge e = graph[curr.vertex].get(i);
                int u = e.src;
                int v = e.dest;
                int wt = e.wt;


                // relaxation steps
                if(curr.cost + wt < dist[v] && curr.stops <= k){
                    dist[v] = curr.cost + wt;
                    q.add((new Info(v, dist[v], curr.stops + 1)));
                }
            }
        }

        if(dist[dest] == Integer.MAX_VALUE){
            return -1;
        }
        else{
            return dist[dest];
        }

    }
    public static void main(String[] args) {
        int V = 4;
        int src = 0;
        int dest = 3; 
        int k = 1;
        int flights[][] = {{0,1,100}, {1, 2, 100}, {2,0,100}, {1,3,600}, {2,3,200}};
        System.out.println(cheapestFlights(V, src, dest, k, flights));
    }
}
