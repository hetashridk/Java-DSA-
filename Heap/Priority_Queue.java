import java.util.PriorityQueue;

public class Priority_Queue{
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
            pq.add(97);
            pq.add(-2);
            pq.add(47);
            pq.add(10);
            pq.add(1);
            pq.add(54);

            while(!pq.isEmpty()){
                System.out.println(pq.peek());
                pq.remove();
            }
    }
}