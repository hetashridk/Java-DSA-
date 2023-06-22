// implementation of queue using deque
import java.util.*;
public class queue_deque {
    static class Queue{
        Deque<Integer> dq = new LinkedList<>();

        public void add(int data){
            dq.addLast(data);
        }

        public int remove(){
            return dq.removeFirst();
        }

        public int peek(){
            return dq.getFirst();
        }
    }
    public static void main(String args[]){
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println("peek is: " + q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
    }    
}