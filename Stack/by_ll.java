// implementing stack using linkedlist

public class by_ll {
    static class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Stack{

        static Node head = null;

        // check if stack is empty or not
        public static boolean isEmpty(){
            return head == null;           //if Stack is empty returns true
        }                                      //if stack is not empty return false

        // push function/method
        public static void push(int data){
            Node newNode = new Node(data);                  //TC = O(1)
            // if empty then add element as head
            if(isEmpty()){
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        }

        // pop function/method
        public static int pop(){
            //if stack is empty returns -1
            if(isEmpty()){
                return -1;
            }
            // to store the deleted element
            int top = head.data;          
            head = head.next;
            return top;
        }

        //peep function/method
        public static int peek(){
            //if stack is empty returns -1
            if(isEmpty()){
                return -1;
            }
            return head.data;            // that is return top element
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