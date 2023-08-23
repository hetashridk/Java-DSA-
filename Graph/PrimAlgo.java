// Here we will find minimum cost

import java.util.ArrayList;
import java.util.PriorityQueue;

public class PrimAlgo {

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
        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));

        // for 1 vertex
        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 40));

        // for 2 vertex
        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 3, 50));

        // for 3 vertex
        graph[3].add(new Edge(3, 0, 30));
        graph[3].add(new Edge(3, 1, 40));
        graph[3].add(new Edge(3, 2, 50));

    }

    public static class Pair implements Comparable<Pair>{
        int vertex;
        int cost;

        public Pair(int vertex, int cost){
            this.vertex = vertex;
            this.cost = cost;
        }

        @Override
        public int compareTo(Pair p2){
            return this.cost - p2.cost;
        }
    }

    public static void Prim(ArrayList<Edge>[] graph){   //TC:- O(ElogE)
        boolean visited[] = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        pq.add(new Pair(0, 0));
        int finalCost = 0;

        while(!pq.isEmpty()){
            Pair curr = pq.remove();

            if(!visited[curr.vertex]){
                visited[curr.vertex] = true;
                finalCost += curr.cost;

                for(int i = 0; i < graph[curr.vertex].size(); i++){
                    Edge e = graph[curr.vertex].get(i);
                    pq.add(new Pair(e.dest, e.wt));
                }
            }
        }

        System.out.println("Minimum weight/cost is " + finalCost);
    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        create(graph);
        Prim(graph);
    }
    
}
