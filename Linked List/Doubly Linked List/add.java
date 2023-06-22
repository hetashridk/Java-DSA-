// add node at a specific position in  a doubly LinkedList
public class add {
    public static class DoublyLinkedList{
        public static class Node{
            int data;
            Node prev;
            Node next;

            public Node(int data){
                this.data = data;
                this.next = next;
                this.prev = null;
            }
        }
        public static Node head;
        public static Node tail;
        public static int size;


        //print
        public void print(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + "<->");
                temp = temp.next;
            }
            System.out.println("null");
        }


        // addFirst
        public void addFirst(int data){
            // Creation of newNode
            Node newNode = new Node(data);
            size++;

            // if LinkedList is empty
            if(head == null){
                head = tail = newNode;
                return;
            }

            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }


        // remove first
        public int removeFirst(){
            // if LinkedList is empty
            if(head == null){
                System.out.print("DoublyLinkedList is empty.");
                return Integer.MIN_VALUE;
            }

            // if there is only one node
            if(size == 1){
                int val = head.data;
                head = tail = null;
                size--;
                return val;
            }

            int val = head.data;
            head = head.next;
            head.prev = null;
            size--;
            return val;
        }


        // add_last
        public void addLast(int data){
            Node newNode = new Node(data);
            size++;

            if(head == null){
                head = tail = null;
                return;
            }
            tail.next = newNode;
            newNode.next = null;
            tail = newNode;
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
            size++;
        }
    }
    public static void main(String args[]){
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.addFirst(4);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.print();
        System.out.println(dll.size);

        dll.add(2, 3);
        dll.print();
        System.out.println(dll.size);

       
    }    
}