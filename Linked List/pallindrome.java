// check LinkedList is pallindrome or not
public class pallindrome {
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

        // remove node from last/end
        public int removeLast(){
            
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

            Node prev = head;
            // to trace prev/find previous node from tail
            for(int i = 0; i < size - 2; i++){
                prev = prev.next;
            }

            // once we get previous delete tail
            int val = prev.next.data ;//or tail.data
            prev.next = null;
            tail = prev;
            size--;
            return val;
        }

        // search using loop/iterater
        public int itrSearch(int key){
            Node temp = head;
            int i = 0;

            while(temp != null){

                // key found
                if(temp.data == key){
                    return i;
                }
                temp = temp.next;
                i++;
            }
            // key not found
            return -1;
        }   

        // serach key using recursion
        public int helper(Node head, int key){
            // base case
            if(head == null){
                return -1;       //key doesn't exist
            }

            if(head.data == key){
                return 0;
            }
            int index = helper(head.next, key);
            if(index == -1){
                return -1;
            }
            return index + 1;
        }

        // as recSearch function as only key as a parameter.. and we have to change the headso have to make helper function.
        public int recSearch(int key){
            return helper(head, key);

        }

        // reverse a LinkedList
        public void reverse(){

            // declare 3 var
            // intialize 2 var
            Node prev = null;
            Node curr = tail = head;
            Node next;

            while(curr != null){

                // 4 steps
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            head = prev;
        }
        

        // find and remove nth node from end
        public void removeNthNodeFromEnd(int n){

            // calculate the size
            int sz = 0;
            Node temp = head;
            while(temp != null){
                temp = temp.next;
                sz++;
            }

            // if have to delete head only
            // n = 0, sz = 0
            if(n == sz){
                head = head.next;   // or removeFirst
                return;
            }

            // size - n that is firnd previous
            int i = 1;
            Node prev = head;
            int iToFind = sz - n;
            while(i < iToFind){
                prev = prev.next;
                i++;
            }

            // point to prev.next.next
            prev.next = prev.next.next;
            return;
        }


        // check LinkedList is pallindrome or not
        // using slow - fast approch to find mid
        public Node findMid(Node head){
            Node slow = head;
            Node fast = head;

            // condition for odd and even
            while(fast != null && fast.next!= null){

                // update slow and fast
                slow = slow.next;  //+1
                fast = fast.next.next;  //+2
            }
            return slow; //slow is my midNode
        }
        public boolean isPallindrome(){

            // base case
            if(head == null || head.next == null){
                return true;
            }

            // step 1:- find midNode
            Node midNode = findMid(head);

            // step 2:- reverse 2nd half
            Node prev = null;
            Node curr = midNode;
            Node next;

            while(curr != null){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            Node right = prev;  //right half no head
            Node left = head;

            // step 3:- check left and right
            while(right != null){
                if(left.data != right.data){
                    return false;
                }
                // update left and right
                left = left.next;
                right = right.next;
            }
            return true;
        }
    }
    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(3);
        // ll.addLast(4);
        // ll.add(2, 9);
        // ll.print();

        // ll.removeFirst();
        // ll.print();

        // ll.removeLast();
        // ll.print();
        // System.out.println("Size is :" + ll.size);

        // System.out.println("search key index using loop/iterative is: " + ll.itrSearch(3));
        // System.out.println("search key index using loop/iterative is: " + ll.itrSearch(10));
        // System.out.println("search key index recursion is: " + ll.itrSearch(3));
        // System.out.println("search key index recursion is: " + ll.itrSearch(10));

        // ll.reverse();
        // System.out.print("reverse LinkedList is: ");
        // ll.print();

        // ll.removeNthNodeFromEnd(2);
        // System.out.print("After removing 2nd node from last LinkedList is:  ");
        // ll.print();


        ll.addFirst(1);
        ll.addLast(2);
        // ll.addLast(3);
        ll.addLast(1);
        ll.print();
        System.out.println(ll.isPallindrome());
        
    }    
}