//to reverse a stack
import java.util.*;
public class reverse_stack {
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

    public static void reverseStack(Stack<Integer> s){

        // stack is empty
        if(s.isEmpty()){
            return;
        }

        // store element which is being pop out
        int top = s.pop();
        // call for next 
        reverseStack(s);
        // push element at bottom
        pushAtBottom(s, top);
    }

    // print a stack
    public static void printStack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
       

        reverseStack(s);
        printStack(s);
    }    
}

