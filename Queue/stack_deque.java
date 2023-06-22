// implementation of stack using deque
import java.util.*;
public class stack_deque {
    static class Stack{
        Deque<Integer> dq = new LinkedList<>();

        public void add(int data){
            dq.addLast(data);
        }

        public int remove(){
            return dq.removeLast();
        }

        public int peek(){
            return dq.getLast();
        }
    }
    public static void main(String args[]){
        Stack s = new Stack();
        s.add(1);
        s.add(2);
        s.add(3);
        System.out.println("peek is: " + s.peek());
        System.out.println(s.remove());
        System.out.println(s.remove());
        System.out.println(s.remove());
    }    
}