// implementation of queue using java collection frameworks (JCF)
import java.util.*;
public class using_JCF {
    public static void main(String args[]){
        Queue<Integer> q = new LinkedList<>();  //or Queue<Integer> q = new ArrayDeque<>();
        // as queue is interface
        // we can make obejct of interface
        // Queue can be made in java using two class only
        // 1) using LinkedList class
        // 2) using ArrayDeque class

        // TC of all three operations that is add, remove, peek is O(1)
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }    
}