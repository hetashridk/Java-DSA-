// Topological Sort using DFS

import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSortingDFS {
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

    }

    public static void topoSortDFS(ArrayList<Edge> graph[]){  //TC:- O(V + E)
        boolean visited[] = new boolean[graph.length];
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < graph.length; i++){
            if(!visited[i]){
                topologicalSortingDFS(graph, i, visited, stack);
            }
        }

        // for removing/popping out
        while(!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
    }

    public static void topologicalSortingDFS(ArrayList<Edge> graph[], int curr, boolean[] visited, Stack<Integer>stack){
        visited[curr] = true;

        for(int i = 0; i < graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!visited[e.dest]){
                topologicalSortingDFS(graph, e.dest, visited, stack);
            }
        }

        stack.push(curr);
    }

    public static void main(String[] args) {

        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        create(graph);
        topoSortDFS(graph);

        
    }
}
