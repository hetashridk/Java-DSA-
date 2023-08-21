import java.util.ArrayList;

public class BellmanFord {
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
        graph[1].add(new Edge(1, 2, -4));

        // for 2 vertex
        graph[2].add(new Edge(2, 3, 2));

        // for 3 vertex
        graph[3].add(new Edge(3, 4, 4));

        // for 4 vertex
        graph[4].add(new Edge(4, 1, -1));

    }

    public static void bellmanFord(ArrayList<Edge>[] graph, int src){
        int distance[] = new int[graph.length];

        for(int i = 0; i < distance.length; i++){
            if(i != src){
                distance[i] = Integer.MAX_VALUE;
            }
        }

        int V = graph.length;

        for(int i = 0; i < V - 1; i++){
            for(int j = 0; j < graph.length; j++){
                for(int k = 0; k <  graph[j].size(); k++){
                    Edge e =  graph[j].get(k);

                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;

                    // relaxation step
                    if(distance[u] != Integer.MAX_VALUE && distance[u] + wt < distance[v]){
                        distance[v] = distance[u] + wt;
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
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        create(graph);
        bellmanFord(graph, 0);
    }
}
