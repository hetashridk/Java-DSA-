// implementation of queue using array
public class using_array {
    public static class Queue{
        static int arr[];
        static int size;
        static int rear;

        // we dont't have to declare front as it is not changing but rear is changing

        Queue(int n){    //n = size of array
            arr = new int[n];
            rear = -1;
            size = n;
        }

        public static boolean isEmpty(){
            return rear == -1;
        }

        // add
        public static void add(int data){
            if(rear == size - 1){
                System.out.print("Queue is full.");
                return;
            }
            rear = rear + 1;
            arr[rear] = data;
        }

        // remove
        public static int remove(){
            if(isEmpty()){
                System.out.print("Queue is empty");
                return -1;
            }
            for(int i = 0; i < rear; i++){

                // shifting
                arr[i] = arr[i + 1];
            }
            rear = rear - 1;
            int front = arr[0];
            return front;
        }

        // peek
        public static int peek(){
            if(isEmpty()){
                System.out.print("Queue is empty");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String args[]){
        Queue q = new Queue(5);    //5 is the size of queue
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }    
}