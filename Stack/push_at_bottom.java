//Push element at bottom of stack
import java.util.*;
public class push_at_bottom {
    public static void pushAtBottom(Stack<Integer> s, int data){
        // if stack is empty push data
        if(s.isEmpty()){
            s.push(data);
            return;
        }

        // store data as it is being removed or delete
        int top = s.pop();
        // recursion:- as we have to do same for all other element
        pushAtBottom(s, data);
        // as the element was being removed before have push/add now after the element have push at bottom
        s.push(top);

    }
    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);

        pushAtBottom(s, 7);


        // to verify
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }    
}