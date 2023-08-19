// All path from src to dest/target in directed graph using DFS

import java.util.ArrayList;

public class Path {
    
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

        
        // for 5 vertex
        graph[5].add(new Edge(5, 0, 1));
        graph[5].add(new Edge(5, 2, 1));

        // for 2 vertex
        graph[2].add(new Edge(2, 3, 1));

        // for 3 vertex
        graph[3].add(new Edge(3, 1, 1));

        // for 4 vertex
        graph[4].add(new Edge(4, 0, 1));
        graph[4].add(new Edge(4, 1, 1));
        
        // for 0 vertex
        graph[0].add(new Edge(0, 3, 1));

    }

    public static void pathDirectedGraph(ArrayList<Edge>[] graph, int src, int dest, String path){

        // base case
        if(src == dest){
            System.out.println(path + dest);
            return;
        }

        for(int i = 0; i <  graph[src].size(); i++){
            Edge e = graph[src].get(i);

            pathDirectedGraph(graph, e.dest, dest, path + src);            
        }
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        create(graph);
        pathDirectedGraph(graph, 5, 1, "");
    }

}
