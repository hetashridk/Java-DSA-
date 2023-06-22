// print in LinkedList
public class print {
    public static class LinkedList{
        public static class Node{
            int data;
            Node next;

            public Node(int data){
                this.data = data;
                this.next = next;
            }
        }
        public static Node head;
        public static Node tail;

        // create add first element method
        public void addFirst(int data){

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
    }
    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();
    }    
}