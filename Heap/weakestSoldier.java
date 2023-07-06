import java.util.PriorityQueue;

public class weakestSoldier {

    public static class Soldier implements Comparable<Soldier>{
        int index;
        int soldier;

        public Soldier(int index, int soldier){
            this.index = index;
            this.soldier = soldier;
        }

        @Override
        public int compareTo(Soldier r2){
            if(this.soldier == r2.soldier){
                return this.index - r2.index;
            }
            else{
                return this.soldier - r2.soldier;
            }
        }
    }
    public static void main(String[] args) {
        int army[][] = {{1, 0, 0, 0},
                        {1, 1, 1, 1},
                        {1, 0, 0, 0},
                        {1, 0, 0, 0}};
        
        int k = 2;

        PriorityQueue<Soldier> pq = new PriorityQueue<>();

        for(int i = 0; i < army.length; i++){
            int count = 0;
            for(int j = 0; j < army[0].length; j++){
                count += army[i][j] == 1 ?  1 : 0;
            }
            pq.add(new Soldier(count, i));
        }

        for(int i = 0; i < k; i++){
            System.out.println("R" + pq.remove().index);
        }
    }
}
