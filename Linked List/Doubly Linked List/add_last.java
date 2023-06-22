// add end/last  element in  a doubly LinkedList
public class add_last {
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
    }
    public static void main(String args[]){
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.print();
        System.out.println(dll.size);

        dll.removeFirst();
        dll.print();
        System.out.println(dll.size);

        dll.addLast(4);
        dll.print();
        System.out.println(dll.size);
    }    
}