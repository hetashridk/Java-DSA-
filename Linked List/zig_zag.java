public class zig_zag {
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



        // add node at first
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



        // add node at last
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



        // zig-zig_zag
        public void zigzag(){

            // step 1:-find mid
            Node slow = head;
            Node fast = head.next;

            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
            Node mid = slow;

            // step 2:- reverse 2nd half
            Node curr = mid.next;
            mid.next = null;
            Node prev = null;
            Node next;

            while(curr != null){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

            // step 3:- alternate merging / zig_zag
            Node LH = head;
            Node RH = prev;
            Node nextL;
            Node nextR;

            while(LH != null && RH != null){
                // to do in zig zag form
                nextL = LH.next;
                LH.next = RH;
                nextR = RH.next;
                RH.next = nextL;

                // update
                LH = nextL;
                RH = nextR;
            }
        }

    }
    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.print();
        ll.zigzag();
        ll.print();
    }    
}

