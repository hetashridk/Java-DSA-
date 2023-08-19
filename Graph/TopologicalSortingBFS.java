// Topological Sort using BFS - Kahn's Algo

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import javax.management.Query;

public class TopologicalSortingBFS {
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

    public static void topoSortBFS(ArrayList<Edge> graph[]){  //TC:- O(V + E)
        int[] indegree = new int[graph.length];
        Queue<Integer> queue = new LinkedList<>();

        Indegree(graph, indegree);
        
        for(int i = 0; i < indegree.length; i++){
            if(indegree[i] == 0){
                queue.add(i);
            }
        }

        // BFS
        while (!queue.isEmpty()) {

            // remove from queue and add/print it in output
            int curr  = queue.remove();
            System.out.print(curr + " ");

            for(int i = 0; i < graph[curr].size(); i++){
                Edge e = graph[curr].get(i);

                // decrease indeg of neigbour node/vertex by 1
                indegree[e.dest]--;
                if(indegree[e.dest] == 0){
                    queue.add(e.dest);
                }
            }
        }
    }

    // to claculate indegree of all vertex/node and store it in indegree array
    public static void Indegree(ArrayList<Edge> graph[], int indegree[]){
        for(int i = 0; i < graph.length; i++){
            int vertex = i;
            for(int j = 0; j <  graph[vertex].size(); j++){
                Edge e = graph[vertex].get(j);
                indegree[e.dest]++;
            }
        }
    }

    public static void main(String[] args) {

        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        create(graph);
        topoSortBFS(graph);

        
    }
}
