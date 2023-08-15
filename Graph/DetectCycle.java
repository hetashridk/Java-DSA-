// Detect cycle in undirected graph
import java.util.ArrayList;

public class DetectCycle {

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
        // here graph length = V = 7

        //  Here Arraylist is null
        // null:- undefined
        // null means:- defined nathi ke tyar su store che:- linked list store che, aarraylist store che...
        // so convert it into empty arraylist
        // but we want arraylist as empty.. so below step will do Arraylist empty
        for(int i = 0; i < graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        // storing edges of each vertex in each index of vertex
        
        // for 0 vertex
        graph[0].add(new Edge(1, 0, 1));
        graph[0].add(new Edge(1, 2, 1));

        // for 1 vertex
        graph[1].add(new Edge(0, 1, 1));
        graph[1].add(new Edge(0, 2, 1));
        graph[1].add(new Edge(0, 3, 1));

        // for 2 vertex
        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 1, 1));

        // for 3 vertex
        graph[3].add(new Edge(3, 0, 1));
        graph[3].add(new Edge(3, 4, 1));

        // for 4 vertex
        graph[4].add(new Edge(4, 3, 1));


    }

public static boolean detectCycle(ArrayList<Edge>[] graph){
    boolean visited[] = new boolean[graph.length];

    // if cycle in either of the components/parts
    for(int i = 0; i < graph.length; i++){
        if(!visited[i]){
            detectCycleUtil(graph, visited, i, -1);
            return true;
        }
    }
    return false;
}

public static boolean detectCycleUtil(ArrayList<Edge>[] graph, boolean visited[], int curr, int parent){
    visited[curr] = true;

    for(int i = 0; i < graph[curr].size(); i++){
        Edge e = graph[curr].get(i);

        // case 3
        if(!visited[e.dest]){
            if(detectCycleUtil(graph, visited, e.dest, curr)){
                return true;
            }
        }
        else if(visited[e.dest] && e.dest != parent){
            return true;
        }
    }
    return false;
}
    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        System.out.println(detectCycle(graph));
 
    }
}
