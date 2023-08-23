import java.util.ArrayList;

// this is other method to calculate edge and then bellman ford but the TC will be same in both case
public class BellmanFord2 {
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

    public static void create(ArrayList<Edge> graph){

        graph.add(new Edge(0, 1, 2));
        graph.add(new Edge(0, 2, 4));

        graph.add(new Edge(1, 2, -4));

        graph.add(new Edge(2, 3, 2));

        graph.add(new Edge(3, 4, 4));

        graph.add(new Edge(4, 1, -1));

    }

    public static void bellmanFord(ArrayList<Edge> graph, int src, int V){
        int distance[] = new int[V];

        for(int i = 0; i < distance.length; i++){
            if(i != src){
                distance[i] = Integer.MAX_VALUE;
            }
        }

        // O(V*E)
        // algo:- O(V)
        for(int i = 0; i < V - 1; i++){
            // edges:- O(E)
            for(int j = 0; j < graph.size(); j++){

                    Edge e =  graph.get(j);

                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;

                    // relaxation step
                    if(distance[u] != Integer.MAX_VALUE && distance[u] + wt < distance[v]){
                        distance[v] = distance[u] + wt;
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
        int V = 5;
        ArrayList<Edge> edges = new ArrayList<>();
        create(edges);
        bellmanFord(edges, 0, V);
    }
}
