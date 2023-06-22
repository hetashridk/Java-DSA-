// remove node from first/start
public class remove_first {
    public static class LinkedList{
        public static class Node{
            int data;
            Node next;

            public Node(int data){
                this.data = data;
                this.next = next;
            }
        }

        // declaration
        public static Node head;
        public static Node tail;
        public static int size;

        // create add first element method
        public void addFirst(int data){
            size++;

            //step 1:- Creation of a new node
            Node newNode = new Node(data);

            // if LinkedList is empty
            if(head == null){
                head = tail = newNode;
                return;
            }

            // step 2:- newNode next's = head
            newNode.next = head;

            // step 3:- head = newNode
            head = newNode;
        }

        // create add last element method
        public void addLast(int data){
            size++;

            //step 1:- Creation of a new node
            Node newNode = new Node(data);

            // if LinkedList is empty
            if(head == null){
                head = tail = newNode;
                return;
            }

            // step 2:- tail next's = newNode
            tail.next = newNode;

            // step 3:- tail = newNode
            tail = newNode;
        }

        // create print method
        public void print(){
            // step 1:- Node temp = head;
            Node temp = head;

            // if LinkedList is empty
            if(head == null){
                System.out.println("LinkedList doesn't exist.");
                return;
            }

            // step 2:- print(temp.data)
            while(temp != null){
                System.out.print(temp.data + "->");
                // step 3: update temp
                temp = temp.next;
            }
            System.out.println("null");
        }

        // add the node after a given index
        public void add(int index, int data){
            // step 1:- create new node
            Node newNode = new Node(data);

            int i = 0;
            if(index == 0){
                addFirst(data);
                return;
            }

            size++;

            // assign temp as head
            Node temp = head;

            // update temp and find prev
            while(i < index - 1){
                temp = temp.next;
                i++;
            }

            // add node after node
            newNode.next = temp.next;
            temp.next = newNode;
        }

        // remove node from first/start
        public int removeFirst(){

            // if LinkedList is null
            if(size == 0){
                System.out.println("LinkedList is empty");
                return Integer.MIN_VALUE;
            }

            // if there is one node
            else if(size == 1){
                int val = head.data;
                head = tail = null;
                size = 0;
                return val;
            }

            int val = head.data;
            head = head.next;
            size--;
            return val;
        }
    }
    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.add(2, 9);
        ll.removeFirst();
        ll.print();
        System.out.println(ll.size);
    }    
}