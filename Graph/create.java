import java.util.ArrayList;

public class create {

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
    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];

        // Here Arraylist is null
        // null:- undefined
        // null means:- defined nathi ke tyar su store che:- linked list store che, aarraylist store che...
        // so convert it into empty arraylist
        // but we want arraylist as empty.. so below step will do Arraylist empty
        for(int i = 0; i < V; i++){
            graph[i] = new ArrayList<>();
        }

        // storing edges of each vertex in each index of vertex
        
        // for 0 vertex
        graph[0].add(new Edge(0, 1, 5));

        // for 1 vertex
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));

        // for 2 vertex
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 2));

        // for 3 vertex
        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 2, 1));

        // for 4 vertex
        graph[4].add(new Edge(4, 2, 2));


        // to store neigbour of a vertex 
        // TC:- O(constant)
        for(int i = 0; i < graph[2].size(); i++){  //store neigbour of 2
            Edge e = graph[2].get(i);
            System.out.println("2 -> " + e.dest);
        }
    }
}
