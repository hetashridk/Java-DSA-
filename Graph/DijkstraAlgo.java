import java.util.ArrayList;
import java.util.PriorityQueue;

public class DijkstraAlgo {
    public static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt){
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    public static void create(ArrayList<Edge> graph[]){

        for(int i = 0; i < graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        
        
        // for 0 vertex
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        // for 1 vertex
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 7));

        // for 2 vertex
        graph[2].add(new Edge(2, 4, 3));

        // for 3 vertex
        graph[3].add(new Edge(3, 5, 1));

        // for 4 vertex
        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));

    }

    public static class Pair implements Comparable<Pair>{
        int node;
        int path; //dist

        public Pair(int node, int path){
            this.node = node;
            this.path = path;
        }

        @Override
        public int compareTo(Pair p2){
            return this.path - p2.path;   //sort according to smallest distance
        }
    }

    public static void dijkstra(ArrayList<Edge>[] graph, int src){  //TC:- O(V + E logV)
        int distance[] = new int[graph.length];

        for(int i = 0; i <  graph.length; i++){
            if(i != src){
                distance[i] = Integer.MAX_VALUE;
            }
        }

        boolean visited[] = new boolean[graph.length];

        PriorityQueue<Pair>pq = new PriorityQueue<>();
        pq.add(new Pair(src, 0));

        while(!pq.isEmpty()){
            Pair curr = pq.remove();

            if(!visited[curr.node]){
                visited[curr.node] = true;

                // neigbours finding
                for(int i = 0; i < graph[curr.node].size(); i++){
                    Edge e = graph[curr.node].get(i);
    
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;

                    if(distance[u] + wt < distance[v]){
                        distance[v] = distance[u] + wt;

                        // adding in priority queue
                        pq.add(new Pair(v, distance[v]));
                    }
                }
            }
        }

        // printing distance of all nodes/vertex
        for(int i = 0; i < distance.length; i++){
            System.out.println("0 to " + i + " -> " + distance[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        create(graph);
        dijkstra(graph, 0);
    }
}
