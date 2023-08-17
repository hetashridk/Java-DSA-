import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Bipartile {
    
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

        // for 4 vertex
        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));

    }

    public static boolean isPartile(ArrayList<Edge> [] graph){   //TC:- O(V + E), SC:- O(V) -> as we have taken extra space for queue and color array

        // color array
        int color[] = new int[graph.length];

        // give value as -1 (no color) to all index in array
        for(int i = 0; i < color.length; i++){
            color[i] = -1;
        }

        // making of queue
        Queue<Integer> q = new LinkedList<>();

        // BFS
        for(int i = 0; i < graph.length; i++){
            if(color[i] == -1){
                q.add(i);
                color[i] = 0;  //blue color assigning

                while(!q.isEmpty()){

                    // remove from queue
                    int curr = q.remove();

                    // check for neigbour color
                    for(int j = 0; j < graph[curr].size(); j++){

                        // e.destination that is finding/getting neigbour
                        Edge e = graph[curr].get(j);

                        // cases
                        if(color[e.dest] == -1){
                            int nextCol = color[curr] == 0 ? 1 : 0;

                            // assign color to new node
                            color[e.dest] = nextCol;

                            //adding that node in queue
                            q.add(e.dest);
                        }
                        // case 1
                        else if(color[e.dest] == color[curr]){
                            // not bipartile
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        create(graph);
        System.out.println(isPartile(graph));
    }
}
