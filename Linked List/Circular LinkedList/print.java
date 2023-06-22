// print node in  a circular LinkedList
public class print {
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

       
    }
    public static void main(String args[]){
    }    
}