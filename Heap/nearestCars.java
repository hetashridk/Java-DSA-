import java.util.PriorityQueue;

public class nearestCars {

    public static class Point implements Comparable<Point>{
        int x;
        int y;
        int index;
        int distsq;

        public Point(int x, int y, int index, int distsq){
            this.x = x;
            this.y = y;
            this.index = index;
            this.distsq =distsq;
        }

        @Override
        public int compareTo(Point p2){
            return this.distsq - p2.distsq;
        }
    }
 public static void main(String[] args) {
    int points[][] = {{3, 3},
                      {5, -1},
                      {-2, 4}};
    int k = 2;

    PriorityQueue<Point> pq = new PriorityQueue<>();
    for(int i = 0; i < points.length; i++){
        int distsq = points[i][0] * points[i][0] + points[i][1] * points[i][1];
        pq.add(new Point(points[i][0], points[i][1], i, distsq));
    }

    // nearest K cars
    for(int i = 0; i < k; i++){
        System.out.println("C" + pq.remove().index);
    }

 }    
}
