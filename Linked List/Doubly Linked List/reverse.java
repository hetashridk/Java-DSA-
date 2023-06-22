// reverse a doubly LinkedList
public class reverse {
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


        // reverse a DoublyLinkedList
        public void reverse(){
            Node curr = head;
            Node prev = null;
            Node next;

            while(curr != null){
                next = curr.next;
                curr.next = prev;
                curr.prev = next;
                prev = curr;
                curr = next;
            }
            head = prev;
        }
    }
    public static void main(String args[]){
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.print();
       
        dll.reverse();
        dll.print();
    }    
}