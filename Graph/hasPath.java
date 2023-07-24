import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class hasPath {

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
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        // for 1 vertex
        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        // for 2 vertex
        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        // for 3 vertex
        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        // for 4 vertex
        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));
        
        // for 5 vertex
        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));
        
        // for 6 vertex
        graph[6].add(new Edge(6, 5, 1));

    }

    public static boolean HasPath(ArrayList<Edge>[] graph, int src, int dest, boolean visited[]){
        if(src == dest){
            return true;
        }
        visited[src] = true;

        for(int i = 0; i < graph[src].size(); i++){
            Edge e = graph[src].get(i);

            // neigbour = e.dest
            if(!visited[e.dest] && HasPath(graph, e.dest, dest, visited)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edge> graph[] = new ArrayList[V];
        create(graph);
        System.out.println(HasPath(graph, 0, 7, new boolean[V]));
    }
}
