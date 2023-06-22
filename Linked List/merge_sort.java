// merge sort in LinkedList
public class merge_sort {
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




        // merging a LinkedList

        // step 1:- find mid
        private Node getMid(Node head){    //we can made public too
            Node slow = head;
            Node fast = head.next;

            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;    //mid node
        }

        // step 3:- merge the left half and right half
        private Node merge(Node head1, Node head2){      //head1 = left no head.  head2 = right no head
            Node mergedll = new Node(-1);
            Node temp = mergedll;

            // compare node
            while(head1 != null && head2 != null){
                if(head1.data <= head2.data){
                    temp.next = head1;
                    head1 = head1.next;
                    temp = temp.next;
                }
                else{
                    temp.next = head2;
                    head2 = head2.next;
                    temp = temp.next;
                }
            }

            // if any node is left
            while(head1 != null){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            while(head2 != null){
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
            return mergedll.next;
        }

        public Node mergeSort(Node head){

            // base case
            if(head == null || head.next == null){
                return head;
            }

            // step 1:- find mid
            Node mid = getMid(head);

            // step 2:- divide into half and call for mergeSort
            Node rightHead = mid.next;
            mid.next = null;
            Node newLeft = mergeSort(head);
            Node newRight = mergeSort(rightHead);

            // step 3:- merge the left half and right half
            return merge(newLeft, newRight);
        }
    }
    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(6);
        ll.addLast(3);
        ll.addLast(5);
        ll.addLast(2);
        ll.print();

        ll.head = ll.mergeSort(ll.head);
        ll.print();
    }    
}