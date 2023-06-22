// implementation of queue using 2 stack using 2md method
import java.util.*;
public class using_2_stack_1 {
    public static class Queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty(){
            return s1.isEmpty();
        }

        // add
        public static void add(int data){
            if(!s1.isEmpty()){
                s1.add(data);
            }//else{

            // }
        }

        // remove
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is isEmpty");
                return -1;
            }

            int top = -1;
            if(!s1.isEmpty()){
                while(!s1.isEmpty()){
                    s1.pop();
                    if(s1.isEmpty()){
                        break;
                    }
                    s2.add(top);
                }
            }else{
                while(!s1.isEmpty()){
                    s1.pop();
                    if(s1.isEmpty()){
                        break;
                    }
                    s2.add(top);
                }
            }
            return top;
        }

        // peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is isEmpty");
                return -1;
            }

            int top = -1;
            if(!s1.isEmpty()){
                while(!s1.isEmpty()){
                    top = s1.pop();
                    s2.add(top);
                }
            }else{
                while(!s1.isEmpty()){
                    top = s1.pop();
                    s2.add(top);
                }
            }
            return top;
        }

    }
    public static void main(String args[]){
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }    
}