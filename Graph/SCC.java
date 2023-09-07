// Finding strongly connected components by using "Kosaraju's Algo"

import java.util.ArrayList;
import java.util.Stack;

public class SCC {
    public static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    public static void create(ArrayList<Edge> graph[]) {

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // for 0 vertex
        graph[0].add(new Edge(0, 2, 1));
        graph[0].add(new Edge(0, 3, 1));

        // for 1 vertex
        graph[1].add(new Edge(1, 0, 1));

        // for 2 vertex
        graph[2].add(new Edge(2, 1, 1));

        // for 3 vertex
        graph[3].add(new Edge(3, 4, 1));

    }

    public static void topologicalSortingDFS(ArrayList<Edge> graph[], int curr, boolean[] visited, Stack<Integer> stack) {   
        //TC:- O(V + E)
        visited[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!visited[e.dest]) {
                topologicalSortingDFS(graph, e.dest, visited, stack);
            }
        }

        stack.push(curr);
    }

    public static void dfs(ArrayList<Edge>[] graph, int curr, boolean visited[], Stack<Integer> stack){  
        // visited
        visited[curr] = true;
        System.out.print(curr + " ");

        for(int i = 0; i < graph[curr].size(); i++){
            Edge e =  graph[curr].get(i);
            if(!visited[e.dest]){
                dfs(graph, e.dest, visited, stack);
            }
        }
    }

    public static void kosaraju(ArrayList<Edge> graph[], int V) {    //TC:- O(V + E)
        Stack<Integer> stack = new Stack<>();
        boolean visited[] = new boolean[V];

        // step 1:- get node in stack - topological sort
        // TC:- O(V + E) => TOPOLOGICAL SORT
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                topologicalSortingDFS(graph, i, visited, stack);
            }
        }

        // Step 2:- Transpose the graph  
        // TC:- O(V + E) => CREATING THE TRANSPOSE GRAPH
        ArrayList<Edge> Transpose[] = new ArrayList[V];
        for (int i = 0; i < graph.length; i++) {
            visited[i] = false;
            Transpose[i] = new ArrayList<>();
        }

        for(int i = 0; i < V; i++){
            for(int j = 0; j < graph[i].size(); j++){
                Edge e = graph[i].get(j);
                Transpose[e.dest].add(new Edge(e.dest, e.src, e.wt));   //reversing the edge
            }
        }

        //Step 3:- do DFS to stack node on transpose graph
        // TC:- O(V + E) => DFS
        while(!stack.isEmpty()) {
            int curr = stack.pop();
            if(!visited[curr]){
                System.out.print("SSC ->");
                dfs(Transpose, curr, visited, stack);
                System.out.println();
            }
        }

    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        create(graph);
        kosaraju(graph, V);
    }
}
