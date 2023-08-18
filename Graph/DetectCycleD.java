import java.util.ArrayList;

public class DetectCycleD {

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
        
        // no cycle
        // for 0 vertex
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        // for 1 vertex
        graph[1].add(new Edge(1, 3, 1));

        // for 2 vertex
        graph[2].add(new Edge(2, 3, 1));

               
        // cycle present
        // // for 0 vertex
        // graph[0].add(new Edge(0, 2, 1));

        // // for 1 vertex
        // graph[1].add(new Edge(1, 0, 1));

        // // for 2 vertex
        // graph[2].add(new Edge(2, 3, 1));

        // // for 3 vertex
        // graph[3].add(new Edge(3, 0, 1));
 
    }

    public static boolean isCycle(ArrayList<Edge>[] graph){
        boolean visited[] = new boolean[graph.length];
        boolean stack[] = new boolean[graph.length];

        for(int i = 0; i <  graph.length; i++){
            if(!visited[i]){
                if(isCycleUtil(graph, i, visited, stack)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isCycleUtil(ArrayList<Edge>[] graph, int curr, boolean visited[], boolean stack[]){
        visited[curr] = true;
        stack[curr] = true;

        for(int i = 0; i < graph[curr].size(); i++){
            Edge e = graph[curr].get(i);

            if(stack[e.dest]){
                // cycle present
                return true;
            }
            if(!visited[e.dest] && isCycleUtil(graph, e.dest, visited, stack)){
                // cycle present
                return true;
            }
        }

        stack[curr] = false;
        return false;
    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        create(graph);
        System.out.println(isCycle(graph));
    }
}
