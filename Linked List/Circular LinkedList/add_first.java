// add first/start element in  a circular LinkedList
public class add_first {
    public static class CircularLinkedList{
        public static class Node{
            int data;
            Node next;

            public Node(int data){
                this.data = data;
            }
        }
        public static Node head;
        public static Node tail;
        public static int size;


         // print a CircularLinkedList
        public void print(){
            Node temp = head;
            if(temp != null){
                do{
                    System.out.print(temp.data + "->");
                    temp = temp.next;
                }while(temp != head);
            }
            System.out.println("head");
        }


        // add first element in a circular LinkedList
        public void addFirst(int data){
            // step 1:- Creation of new node
            Node newNode = new Node(data);
            size++;

            if(head == null){
                head = tail = newNode;
                return;
            }

            tail.next = newNode;
            newNode.next = head;
            head = newNode;
        }
    }
    public static void main(String args[]){
        CircularLinkedList cll = new CircularLinkedList();
        cll.addFirst(3);
        cll.addFirst(2);
        cll.addFirst(1);
        cll.print();
        System.out.println(cll.size);
    }    
}