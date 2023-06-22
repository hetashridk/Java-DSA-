// implementing stack using arraylist
import java.util.ArrayList;
public class by_al {
    static class Stack{

        // creting ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        // check if stack is empty or not
        public boolean isEmpty(){
            return list.size() == 0;           //if Stack is empty returns true
        }                                      //if stack is not empty return false

        // push function/method
        public void push(int data){
            list.add(data);                  //TC = O(1)
        }

        // pop function/method
        public int pop(){
            //if stack is empty returns -1
            if(isEmpty()){
                return -1;
            }
            // to store the deleted element
            int top = list.get(list.size() - 1);          //last index of list = list.size() - 1
            list.remove(list.size() - 1);
            return top;
        }

        //peep function/method
        public int peek(){
            //if stack is empty returns -1
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size() - 1);            // that is return top element
        }
    }
    public static void main(String args[]){
        Stack s = new Stack();

        // add element in the Stack s
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while(!s.isEmpty()){
            System.out.println(s.peek());     //to print the element
            s.pop();      //to remove/delete the element which is being printed
        }
    }    
}