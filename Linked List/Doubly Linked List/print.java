// print a doubly LinkedList
public class print {
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
    }
    public static void main(String args[]){
       
    }    
}