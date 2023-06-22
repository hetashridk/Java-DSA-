// implementation of queue using linked list
public class using_ll {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static class Queue{
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty(){
            return head == null && tail == null;
        }

        // add
        // TC = O(1);
        public static void add(int data){
            // making of newNode
            Node newNode = new Node(data);

            // if linked list is empty and first element adding
            if(head == null){
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        // remove
        // TC = O(1)
        public static int remove(){
            if(isEmpty()){
                System.out.print("Queue is empty");
                return -1;
            }

            // to store the deleted node
            int front = head.data;
            // if there is only single element in linked list
            if(head == tail){
                head = tail = null;
            }
            else{
                head = head.next;
            }
            return front;
            
        }

        // peek
        // TC = O(1)
        public static int peek(){
            if(isEmpty()){
                System.out.print("Queue is empty");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String args[]){
        Queue q = new Queue();    //5 is the size of queue
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }    
}